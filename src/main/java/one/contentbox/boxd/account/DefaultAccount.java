package one.contentbox.boxd.account;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import one.contentbox.boxd.BoxdException;
import one.contentbox.boxd.crypto.Ripemd160;
import one.contentbox.boxd.util.ArrayUtils;
import one.contentbox.boxd.util.SecureRandomUtils;
import org.bitcoinj.core.Base58;
import org.bitcoinj.core.ECKey;
import org.bitcoinj.core.Sha256Hash;
import org.bitcoinj.core.Utils;
import org.bouncycastle.crypto.generators.SCrypt;
import org.bouncycastle.util.encoders.Hex;
import org.web3j.crypto.CipherException;
import org.web3j.crypto.ECKeyPair;
import org.web3j.crypto.Hash;
import org.web3j.crypto.Keys;
import org.web3j.utils.Numeric;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

@Slf4j
public class DefaultAccount extends Account {

    @Override
    public byte[] dumpPubKeyHash(String privKey) throws BoxdException{
        validPrivKey(privKey);
        byte[] pk = dumpPubKey(privKey);
        return Ripemd160.getHash(pk);
    }

    @Override
    public byte[] dumpPubKey(String privKey) throws BoxdException{
        validPrivKey(privKey);
        ECKey ecKey = toECKeyFromPrivKey(Hex.decode(privKey));
        return ecKey.getPubKey();
    }

    @Override
    public byte[] sign(byte[] txBytes, String privKey) {
        return sign(txBytes, Hex.decode(privKey));
    }

    @Override
    public byte[] sign(byte[] txBytes, byte[] privKeyBytes) {
        ECKey ecKey = toECKeyFromPrivKey(privKeyBytes);
        Sha256Hash sha256Hash = Sha256Hash.wrap(txBytes);
        ECKey.ECDSASignature signature = ecKey.sign(sha256Hash);
        return signature.encodeToDER();
    }


    private static final int N_STANDARD = 1 << 18;
    private static final int P_STANDARD = 1;

    private static final int R = 8;
    private static final int DKLEN = 32;

    private static final String CIPHER = "aes-128-ctr";
    private static final String AES_128_CTR = "pbkdf2";
    private static final String SCRYPT = "scrypt";

    @Override
    public boolean newAccount(String passphrase, String keyStoreFilePath)
            throws FileAlreadyExistsException, Exception {

        if(passphrase == null || "".equalsIgnoreCase(passphrase)){
            throw new BoxdException(-1, "Passphrase must't be empty");
        }

        if(keyStoreFilePath == null || "".equalsIgnoreCase(keyStoreFilePath)){
            throw new BoxdException(-1, "KeyStoreFilePath mustn't be empty");
        }

        File file = new File(keyStoreFilePath);
        if (file.exists()) {
            throw new FileAlreadyExistsException("KeyStoreFile already exists");
        }

        ECKeyPair ecKeyPair = Keys.createEcKeyPair();
        KeyStoreFile keyStoreFile = create(passphrase, ecKeyPair, N_STANDARD, P_STANDARD);

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(file, keyStoreFile);
        return false;
    }

