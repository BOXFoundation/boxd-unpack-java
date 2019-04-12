package one.contentbox.boxd.sample;

import lombok.extern.slf4j.Slf4j;
import one.contentbox.boxd.account.Account;
import one.contentbox.boxd.account.DefaultAccount;

import java.io.File;

@Slf4j
public class AccountSample {

    public static void main(String args[]) throws Exception{
        Account account = new DefaultAccount();

        File f = new File("demo.keystore");
        if (f.exists()){
            f.delete();
        }

        account.newAccount("1", f.getPath());

        String privateKey = account.dumpPrivKeyFromKeyStore("demo.keystore", "1");
        System.out.println(privateKey);

        String  addr = account.dumpAddrFromPrivKey(privateKey);
        System.out.println(addr);
    }
}
