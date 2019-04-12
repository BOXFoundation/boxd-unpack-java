package one.contentbox.boxd.sample;

import one.contentbox.boxd.BoxdClient;
import one.contentbox.boxd.BoxdClientImpl;
import one.contentbox.boxd.account.Account;
import one.contentbox.boxd.account.DefaultAccount;
import one.contentbox.boxd.response.ViewTxDetailResp;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class TransferSample {
    public static void main(String args[]) throws Exception{
        String host = "39.97.169.1";
        int port = 19111;

        BoxdClient client = new BoxdClientImpl(host, port);

        long fee = 100L;
        Map<String, Long> targets =  new HashMap<>();
        targets.put("b1Tvej4G8Lma86pgYpWqv4fUFJcEyDdeGst", 100L);
        targets.put("b1USvtdkLrXXtzTfz8R5tpicJYobDbwuqeT", 200L);
        targets.put("b1dSx5FTXEpzB7hWZAydY5N4A5PtFJb57V1", 300L);
        targets.put("b1Vc6vBWzjSp71c3c49hx3pENPL1TwU1Exy", 400L);


        Account account = new DefaultAccount();
        account.newAccount("1", "1.keystore");
        String privKeyHex = account.dumpPrivKeyFromKeyStore(new File("1.keystore"), "1");
        String address = account.dumpAddrFromPrivKey(privKeyHex);

        client.faucet(address, 10000);
        Thread.sleep(2000);

        String txHash = client.sendToAdddresses(fee, targets, privKeyHex);
        System.out.println(txHash);

        ViewTxDetailResp viewTxDetailResp = client.viewTxDetail(txHash);
        System.out.println(viewTxDetailResp);
    }
}