    KeyStoreFile create(String password, ECKeyPair ecKeyPair, int n, int p) throws CipherException{
        byte[] salt = generateRandomBytes(32);

        byte[] deribedKey = generateDerivedScryptKey(password.getBytes(), salt, n, R, p, DKLEN);

        byte[] encryptKey = Arrays.copyOfRange(deribedKey, 0, 16);

        byte[] iv = generateRandomBytes(16);

        byte[] privateKeyBytes = Numeric.toBytesPadded(ecKeyPair.getPrivateKey(), 32);

        byte[] cipherText = performCipherOperation(Cipher.ENCRYPT_MODE, iv, encryptKey, privateKeyBytes);

        byte[] mac = generateMac(deribedKey, cipherText);

        String addr = dumpAddrFromPrivKey(privateKeyBytes);

        KeyStoreFile keyStoreFile = new KeyStoreFile();
        keyStoreFile.setId("");
        keyStoreFile.setAddress(addr);

        KeyStoreFile.Cryto cryto = new KeyStoreFile.Cryto();

        cryto.setCiphertext(Numeric.toHexStringNoPrefix(cipherText));
        cryto.setCipher(CIPHER);


        KeyStoreFile.Cipherparams cipherparams = new KeyStoreFile.Cipherparams();
        cipherparams.setIv(Numeric.toHexStringNoPrefix(iv));

        cryto.setCipherparams(cipherparams);

        cryto.setMac(Numeric.toHexStringNoPrefix(mac));


        KeyStoreFile.Kdfparams kdfparams = new KeyStoreFile.Kdfparams();
        kdfparams.setSalt(Numeric.toHexStringNoPrefix(salt));
        kdfparams.setDklen(DKLEN);
        kdfparams.setN(n);
        kdfparams.setP(p);
        kdfparams.setR(R);

        cryto.setKdfparams(kdfparams);

        keyStoreFile.setCrypto(cryto);

        return keyStoreFile;
    }

    private static byte[] generateMac(byte[] derivedKey, byte[] cipherText) {
        byte[] result = new byte[16 + cipherText.length];

        System.arraycopy(derivedKey, 16, result, 0, 16);
        System.arraycopy(cipherText, 0, result, 16, cipherText.length);

        return Hash.sha3(result);
    }

