package one.contentbox.boxd.samples;

import lombok.extern.slf4j.Slf4j;
import one.contentbox.boxd.account.AccountManager;
import one.contentbox.boxd.account.AccountManagerImpl;

import java.io.File;

@Slf4j
public class AccountSample {

    public static void main(String args[]) throws Exception{
        AccountManager account = new AccountManagerImpl();

        String password = "1";
        File f = new File("demo.keystore");
        if (f.exists()){
            f.delete();
        }

        account.newAccount(password, f.getPath());

        String privateKey = account.dumpPrivKeyFromKeyStore("demo.keystore", password);
        System.out.println(privateKey);

        String  addr = account.dumpAddrFromPrivKey(privateKey);
        System.out.println(addr);


        boolean ret = account.dumpKeyStoreFromPrivKey(privateKey, password, "export.keystore");
        System.out.println(ret);
    }
}
