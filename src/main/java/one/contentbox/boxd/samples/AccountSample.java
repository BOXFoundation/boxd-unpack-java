package one.contentbox.boxd.samples;

import lombok.extern.slf4j.Slf4j;
import one.contentbox.boxd.account.AccountManager;
import one.contentbox.boxd.account.AccountManagerImpl;
import one.contentbox.boxd.exception.BoxdException;
import one.contentbox.boxd.util.AddressUtils;
import org.bouncycastle.math.ec.FixedPointUtil;
import org.bouncycastle.util.encoders.Hex;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.FileAlreadyExistsException;

@Slf4j
public class AccountSample {

    AccountManager manager = new AccountManagerImpl();
    static String password = "1";
    static File f = new File("demo.keystore");
    static String path = "demo1.keystore";



    public String dumpAddrFromPrivateKey(String privKey) throws BoxdException{
        return manager.dumpAddrFromPrivKey(privKey);
    }

    public String dumpAddrFromPrivateKey(byte[] privKey) throws BoxdException {
        return manager.dumpAddrFromPrivKey(privKey);
    }

    public String dumpPrivKeyFromKeyStore(File f,  String password)
            throws FileNotFoundException, BoxdException {
        String privateKey = manager.dumpPrivKeyFromKeyStore(f, password);
        return privateKey;
    }

    public String dumpPrivKeyFromKeyStore(String path, String password) throws BoxdException, FileNotFoundException{
        return manager.dumpPrivKeyFromKeyStore(path, password);
    }


    public boolean dumpKeyStoreFromPrivateKey(String privateKey, String path, String password)
            throws BoxdException, FileAlreadyExistsException{
        File f  = new File(path);
        if(f.exists()) {
            f.delete();
        }
        return manager.dumpKeyStoreFromPrivKey(privateKey, password, path);
    }

    public boolean newAccount(String path, String password) throws FileAlreadyExistsException, BoxdException {
        File f = new File(path);
        if(f.exists()){
            f.delete();
        }
        return manager.newAccount(password, path);
    }

    public boolean isValidAddr(String addr) {
        return AddressUtils.isVaildAddr(addr);
    }

    public byte[]  dumpPubKeyHashFromPrivKey (String privKey) throws BoxdException{
        return manager.dumpPubKeyHashFromPrivKey(privKey);
    }

    public byte[] dumpPubKeyHashFromPrivKey ( byte[] privKey) throws BoxdException{
        return manager.dumpPubKeyHashFromPrivKey(privKey);
    }

    public byte[] dumpPubKeyHashFromAddr (String addr) throws BoxdException{
        return manager.dumpPubKeyHashFromAddr(addr);
    }


    public static void main(String args[]) throws Exception{
        AccountSample sample = new AccountSample();
        String privateKey = sample.dumpPrivKeyFromKeyStore(f, password);
        System.out.println("\n\n==================private key================");
        System.out.println(privateKey);
        String privateKey1 = sample.dumpPrivKeyFromKeyStore(path, password);
        System.out.println(privateKey1);
        System.out.println(privateKey.equals(privateKey1));

        System.out.println("\n\n==================addr================");
        String addr = sample.dumpAddrFromPrivateKey(privateKey);
        System.out.println(addr);
        String addr1  = sample.dumpAddrFromPrivateKey(Hex.decode(privateKey));
        System.out.println(addr);
        System.out.println(addr.equals(addr1));

        System.out.println("\n\n==================public key hash================");
        byte [] pubKey =  sample.dumpPubKeyHashFromPrivKey(privateKey);
        byte[] pubKey2 = sample.dumpPubKeyHashFromPrivKey(Hex.decode(privateKey));
        byte[] pubKey3 = sample.dumpPubKeyHashFromAddr(addr);
        System.out.println(Hex.toHexString(pubKey));
        System.out.println(Hex.toHexString(pubKey2));
        System.out.println(Hex.toHexString(pubKey3));

        System.out.println("\n\n================== key store================");
        sample.dumpKeyStoreFromPrivateKey(privateKey, path, password);

        System.out.println("\n\n==================new account================");
        sample.newAccount("new.keystore", "1");

        System.out.println("\n\n==================addr is valid or not================");
        boolean isValid = sample.isValidAddr(addr);
        System.out.println(isValid);
        System.out.println(sample.isValidAddr(addr.substring(1)));
        System.out.println(sample.isValidAddr(addr.replace("T", "B")));
    }
}
