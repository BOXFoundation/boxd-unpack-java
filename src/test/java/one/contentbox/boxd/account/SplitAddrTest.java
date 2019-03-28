package one.contentbox.boxd.account;

import com.google.protobuf.ByteString;
import one.contentbox.boxd.BoxdClient;
import one.contentbox.boxd.BoxdClientImpl;
import one.contentbox.boxd.proto.MakeSplitAddrTxReq;
import one.contentbox.boxd.proto.OutPoint;
import one.contentbox.boxd.proto.Transaction;
import one.contentbox.boxd.proto.TxIn;
import one.contentbox.boxd.request.SplitAddrTxReq;
import one.contentbox.boxd.response.SplitAddrTxResp;
import one.contentbox.boxd.response.ViewTxDetailResp;
import one.contentbox.boxd.script.Opcode;
import one.contentbox.boxd.util.TxUtils;
import org.bitcoinj.core.Sha256Hash;
import org.bouncycastle.util.encoders.Hex;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SplitAddrTest {
    public static void main(String[] args) throws Exception{
        String host = "localhost";
        int port = 19111;

        Account account = new DefaultAccount();
        String keystoreName= "split_addr.keystore";
        account.newAccount("1", keystoreName);

        String privKeyHex = account.dumpPrivKeyFromKeyStore(new File(keystoreName), "1");
        String address = account.dumpAddrFromPrivKey(privKeyHex);

        BoxdClient client = new BoxdClientImpl(host, port);


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
