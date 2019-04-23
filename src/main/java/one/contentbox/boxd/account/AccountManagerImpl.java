package one.contentbox.boxd.account;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lambdaworks.crypto.SCrypt;
import lombok.extern.slf4j.Slf4j;
import one.contentbox.boxd.crypto.hash.Hash;
import one.contentbox.boxd.crypto.keystore.ECKeyPair;
import one.contentbox.boxd.crypto.keystore.Keys;
import one.contentbox.boxd.crypto.secp256k1.Secp256k1;
import one.contentbox.boxd.crypto.util.Utils;
import one.contentbox.boxd.exception.BoxdException;
import one.contentbox.boxd.util.AddressUtils;
import org.bouncycastle.util.encoders.Hex;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.FileAlreadyExistsException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

@Slf4j
public class AccountManagerImpl implements AccountManager {

    private static final int N_STANDARD = 1 << 18;
    private static final int P_STANDARD = 1;

    private static final int R = 8;
    private static final int DKLEN = 32;

    private static final String CIPHER = "aes-128-ctr";

    @Override
    public String dumpAddrFromPrivKey(String privKey) throws BoxdException {
        byte[] pubKey = dumpPubKeyFromPrivKey(privKey);
        return AddressUtils.getAddrFromPubKey(pubKey);
    }

    @Override
    public String dumpAddrFromPrivKey(byte[] privKeyBytes) throws BoxdException {
        return dumpAddrFromPrivKey(Hex.toHexString(privKeyBytes));
    }

    @Override
    public boolean dumpKeyStoreFromPrivKey(String privKey, String password, String path)
            throws FileAlreadyExistsException, BoxdException {
        if (password == null || "".equalsIgnoreCase(password)) {
            throw new BoxdException(-1, "Passphrase must't be empty");
        }

        if (path == null || "".equalsIgnoreCase(path)) {
            throw new BoxdException(-1, "KeyStoreFilePath mustn't be empty");
        }

        File file = new File(path);
        if (file.exists()) {
            throw new FileAlreadyExistsException("KeyStoreFile already exists");
        }

        try {
            ECKeyPair ecKeyPair = ECKeyPair.create(Hex.decode(privKey));
            KeyStore keyStoreFile = toKeyStore(password, ecKeyPair, N_STANDARD, P_STANDARD);

            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.writeValue(file, keyStoreFile);
        }catch (Exception e){
            throw new BoxdException(-1, "Dump keystore from private key error, " + e.getMessage());
        }
        return true;
    }

    @Override
    public byte[] dumpPubKeyHashFromPrivKey(byte[] privKey) throws BoxdException {
        byte[] pubKey = dumpPubKeyFromPrivKey(privKey);
        return Hash.Ripemd160(pubKey);
    }

    @Override
    public byte[] dumpPubKeyHashFromPrivKey(String privKey) throws BoxdException {
        return dumpPubKeyFromPrivKey(Hex.decode(privKey));
    }

    @Override
    public byte[] dumpPubKeyFromPrivKey(String privKey) throws BoxdException {
       return dumpPubKeyFromPrivKey(Hex.decode(privKey));
    }

    @Override
    public byte[] dumpPubKeyFromPrivKey(byte[] privKey) throws BoxdException {
        return Secp256k1.PublicFromPrivateKey(privKey);
    }

    @Override
    public String dumpPrivKeyFromKeyStore(String file, String passphrase) throws FileNotFoundException, BoxdException {
        return dumpPrivKeyFromKeyStore(new File(file), passphrase);
    }

    @Override
    public String dumpPrivKeyFromKeyStore(File file, String passphrase) throws FileNotFoundException, BoxdException {
        if(passphrase == null || "".equalsIgnoreCase(passphrase)){
            throw new BoxdException(-1, "Passphrase must't be empty");
        }

        if(!file.exists()){
            throw new FileNotFoundException("KeyStore file is not exists");
        }
        try {
            byte[] bytes = passphrase.getBytes();

            ObjectMapper objectMapper = new ObjectMapper();
            KeyStore keyStoreFile = objectMapper.readValue(file, KeyStore.class);
            // validate
            KeyStore.Cryto cryto = keyStoreFile.getCrypto();

            byte[] iv = Hex.decode(cryto.getCipherparams().getIv());
            byte[] cipherText = Hex.decode(cryto.getCiphertext());

            KeyStore.Kdfparams kdfparams = cryto.getKdfparams();
            int dklen = kdfparams.getDklen();
            int n = kdfparams.getN();
            int p = kdfparams.getP();
            int r = kdfparams.getR();
            byte[] salt = Hex.decode(kdfparams.getSalt());
            byte[] derivedKey = null;
            try {
                derivedKey = SCrypt.scrypt(bytes, salt, n, r, p, dklen);
            }catch (Exception e){
                throw new BoxdException(-1, "Create keystore err : " + e.getMessage());
            }

            byte[] exspectMac  = generateMac(derivedKey, cipherText);
            if(!Arrays.equals(exspectMac, Hex.decode(cryto.getMac()))){
                throw new BoxdException(-1, "Passphrase doesn't match key store");
            }

            byte[] encryptKey = Arrays.copyOfRange(derivedKey, 0, 16);

            IvParameterSpec ivParameterSpec = new IvParameterSpec(iv);
            Cipher cipher = Cipher.getInstance("AES/CTR/NoPadding");

            SecretKeySpec secretKeySpec = new SecretKeySpec(encryptKey, "AES");
            cipher.init(Cipher.DECRYPT_MODE, secretKeySpec, ivParameterSpec);
            byte[] privateKey = cipher.doFinal(cipherText);

            return Hex.toHexString(privateKey);
        } catch (IOException | NoSuchAlgorithmException | NoSuchPaddingException
                |InvalidAlgorithmParameterException | InvalidKeyException
                | BadPaddingException | IllegalBlockSizeException e) {
            throw new BoxdException(-1, e.getMessage());
        }
    }

