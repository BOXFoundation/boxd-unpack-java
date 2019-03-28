package one.contentbox.boxd.account;

import com.google.protobuf.ByteString;
import one.contentbox.boxd.BoxdClient;
import one.contentbox.boxd.BoxdClientImpl;
import one.contentbox.boxd.proto.OutPoint;
import one.contentbox.boxd.proto.Transaction;
import one.contentbox.boxd.proto.TxIn;
import one.contentbox.boxd.request.Token;
import one.contentbox.boxd.request.TokenIssueTxReq;
import one.contentbox.boxd.response.TokenIssueTxResp;
import one.contentbox.boxd.response.ViewTxDetailResp;
import one.contentbox.boxd.script.Opcode;
import one.contentbox.boxd.util.TxUtils;
import org.bitcoinj.core.ECKey;
import org.bitcoinj.core.Sha256Hash;
import org.bouncycastle.util.encoders.Hex;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TokenIssueTest {


    public static void main(String[] args) throws Exception {
        String host = "localhost";
        int port = 19111;

        Account account = new DefaultAccount();
        //        account.newAccount("1", "6.keystore");
        ECKey ecKey = new ECKey();
        String privKeyHex = ecKey.getPrivateKeyAsHex();
        String address = account.dumpAddrFromPrivKey(privKeyHex);
        //String privKeyHex = account.dumpPrivKeyFromKeyStore(new File("5.keystore"), "1");
        //String address = account.dumpAddrFromPrivKey(privKeyHex);

        BoxdClient client = new BoxdClientImpl(host, port);


        client.faucet(address, 10000);
        Thread.sleep(2000);

        TokenIssueTxReq tokenIssueTxReq = new TokenIssueTxReq();
        tokenIssueTxReq.setFee(100L);
        tokenIssueTxReq.setIssuee(address);
        tokenIssueTxReq.setIssuer(address);
        Token token = new Token();
        token.setDecimal(8);
        token.setName("TEST COIN");
        token.setSupply(10000);
        token.setSymbol("TEST");
        tokenIssueTxReq.setToken(token);

        TokenIssueTxResp tokenIssueTxResp = client.tokenIssue(100, address, token, privKeyHex);
        System.out.println(tokenIssueTxResp.getTokenAddress());
        System.out.println(tokenIssueTxResp.getHash());

        Thread.sleep(2000);

        Map<String, Long> targets =  new HashMap<>();
        targets.put("b1Tvej4G8Lma86pgYpWqv4fUFJcEyDdeGst", 100L);
        targets.put("b1USvtdkLrXXtzTfz8R5tpicJYobDbwuqeT", 200L);
        String hash = client.sendTokenToAdddresses(100, targets, tokenIssueTxResp.getHash(), tokenIssueTxResp.getIssueOutIndex(), privKeyHex);
        System.out.println(hash);
    }
}

