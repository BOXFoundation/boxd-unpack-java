package one.contentbox.boxd.account;

import lombok.extern.slf4j.Slf4j;
import one.contentbox.boxd.crypto.secp256k1.Secp256k1;
import one.contentbox.boxd.exception.BoxdException;
import org.bouncycastle.util.encoders.Hex;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.FileAlreadyExistsException;

@Slf4j
public class AccountManagerImpl implements AccountManager {
    @Override
    public boolean dumpKeyStoreFromPrivKey(String privKey, String password, String path) throws FileNotFoundException, FileAlreadyExistsException, BoxdException {
        return false;
    }

    @Override
    public String dumpPrivKeyFromKeyStore(String file, String passphrase) throws FileNotFoundException, BoxdException {
        return null;
    }

    @Override
    public String dumpPrivKeyFromKeyStore(File file, String passphrase) throws FileNotFoundException, BoxdException {
        return null;
    }

    @Override
    public String dumpAddrFromPrivKey(String privKey) throws BoxdException {
        return null;
    }

    @Override
    public String dumpAddrFromPrivKey(byte[] privKeyBytes) throws BoxdException {
        return null;
    }

    @Override
    public byte[] dumpPubKeyHashFromPrivKey(byte[] privKey) throws BoxdException {
        return new byte[0];
    }

    @Override
    public byte[] dumpPubKeyHashFromPrivKey(String privKey) throws BoxdException {
        return new byte[0];
    }

    @Override
    public byte[] dumpPubKeyFromPrivKey(String privKey) throws BoxdException {
       return Secp256k1.PublicFromPrivateKey(Hex.decode(privKey));
    }

    @Override
    public byte[] dumpPubKeyFromPrivKey(byte[] privKey) throws BoxdException {
        return new byte[0];
    }