    private static byte[] performCipherOperation(
            int mode, byte[] iv, byte[] encryptKey, byte[] text) throws CipherException {
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(iv);
            Cipher cipher = Cipher.getInstance("AES/CTR/NoPadding");

            SecretKeySpec secretKeySpec = new SecretKeySpec(encryptKey, "AES");
            cipher.init(mode, secretKeySpec, ivParameterSpec);
            return cipher.doFinal(text);
        } catch (NoSuchPaddingException | NoSuchAlgorithmException
                | InvalidAlgorithmParameterException | InvalidKeyException
                | BadPaddingException | IllegalBlockSizeException e) {
            throw new CipherException("Error performing cipher operation", e);
        }
    }

    private static byte[] generateDerivedScryptKey(
            byte[] password, byte[] salt, int n, int r, int p, int dkLen) {
        return SCrypt.generate(password, salt, n, r, p, dkLen);
    }

    private static byte[] generateRandomBytes(int size) {
        byte[] bytes = new byte[size];
        SecureRandomUtils.secureRandom().nextBytes(bytes);
        return bytes;
    }

    @Override
    public String dumpPrivKeyFromKeyStore(String file, String passphrase)
            throws FileNotFoundException, BoxdException {
        return dumpPrivKeyFromKeyStore(new File(file), passphrase);
    }

    @Override
    public String dumpPrivKeyFromKeyStore(File file, String passphrase)
            throws FileNotFoundException, BoxdException{

        if(passphrase == null || "".equalsIgnoreCase(passphrase)){
            throw new BoxdException(-1, "Passphrase must't be empty");
        }

        if(!file.exists()){
            throw new FileNotFoundException("KeyStore file is not exists");
        }
        try {
            byte[] bytes = passphrase.getBytes();

            ObjectMapper objectMapper = new ObjectMapper();
            KeyStoreFile keyStoreFile = objectMapper.readValue(file, KeyStoreFile.class);
            // validate
            KeyStoreFile.Cryto cryto = keyStoreFile.getCrypto();

            byte[] iv = Hex.decode(cryto.getCipherparams().getIv());
            byte[] cipherText = Hex.decode(cryto.getCiphertext());

            KeyStoreFile.Kdfparams kdfparams = cryto.getKdfparams();
            int dklen = kdfparams.getDklen();
            int n = kdfparams.getN();
            int p = kdfparams.getP();
            int r = kdfparams.getR();
            byte[] salt = Hex.decode(kdfparams.getSalt());
            byte[] derivedKey = SCrypt.generate(bytes, salt, n, r, p, dklen);

            byte[] result = new byte[16 + cipherText.length];
            System.arraycopy(derivedKey, 16, result, 0, 16);
            System.arraycopy(cipherText, 0, result, 16, cipherText.length);

            byte[] encryptKey = Arrays.copyOfRange(derivedKey, 0, 16);
            IvParameterSpec ivParameterSpec = new IvParameterSpec(iv);
            Cipher cipher = Cipher.getInstance("AES/CTR/NoPadding");

            SecretKeySpec secretKeySpec = new SecretKeySpec(encryptKey, "AES");
            cipher.init(Cipher.DECRYPT_MODE, secretKeySpec, ivParameterSpec);
            byte[] privateKey = cipher.doFinal(cipherText);

            String addr = dumpAddrFromPrivKey(privateKey);
            if(addr == null || "".equalsIgnoreCase(addr)){
                throw new BoxdException(-1, "Passphrase doesn't match key store");
            }

            if(!addr.equalsIgnoreCase(keyStoreFile.getAddress())){
                throw new BoxdException(-1, "Passphrase doesn't match key store");
            }

            return Hex.toHexString(privateKey);
        } catch (IOException| NoSuchAlgorithmException | NoSuchPaddingException
                |InvalidAlgorithmParameterException | InvalidKeyException
                | BadPaddingException | IllegalBlockSizeException e) {
            throw new BoxdException(-1, e.getMessage());
        }
    }

    @Override
    public String dumpAddrFromPrivKey(String privKeyHex) {
        return dumpAddrFromPrivKey(Hex.decode(privKeyHex));
    }

    @Override
    public String dumpPubKeyFromPrivKey(String privKeyHex) {
        byte[] bytes = Hex.decode(privKeyHex);
        return dumpPubKeyFromPrivKey(bytes);
    }

    @Override
    public String dumpPubKeyHashFromPrivKey(String privKeyHex) {
        byte[] bytes = Hex.decode(privKeyHex);
        return dumpPubKeyHashFromPrivKey(bytes);
    }

    @Override
    public String dumpAddrFromPrivKey(byte[] privKeyBytes) {
        ECKey ecKey = toECKeyFromPrivKey(privKeyBytes);
        return getAddrFromPubKey(ecKey.getPubKey());
    }

    @Override
    public String dumpPubKeyFromPrivKey(byte[] privKeyBytes) {
        ECKey ecKey = toECKeyFromPrivKey(privKeyBytes);
        return ecKey.getPublicKeyAsHex();
    }

    @Override
    public String dumpPubKeyHashFromPrivKey(byte[] privKeyBytes) {
        ECKey ecKey = toECKeyFromPrivKey(privKeyBytes);
        return Hex.toHexString(Ripemd160.getHash(ecKey.getPubKey()));
    }

    private ECKey toECKeyFromPrivKey(byte[] bytes) {
        return ECKey.fromPrivate(bytes);
    }

    private String getAddrFromPubKey(byte[] pubKey) {
        byte[] pub = Utils.sha256hash160(pubKey);
        // prefix
        byte[] prefix = {0x13, 0x26};

        // checksum
        byte[] all = ArrayUtils.join(prefix, pub);

        byte[] checksumAll = Sha256Hash.hash(Sha256Hash.hash(all));
        byte[] checksum = new byte[4];
        System.arraycopy(checksumAll, 0, checksum, 0, 4);


        byte[] tmp = ArrayUtils.join(prefix, pub);
        byte[] content = ArrayUtils.join(tmp, checksum);

        String addr = Base58.encode(content);
        return addr;
    }

    boolean validPrivKey(String privKey) throws BoxdException{
        if (privKey == null || "".equalsIgnoreCase(privKey)){
            throw new BoxdException(-1, "Private key mustn't be empty");
        }
        return true;
    }

}
