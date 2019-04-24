package one.contentbox.boxd.samples;

import one.contentbox.boxd.exception.BoxdException;
import one.contentbox.boxd.protocol.BoxdClient;
import one.contentbox.boxd.protocol.core.response.Block;
import one.contentbox.boxd.protocol.core.response.NetworkID;
import one.contentbox.boxd.protocol.core.response.Node;
import one.contentbox.boxd.protocol.core.response.Utxo;
import one.contentbox.boxd.protocol.core.response.block.BlockDetail;
import one.contentbox.boxd.protocol.core.response.block.BlockHeader;
import one.contentbox.boxd.protocol.core.response.tx.ExtendTxDetail;
import one.contentbox.boxd.protocol.rpc.RpcBoxdClientImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class BoxdClientSample {

    private BoxdClient boxdClient;

    public BoxdClientSample(String host, int port) {
        boxdClient = new RpcBoxdClientImpl(host, port);
    }

    public NetworkID getNetworkId() throws BoxdException {
        return boxdClient.getNetworkId();
    }

    public int getBlockHeight() throws BoxdException {
        return boxdClient.getBlockHeight();
    }

    public String getBlockHash(int height) throws BoxdException {
        return boxdClient.getBlockHash(height);
    }

    public BlockHeader getBlockHeader(String hash) throws BoxdException {
        return boxdClient.getBlockHeader(hash);
    }

    public BlockHeader getBlockHeader(int height) throws BoxdException {
        return boxdClient.getBlockHeader(height);
    }

    public Block getBlock(String hash) throws BoxdException {
        return boxdClient.getBlock(hash);
    }

    public Block getBlock(int height) throws BoxdException {
        return boxdClient.getBlock(height);
    }

    public List<Node> getNodeInfo() throws BoxdException {
        return boxdClient.getNodeInfo();
    }

    public long getBalance(String addr) throws BoxdException {
        List<String> addrs = new ArrayList<>();
        addrs.add(addr);
        return boxdClient.getBalance(addr);
    }

    public Map<String, Long> getBalances(List<String> addrs) throws BoxdException {
        return boxdClient.getBalances(addrs);
    }

    public long getTokenBalance(String addr, String tokenHash, int tokenIndex) throws BoxdException {
        return boxdClient.getTokenbalance(addr, tokenHash, tokenIndex);
    }

    public List<Utxo> fetchUtxo(String addr, long amount) throws BoxdException {
        return boxdClient.fetchUtxos(addr, amount);
    }

    public List<Utxo> fetchUtxo(String addr, long amount, String tokenHash, int tokenIndex) throws BoxdException {
        return boxdClient.fetchTokenUtxos(addr, amount, tokenHash, tokenIndex);
    }

    public ExtendTxDetail viewTxDetail(String hash) throws BoxdException {
        return boxdClient.viewTxDetail(hash);
    }

    public BlockDetail viewBlockDetail(String hash) throws BoxdException {
        return boxdClient.viewBlockDetail(hash);
    }

    public static void main(String[] args) throws Exception {
        String host = "39.97.169.1";
        int port = 19111;
        BoxdClientSample sample = new BoxdClientSample(host, port);

        String addr = "b1kpv3dumfYHojmzanBqJcDSJDjrxFaadaL";
        String addr1 = "b1juygrf1XAcjmSFUMpXytvwn6WHnVkGt1u";

        // viewTxDetail
        // the first tx in block 0
        String txHash = "6c01338d69cf9ba33ae1ae5efbd1420fee5d3af38d7bf2168bb48d4d416cc4c1";

        // viewBlockDetail
        // the first block
        String blockHash = "d77ef0d20b74354500cbec293e4094fa2236cc4b14a32cd6792f134140fed6e5";

        String tokenHash = "fb31523f439ffe3e763fb1a9a10b9199b9e761fdc236ca7e427ac39df1edf3c0";
        int tokenIndex = 0;

        NetworkID networkID = sample.getNetworkId();
        System.out.println(SampleHelper.formatJavaObject(networkID));

        int height = sample.getBlockHeight();
        System.out.println(height);

        String blockHash1 = sample.getBlockHash(height);
        System.out.println(blockHash1);

        BlockHeader blockHeader = sample.getBlockHeader(blockHash1);
        BlockHeader blockHeader1 = sample.getBlockHeader(height);
        System.out.println(SampleHelper.formatJavaObject(blockHeader));
        System.out.println(SampleHelper.formatJavaObject(blockHeader1));

        List<Node> nodes = sample.getNodeInfo();
        System.out.println(SampleHelper.formatJavaObject(nodes));

        Block block = sample.getBlock(height);
        Block block1 = sample.getBlock(blockHash1);
        System.out.println(SampleHelper.formatJavaObject(block));
        System.out.println(SampleHelper.formatJavaObject(block1));

        long balance = sample.getBalance(addr);
        System.out.println(balance);

        Map<String, Long> balances = sample.getBalances(Arrays.asList(new String[]{addr, addr1}));
        System.out.println(SampleHelper.formatJavaObject(balances));

        List<Utxo> utxos = sample.fetchUtxo(addr, 10000L);
        System.out.println(SampleHelper.formatJavaObject(utxos));

        List<Utxo> utxos1 = sample.fetchUtxo(addr1, 10000L);

        // for token
        String tokenTestAddr = "b1ZWSdrg48g145VdcmBwMPVuDFdaxDLoktk";
        long tokenBalance = sample.getTokenBalance(tokenTestAddr, tokenHash, tokenIndex);
        System.out.println(tokenBalance);

        List<Utxo> tokenUtxos = sample.fetchUtxo(tokenTestAddr, 1000, tokenHash, tokenIndex);

        txHash = "8a77e8605a11b6dbc3a64bfdb1da7fcf54c0d851f891a6ca66d2f059bc1479de";
        ExtendTxDetail extendTxDetail = sample.viewTxDetail(txHash);
        System.out.println(SampleHelper.formatJavaObject(extendTxDetail));

        BlockDetail blockDetail = sample.viewBlockDetail(blockHash);
        System.out.println(SampleHelper.formatJavaObject(blockDetail));
    }
}
