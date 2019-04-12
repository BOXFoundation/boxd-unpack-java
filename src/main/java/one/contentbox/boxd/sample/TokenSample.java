package one.contentbox.boxd.sample;

import lombok.extern.slf4j.Slf4j;
import one.contentbox.boxd.BoxdClient;
import one.contentbox.boxd.BoxdClientImpl;
import one.contentbox.boxd.account.Account;
import one.contentbox.boxd.account.DefaultAccount;
import one.contentbox.boxd.request.Token;
import one.contentbox.boxd.request.TokenIssueTxReq;
import one.contentbox.boxd.response.TokenIssueTxResp;
import one.contentbox.boxd.response.ViewTxDetailResp;
import org.bitcoinj.core.ECKey;

import java.util.HashMap;
import java.util.Map;

@Slf4j
public class TokenSample {


    public static void main(String[] args) throws Exception {
        String host = "39.97.169.1";
        int port = 19111;
        BoxdClient client = new BoxdClientImpl(host, port);

        Account account = new DefaultAccount();
        ECKey ecKey = new ECKey();
        String privKeyHex = ecKey.getPrivateKeyAsHex();
        String address = account.dumpAddrFromPrivKey(privKeyHex);

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
        log.info(tokenIssueTxResp.getTokenAddress());
        log.info(tokenIssueTxResp.getHash());

        Thread.sleep(2000);

        Map<String, Long> targets =  new HashMap<>();
        targets.put("b1Tvej4G8Lma86pgYpWqv4fUFJcEyDdeGst", 100L);
        targets.put("b1USvtdkLrXXtzTfz8R5tpicJYobDbwuqeT", 200L);
        String hash = client.sendTokenToAdddresses(100, targets, tokenIssueTxResp.getHash(), tokenIssueTxResp.getIssueOutIndex(), privKeyHex);

        ViewTxDetailResp viewTxDetailResp = client.viewTxDetail(hash);
        log.info(viewTxDetailResp.getTxDetail().toString());

    }
}

