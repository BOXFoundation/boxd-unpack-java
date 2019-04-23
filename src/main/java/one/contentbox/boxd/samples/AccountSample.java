package one.contentbox.boxd.samples;

import lombok.extern.slf4j.Slf4j;
import one.contentbox.boxd.account.AccountManager;
import one.contentbox.boxd.account.AccountManagerImpl;
import one.contentbox.boxd.exception.BoxdException;
import one.contentbox.boxd.util.AddressUtils;
import org.bouncycastle.math.ec.FixedPointUtil;

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

    public String dumpPrivKeyFromKeyStore(File f,  String password)
            throws FileNotFoundException, BoxdException {
        String privateKey = manager.dumpPrivKeyFromKeyStore(f, password);
        return privateKey;
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



    public static void main(String args[]) throws Exception{
        AccountSample sample = new AccountSample();
        String privateKey = sample.dumpPrivKeyFromKeyStore(f, password);
        System.out.println(privateKey);

        String addr = sample.dumpAddrFromPrivateKey(privateKey);
        System.out.println(addr);

        sample.dumpKeyStoreFromPrivateKey(privateKey, path, password);


        sample.newAccount("new.keystore", "1");

    }
}
