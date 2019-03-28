package one.contentbox.boxd.account;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.annotation.JsonRootName;
import one.contentbox.boxd.BoxdClient;
import one.contentbox.boxd.BoxdClientImpl;
import one.contentbox.boxd.BoxdException;
import one.contentbox.boxd.proto.*;
import one.contentbox.boxd.request.*;
import one.contentbox.boxd.response.*;
import one.contentbox.boxd.response.ViewTxDetailResp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BoxdClientTest {

    public static void main(String[] args) throws Exception{
        String host = "localhost";
        int port = 19111;
        BoxdClient client = new BoxdClientImpl(host, port);

        // getNetworkId
        int networkId = client.getNetworkId();
        System.out.println(networkId);

        // getNodeInfo
        NodeInfoResp nodeInfoResp = client.getNodeInfo();
        System.out.println(nodeInfoResp);

        // getBLockHeight
        int blockHeight = client.getBlockHeight();
        System.out.println(blockHeight);

        String hash = client.getBlockHash(blockHeight);
        System.out.println(hash);

        BlockHeader blockHeader = client.getBlockHeader(hash);
        System.out.println(blockHeader);

        Block block = client.getBlock(hash);
        System.out.println(block);


        Block blockDetailResp = client.getBlock(hash);
        System.out.println(block);


        String addr = "b1kpv3dumfYHojmzanBqJcDSJDjrxFaadaL";
        List<String> addrs = new ArrayList<>();
        addrs.add(addr);
        BalanceResp balanceResp = client.getBalance(addrs);
        System.out.println(JSON.toJSONString(balanceResp));


        String txHash = "f62c0ae38ecadd564225d27623f1ed72e9df11e25e175a54f1358f769e453b6f";
//        Transaction transaction = client.getRawTransaction(txHash);
//        System.out.println(transaction);

        ViewTxDetailResp viewTxDetailResp = client.viewTxDetail(txHash);
        System.out.println(viewTxDetailResp);


        long feePrice = client.getFeePrice();
        System.out.println(feePrice);
    }

}
