package one.contentbox.boxd.account;

import org.bitcoinj.core.ECKey;

public class AccountTest {

    public static void main(String args[]) throws Exception{
        Account account = new DefaultAccount();
        String password = "1";
        String path = "r.keystore";
        account.newAccount(password, path);

        String privKey =  account.dumpPrivKeyFromKeyStore(path, password);
        System.out.println(privKey);
        String addr = account.dumpAddrFromPrivKey(privKey);
        System.out.println(addr);

        String privKey2= account.dumpPrivKeyFromKeyStore(path, "2");
        System.out.println(privKey2);

    }
}
