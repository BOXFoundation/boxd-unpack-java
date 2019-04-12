package one.contentbox.boxd.sample;

import com.google.protobuf.ByteString;
import one.contentbox.boxd.BoxdClient;
import one.contentbox.boxd.BoxdClientImpl;
import one.contentbox.boxd.BoxdException;
import one.contentbox.boxd.account.Account;
import one.contentbox.boxd.account.DefaultAccount;
import one.contentbox.boxd.proto.*;
import one.contentbox.boxd.response.BalanceResp;
import one.contentbox.boxd.response.FetchUtxosResp;
import one.contentbox.boxd.response.ViewTxDetailResp;
import one.contentbox.boxd.script.Opcode;
import one.contentbox.boxd.util.AddressUtils;
import one.contentbox.boxd.util.TxUtils;
import org.bitcoinj.core.ECKey;
import org.bitcoinj.core.Sha256Hash;
import org.bouncycastle.util.encoders.Hex;

import java.util.*;

public class TxOfflineSignSample {

    public static void main(String[] args) throws BoxdException, Exception{

        String host = "39.97.169.1";
        int port = 19111;
        BoxdClient client = new BoxdClientImpl(host, port);

        // create new account
        Account account = new DefaultAccount();
        String path = "offlinesample.keystore";
        account.newAccount("1", path);
        String privKeyHex = account.dumpPrivKeyFromKeyStore(path, "1");
        String address = account.dumpAddrFromPrivKey(privKeyHex);
        System.out.println(address);

        Map<String, Long> targets =  new HashMap<>();
        targets.put("b1Tvej4G8Lma86pgYpWqv4fUFJcEyDdeGst", 100L);
        targets.put("b1USvtdkLrXXtzTfz8R5tpicJYobDbwuqeT", 200L);
        targets.put("b1dSx5FTXEpzB7hWZAydY5N4A5PtFJb57V1", 300L);
        targets.put("b1Vc6vBWzjSp71c3c49hx3pENPL1TwU1Exy", 400L);


        long amount = 12000;
        String txHash =  client.faucet(address, amount);
        System.out.println("faucet tx Hash:" + txHash);
        Thread.sleep(5000);

        // getBalance
        long balance = 0;
        BalanceResp balanceResp = client.getBalance(new ArrayList<String>(){{add(address);}});
        if(balanceResp == null || balanceResp.getCount() != 1){
            throw new BoxdException(-1, "Get balance err");
        }
        balance = balanceResp.getBalances().get(0).longValue();
        if(balance <= 1000) {
            throw new BoxdException(-1, "Balance < 0");
        }
        System.out.println(balance);


        // fetch utxo
        FetchUtxosResp fetchUtxosResp = client.fetchUtxos(address, amount, null, 0);
        List<Utxo> utxoList = fetchUtxosResp.getUtxos();

        // create transaction
        Transaction unsignedTx = client.createTransaction(address, targets, 100, utxoList);

        // sign transaction
        Transaction tx = client.signTransaction(unsignedTx, privKeyHex);

        String hash = client.sendTransaction(tx);
        System.out.println("hash:" +hash);


        Thread.sleep(1000);

        ViewTxDetailResp viewTxDetailResp = client.viewTxDetail(hash);
        System.out.println("height: " + viewTxDetailResp.getBlockHeight());
        System.out.println("timestamp: " + viewTxDetailResp.getBlockTime());
        System.out.println("tx detail: " + viewTxDetailResp.getTxDetail());
    }

}