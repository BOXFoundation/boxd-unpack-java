package one.contentbox.boxd.sample;

import one.contentbox.boxd.BoxdClient;
import one.contentbox.boxd.BoxdClientImpl;
import one.contentbox.boxd.account.Account;
import one.contentbox.boxd.account.DefaultAccount;
import one.contentbox.boxd.request.SplitAddrTxReq;
import one.contentbox.boxd.response.SplitAddrTxResp;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class SplitAddrSample {
    public static void main(String[] args) throws Exception{
        String host = "39.97.169.1";
        int port = 19111;
        BoxdClient client = new BoxdClientImpl(host, port);

        Account account = new DefaultAccount();
        String keystoreName= "split_addr.keystore";
        account.newAccount("1", keystoreName);

        String privKeyHex = account.dumpPrivKeyFromKeyStore(new File(keystoreName), "1");
        String address = account.dumpAddrFromPrivKey(privKeyHex);

        client.faucet(address, 10000);
        Thread.sleep(2000);

        Map<String, Long> targets = new HashMap<>();
        targets.put("b1USvtdkLrXXtzTfz8R5tpicJYobDbwuqeT", 5L);
        targets.put("b1dSx5FTXEpzB7hWZAydY5N4A5PtFJb57V1", 5L);

        SplitAddrTxReq splitAddrTxReq = new SplitAddrTxReq();
        splitAddrTxReq.setFee(100);
        splitAddrTxReq.setFrom(address);
        splitAddrTxReq.setDetail(targets);

        SplitAddrTxResp splitAddrTxResp = client.createSplitAddr(100, targets, privKeyHex);
        System.out.println(splitAddrTxResp.getSplitAddr());

    }
}
