package one.contentbox.boxd.sample;

import one.contentbox.boxd.BoxdClient;
import one.contentbox.boxd.BoxdClientImpl;
import one.contentbox.boxd.proto.Block;
import one.contentbox.boxd.proto.BlockDetail;
import one.contentbox.boxd.proto.BlockHeader;
import one.contentbox.boxd.response.BalanceResp;
import one.contentbox.boxd.response.NodeInfoResp;
import one.contentbox.boxd.response.ViewTxDetailResp;

import java.util.ArrayList;
import java.util.List;

public class BoxdClientSample {

    public static void main(String[] args) throws Exception{
        String host = "39.97.169.1";
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

        // getBlockHash
        String hash = client.getBlockHash(blockHeight);
        System.out.println(hash);

        // getBlockHeader
        BlockHeader blockHeader = client.getBlockHeader(hash);
        System.out.println(blockHeader);

        // getBlock
        Block block = client.getBlock(hash);
        System.out.println(block);

        // Get balance
        String addr = "b1kpv3dumfYHojmzanBqJcDSJDjrxFaadaL";
        List<String> addrs = new ArrayList<>();
        addrs.add(addr);
        BalanceResp balanceResp = client.getBalance(addrs);
        System.out.println(balanceResp);

        // viewTxDetail
        // the first tx in block 0
        String txHash = "6c01338d69cf9ba33ae1ae5efbd1420fee5d3af38d7bf2168bb48d4d416cc4c1";
        ViewTxDetailResp viewTxDetailResp = client.viewTxDetail(txHash);
        System.out.println(viewTxDetailResp);

        // viewBlockDetail
        // the first block
        String blockHash = "d77ef0d20b74354500cbec293e4094fa2236cc4b14a32cd6792f134140fed6e5";
        BlockDetail blockDetailResp = client.viewBlockDetail(blockHash);
        System.out.println(blockDetailResp.toString());

        // getFeePrice
        long feePrice = client.getFeePrice();
        System.out.println(feePrice);
    }

}
