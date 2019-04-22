package one.contentbox.boxd.samples;

import lombok.extern.slf4j.Slf4j;
import one.contentbox.boxd.protocol.BoxdClient;
import one.contentbox.boxd.protocol.core.request.TokenIssueTx;
import one.contentbox.boxd.protocol.core.request.TokenTransferTx;
import one.contentbox.boxd.protocol.core.response.TokenTag;
import one.contentbox.boxd.protocol.core.response.UnsignedTx;
import one.contentbox.boxd.protocol.core.response.tx.ExtendTxDetail;
import one.contentbox.boxd.protocol.core.response.tx.UnsignedTokenIssueTx;
import one.contentbox.boxd.protocol.rpc.RpcBoxdClientImpl;
import one.contentbox.boxd.protocol.rpc.protobuf.generated.Transaction;

import java.util.HashMap;
import java.util.Map;

@Slf4j
public class TokenSample {

    public static void main(String[] args) throws Exception {
        String host = "39.97.169.1";
        int port = 19111;
        BoxdClient client = new RpcBoxdClientImpl(host, port);

        String address = "b1fc1Vzz73WvBtzNQNbBSrxNCUC1Zrbnq4m";
        String privKey = "29fbf01166fc31c941cadc1659a5f684f81c22c1113e5aa5b0af28b7dd453269";

        TokenIssueTx tokenIssueTxReq = new TokenIssueTx();
        tokenIssueTxReq.setFee(100L);
        tokenIssueTxReq.setIssuee(address);
        tokenIssueTxReq.setIssuer(address);
        TokenTag token = new TokenTag();
        token.setDecimal(8);
        token.setName("TEST COIN");
        token.setSupply(100000);
        token.setSymbol("TEST");
        tokenIssueTxReq.setToken(token);

        // issue token
        UnsignedTokenIssueTx unsignedTokenIssueTx = client.makeUnsignedTokenIssueTx(tokenIssueTxReq);
        Transaction transaction = client.signTransaction(unsignedTokenIssueTx, privKey);
        String hash = client.sendTransaction(transaction);

        Thread.sleep(2000);


        // token transfer
        long fee = 100L;
        Map<String, Long> to =  new HashMap<>();
        to.put("b1Tvej4G8Lma86pgYpWqv4fUFJcEyDdeGst", 100L);
        to.put("b1USvtdkLrXXtzTfz8R5tpicJYobDbwuqeT", 200L);


        TokenTransferTx tokenTransferTxReq = new TokenTransferTx();
        tokenTransferTxReq.setFee(fee);
        tokenTransferTxReq.setFrom(address);
        tokenTransferTxReq.setTo(to);
        tokenTransferTxReq.setTokenHash(hash);
        tokenTransferTxReq.setTokenIndex(unsignedTokenIssueTx.getIssueOutIndex());
        UnsignedTx unsignedTx = client.makeUnsignedTokenTransferTx(tokenTransferTxReq);

        Transaction signedTransferTx = client.signTransaction(unsignedTx, privKey);

        String hash2  = client.sendTransaction(signedTransferTx);

        Thread.sleep(2000);
        // view tx
        ExtendTxDetail viewTxDetailResp = client.viewTxDetail(hash2);
        System.out.println(SampleHelper.formatJavaObject(viewTxDetailResp));

    }
}