    @Override
    public byte[] dumpPubKeyHashFromAddr(String addr) throws BoxdException {
        return AddressUtils.getPubKeyHashFromAddr(addr);
    }

    @Override
    public boolean newAccount(String passphrase, String keyStoreFilePath) throws FileAlreadyExistsException, BoxdException {
        if(passphrase == null || "".equalsIgnoreCase(passphrase)){
            throw new BoxdException(-1, "Passphrase mustn't be empty");
        }

        if(keyStoreFilePath == null || "".equalsIgnoreCase(keyStoreFilePath)){
            throw new BoxdException(-1, "KeyStoreFilePath mustn't be empty");
        }

        File file = new File(keyStoreFilePath);
        if (file.exists()) {
            throw new FileAlreadyExistsException("KeyStoreFile already exists");
        }

        try {
            ECKeyPair ecKeyPair = Keys.createEcKeyPair();
            KeyStore keyStoreFile = toKeyStore(passphrase, ecKeyPair, N_STANDARD, P_STANDARD);

            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.writeValue(file, keyStoreFile);
            return true;
        }catch (Exception e){
            throw new BoxdException(-1, "Create account error, " + e.getMessage());
        }
    }

    KeyStore toKeyStore(String password, ECKeyPair ecKeyPair, int n, int p) throws BoxdException {
        try {
            byte[] salt = generateRandomBytes(32);

            byte[] deribedKey = generateDerivedScryptKey(password.getBytes(Charset.forName("UTF-8")), salt, n, R, p, DKLEN);
            byte[] encryptKey = Arrays.copyOfRange(deribedKey, 0, 16);

            byte[] iv = generateRandomBytes(16);

            byte[] privateKeyBytes = ecKeyPair.getPrivateKey().toByteArray();

            byte[] cipherText = performCipherOperation(Cipher.ENCRYPT_MODE, iv, encryptKey, privateKeyBytes);

            byte[] mac = generateMac(deribedKey, cipherText);

            return createFile(ecKeyPair.getPublicKey().toByteArray(), salt, cipherText, iv, mac);
        }catch (Exception e){
            throw new BoxdException(-1, "Create KeyStore error, " + e.getMessage());
        }
    }

    private KeyStore createFile(byte[] pubKeyBytes,
                                byte[] salt, byte[] cipherText, byte[] iv, byte[] mac ) throws BoxdException {

        String addr = getAddrFromPubKey(pubKeyBytes);

        KeyStore keyStoreFile = new KeyStore();
        keyStoreFile.setId("");
        keyStoreFile.setAddress(addr);
        keyStoreFile.setVersion("0.1.0");

        KeyStore.Cryto cryto = new KeyStore.Cryto();

        cryto.setCiphertext(Hex.toHexString(cipherText));
        cryto.setCipher(CIPHER);

        KeyStore.Cipherparams cipherparams = new KeyStore.Cipherparams();
        cipherparams.setIv(Hex.toHexString(iv));
        cryto.setCipherparams(cipherparams);
        cryto.setMac(Hex.toHexString(mac));

        KeyStore.Kdfparams kdfparams = new KeyStore.Kdfparams();
        kdfparams.setSalt(Hex.toHexString(salt));
        kdfparams.setDklen(DKLEN);
        kdfparams.setN(N_STANDARD);
        kdfparams.setP(P_STANDARD);
        kdfparams.setR(R);
        cryto.setKdfparams(kdfparams);

        keyStoreFile.setCrypto(cryto);
        return keyStoreFile;
    }

    private String getAddrFromPubKey(byte[] pubKey) {
        return AddressUtils.getAddrFromPubKey(pubKey);
    }

    private byte[] generateMac(byte[] derivedKey, byte[] cipherText) {
        byte[] result = new byte[16 + cipherText.length];

        System.arraycopy(derivedKey, 16, result, 0, 16);
        System.arraycopy(cipherText, 0, result, 16, cipherText.length);

        return Hash.sha256(result);
    }

    private static byte[] performCipherOperation(
            int mode, byte[] iv, byte[] encryptKey, byte[] text) throws Exception {
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(iv);
            Cipher cipher = Cipher.getInstance("AES/CTR/NoPadding");

            SecretKeySpec secretKeySpec = new SecretKeySpec(encryptKey, "AES");
            cipher.init(mode, secretKeySpec, ivParameterSpec);
            return cipher.doFinal(text);
        } catch (NoSuchPaddingException | NoSuchAlgorithmException
                | InvalidAlgorithmParameterException | InvalidKeyException
                | BadPaddingException | IllegalBlockSizeException e) {
            throw new Exception("Error performing cipher operation", e);
        }
    }

    private static byte[] generateDerivedScryptKey(
            byte[] password, byte[] salt, int n, int r, int p, int dkLen) throws Exception{
        return SCrypt.scrypt(password, salt, n, r, p, dkLen);
    }

    private static byte[] generateRandomBytes(int size) {
        return Utils.RandomBytes(size);
    }
}