    @Override
    public boolean newAccount(String passphrase, String keyStoreFilePath) throws FileAlreadyExistsException, BoxdException {
        return false;
    }
    //    @Override
//    public byte[] dumpPubKeyHash(String privKey) throws BoxdException {
//        validPrivKey(privKey);
//        byte[] pk = dumpPubKey(privKey);
//        return Hash.Ripemd160(pk);
//    }
//
//    @Override
//    public byte[] dumpPubKey(String privKey) throws BoxdException{
//        validPrivKey(privKey);
//        ECKey ecKey = toECKeyFromPrivKey(Hex.decode(privKey));
//        return ecKey.getPubKey();
//    }
//
//    private static final int N_STANDARD = 1 << 18;
//    private static final int P_STANDARD = 1;
//
//    private static final int R = 8;
//    private static final int DKLEN = 32;
//
//    private static final String CIPHER = "aes-128-ctr";
//
//    @Override
//    public boolean newAccount(String passphrase, String keyStoreFilePath)
//            throws FileAlreadyExistsException, Exception {
//
//        if(passphrase == null || "".equalsIgnoreCase(passphrase)){
//            throw new BoxdException(-1, "Passphrase must't be empty");
//        }
//
//        if(keyStoreFilePath == null || "".equalsIgnoreCase(keyStoreFilePath)){
//            throw new BoxdException(-1, "KeyStoreFilePath mustn't be empty");
//        }
//
//        File file = new File(keyStoreFilePath);
//        if (file.exists()) {
//            throw new FileAlreadyExistsException("KeyStoreFile already exists");
//        }
//
//        ECKeyPair ecKeyPair = Keys.createEcKeyPair();
//        KeyStore keyStoreFile = create(passphrase, ecKeyPair, N_STANDARD, P_STANDARD);
//
//        ObjectMapper objectMapper = new ObjectMapper();
//        objectMapper.writeValue(file, keyStoreFile);
//        return true;
//    }
//
//    @Override
//    public boolean dumpKeystoreFromPrivKey(String privKey, String password, String path)
//            throws FileNotFoundException, FileAlreadyExistsException, BoxdException, Exception {
//
//        if(password == null || "".equalsIgnoreCase(password)){
//            throw new BoxdException(-1, "Passphrase must't be empty");
//        }
//
//        if(path  == null || "".equalsIgnoreCase(path)){
//            throw new BoxdException(-1, "KeyStoreFilePath mustn't be empty");
//        }
//
//        File file = new File(path);
//        if (file.exists()) {
//            throw new FileAlreadyExistsException("KeyStoreFile already exists");
//        }
//
//        ECKeyPair ecKeyPair = ECKeyPair.create(Hex.decode(privKey));
//        KeyStore keyStoreFile = create(password, ecKeyPair, N_STANDARD, P_STANDARD);
//
//        ObjectMapper objectMapper = new ObjectMapper();
//        objectMapper.writeValue(file, keyStoreFile);
//        return true;
//    }
//
//    KeyStore create(String password, ECKeyPair ecKeyPair, int n, int p) throws Exception {
//        byte[] salt = generateRandomBytes(32);
//
//        byte[] deribedKey = generateDerivedScryptKey(password.getBytes(Charset.forName("UTF-8")), salt, n, R, p, DKLEN);
//
//        byte[] encryptKey = Arrays.copyOfRange(deribedKey, 0, 16);
//
//        byte[] iv = generateRandomBytes(16);
//
//        byte[] privateKeyBytes = ecKeyPair.getPrivateKey().toByteArray();
//
//        byte[] cipherText = performCipherOperation(Cipher.ENCRYPT_MODE, iv, encryptKey, privateKeyBytes);
//
//        byte[] mac = generateMac(deribedKey, cipherText);
//
//        return createFile(privateKeyBytes, salt, cipherText, iv, mac);
//    }
//
//    private KeyStore createFile(byte[] privateKeyBytes,
//                                byte[] salt, byte[] cipherText, byte[] iv, byte[] mac ) {
//
//        String addr = dumpAddrFromPrivKey(privateKeyBytes);
//
//        KeyStore keyStoreFile = new KeyStore();
//        keyStoreFile.setId("");
//        keyStoreFile.setAddress(addr);
//        keyStoreFile.setVersion("0.1.0");
//
//        KeyStore.Cryto cryto = new KeyStore.Cryto();
//
//        cryto.setCiphertext(Hex.toHexString(cipherText));
//        cryto.setCipher(CIPHER);
//
//
//        KeyStore.Cipherparams cipherparams = new KeyStore.Cipherparams();
//        cipherparams.setIv(Hex.toHexString(iv));
//
//        cryto.setCipherparams(cipherparams);
//
//        cryto.setMac(Hex.toHexString(mac));
//
//        KeyStore.Kdfparams kdfparams = new KeyStore.Kdfparams();
//        kdfparams.setSalt(Hex.toHexString(salt));
//        kdfparams.setDklen(DKLEN);
//        kdfparams.setN(N_STANDARD);
//        kdfparams.setP(P_STANDARD);
//        kdfparams.setR(R);
//
//        cryto.setKdfparams(kdfparams);
//
//        keyStoreFile.setCrypto(cryto);
//
//        return keyStoreFile;
//    }
//
//    private static byte[] generateMac(byte[] derivedKey, byte[] cipherText) {
//        byte[] result = new byte[16 + cipherText.length];
//
//        System.arraycopy(derivedKey, 16, result, 0, 16);
//        System.arraycopy(cipherText, 0, result, 16, cipherText.length);
//
//        return Hash.sha256(result);
//    }
//
//    private static byte[] performCipherOperation(
//            int mode, byte[] iv, byte[] encryptKey, byte[] text) throws CipherException {
//        try {
//            IvParameterSpec ivParameterSpec = new IvParameterSpec(iv);
//            Cipher cipher = Cipher.getInstance("AES/CTR/NoPadding");
//
//            SecretKeySpec secretKeySpec = new SecretKeySpec(encryptKey, "AES");
//            cipher.init(mode, secretKeySpec, ivParameterSpec);
//            return cipher.doFinal(text);
//        } catch (NoSuchPaddingException | NoSuchAlgorithmException
//                | InvalidAlgorithmParameterException | InvalidKeyException
//                | BadPaddingException | IllegalBlockSizeException e) {
//            throw new CipherException("Error performing cipher operation", e);
//        }
//    }
//
//    private static byte[] generateDerivedScryptKey(
//            byte[] password, byte[] salt, int n, int r, int p, int dkLen) throws Exception{
//        return SCrypt.scrypt(password, salt, n, r, p, dkLen);
//    }
//
//    private static byte[] generateRandomBytes(int size) {
//        return Utils.RandomBytes(size);
//    }
//
//    @Override
//    public String dumpPrivKeyFromKeyStore(String file, String passphrase)
//            throws FileNotFoundException, BoxdException {
//        return dumpPrivKeyFromKeyStore(new File(file), passphrase);
//    }
//
//    @Override
//    public String dumpPrivKeyFromKeyStore(File file, String passphrase)
//            throws FileNotFoundException, BoxdException{
//
//        if(passphrase == null || "".equalsIgnoreCase(passphrase)){
//            throw new BoxdException(-1, "Passphrase must't be empty");
//        }
//
//        if(!file.exists()){
//            throw new FileNotFoundException("KeyStore file is not exists");
//        }
//        try {
//            byte[] bytes = passphrase.getBytes();
//
//            ObjectMapper objectMapper = new ObjectMapper();
//            KeyStore keyStoreFile = objectMapper.readValue(file, KeyStore.class);
//            // validate
//            KeyStore.Cryto cryto = keyStoreFile.getCrypto();
//
//            byte[] iv = Hex.decode(cryto.getCipherparams().getIv());
//            byte[] cipherText = Hex.decode(cryto.getCiphertext());
//
//            KeyStore.Kdfparams kdfparams = cryto.getKdfparams();
//            int dklen = kdfparams.getDklen();
//            int n = kdfparams.getN();
//            int p = kdfparams.getP();
//            int r = kdfparams.getR();
//            byte[] salt = Hex.decode(kdfparams.getSalt());
//            byte[] derivedKey = null;
//            try {
//                derivedKey = SCrypt.scrypt(bytes, salt, n, r, p, dklen);
//            }catch (Exception e){
//                throw new BoxdException(-1, "Create keystore err : " + e.getMessage());
//            }
//
//            byte[] exspectMac  = generateMac(derivedKey, cipherText);
//            if(!Arrays.equals(exspectMac, Hex.decode(cryto.getMac()))){
//                throw new BoxdException(-1, "Passphrase doesn't match key store");
//            }
//
//            byte[] encryptKey = Arrays.copyOfRange(derivedKey, 0, 16);
//
//            IvParameterSpec ivParameterSpec = new IvParameterSpec(iv);
//            Cipher cipher = Cipher.getInstance("AES/CTR/NoPadding");
//
//            SecretKeySpec secretKeySpec = new SecretKeySpec(encryptKey, "AES");
//            cipher.init(Cipher.DECRYPT_MODE, secretKeySpec, ivParameterSpec);
//            byte[] privateKey = cipher.doFinal(cipherText);
//
//            return Hex.toHexString(privateKey);
//        } catch (IOException| NoSuchAlgorithmException | NoSuchPaddingException
//                |InvalidAlgorithmParameterException | InvalidKeyException
//                | BadPaddingException | IllegalBlockSizeException e) {
//            throw new BoxdException(-1, e.getMessage());
//        }
//    }
//
//    @Override
//    public String dumpAddrFromPrivKey(String privKeyHex) {
//        return dumpAddrFromPrivKey(Hex.decode(privKeyHex));
//    }
//
//    @Override
//    public String dumpPubKeyFromPrivKey(String privKeyHex) {
//        byte[] bytes = Hex.decode(privKeyHex);
//        return dumpPubKeyFromPrivKey(bytes);
//    }
//
//    @Override
//    public String dumpPubKeyHashFromPrivKey(String privKeyHex) {
//        byte[] bytes = Hex.decode(privKeyHex);
//        return dumpPubKeyHashFromPrivKey(bytes);
//    }
//
//    @Override
//    public String dumpAddrFromPrivKey(byte[] privKeyBytes) {
//        ECKey ecKey = toECKeyFromPrivKey(privKeyBytes);
//        return getAddrFromPubKey(ecKey.getPubKey());
//    }
//
//    @Override
//    public String dumpPubKeyFromPrivKey(byte[] privKeyBytes) {
//        ECKey ecKey = toECKeyFromPrivKey(privKeyBytes);
//        return ecKey.getPublicKeyAsHex();
//    }
//
//    @Override
//    public String dumpPubKeyHashFromPrivKey(byte[] privKeyBytes) {
//        ECKey ecKey = toECKeyFromPrivKey(privKeyBytes);
//        return Hex.toHexString(Hash.Ripemd160(ecKey.getPubKey()));
//    }
//
//    private ECKey toECKeyFromPrivKey(byte[] bytes) {
//        return ECKey.fromPrivate(bytes);
//    }
//
//    private String getAddrFromPubKey(byte[] pubKey) {
//        byte[] pub = Hash.sha256hash160(pubKey);
//        // prefix
//        byte[] prefix = {0x13, 0x26};
//
//        // checksum
//        byte[] all = ArrayUtils.join(prefix, pub);
//
//        byte[] checksumAll = Sha256Hash.hashTwice(all);
//        byte[] checksum = new byte[4];
//        System.arraycopy(checksumAll, 0, checksum, 0, 4);
//
//
//        byte[] tmp = ArrayUtils.join(prefix, pub);
//        byte[] content = ArrayUtils.join(tmp, checksum);
//
//        String addr = Base58.encode(content);
//        return addr;
//    }
//
//    boolean validPrivKey(String privKey) throws BoxdException{
//        if (privKey == null || "".equalsIgnoreCase(privKey)){
//            throw new BoxdException(-1, "Private key mustn't be empty");
//        }
//        return true;
//    }

}
