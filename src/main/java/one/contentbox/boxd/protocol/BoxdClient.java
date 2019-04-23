package one.contentbox.boxd.protocol;

import io.grpc.ManagedChannel;
import one.contentbox.boxd.exception.BoxdException;
import one.contentbox.boxd.protocol.core.request.*;
import one.contentbox.boxd.protocol.core.response.*;
import one.contentbox.boxd.protocol.core.response.Block;
import one.contentbox.boxd.protocol.core.response.block.BlockDetail;
import one.contentbox.boxd.protocol.core.response.block.BlockHeader;
import one.contentbox.boxd.protocol.core.response.Node;
import one.contentbox.boxd.protocol.core.response.Utxo;
import one.contentbox.boxd.protocol.core.response.tx.ExtendTxDetail;
import one.contentbox.boxd.protocol.core.response.tx.UnsignedSplitAddrTx;
import one.contentbox.boxd.protocol.core.response.tx.UnsignedTokenIssueTx;
import one.contentbox.boxd.protocol.rpc.protobuf.generated.Transaction;

import java.util.List;
import java.util.Map;

/**
 * Boxd client to interact with boxd rpc node
 */
public interface BoxdClient {

    /**
     * Add the given nodeId to local node, the local node will connect to the given node
     *
     * @param nodeId
     * @return
     * @throws BoxdException
     */
    String addNode(String nodeId) throws BoxdException;

    /**
     * Get block info by the block hash
     *
     * @param blockHash
     * @return
     * @throws BoxdException
     */
    Block getBlock(String blockHash) throws BoxdException;

    /**
     * Get block info by the block height
     *
     * @param height
     * @return
     * @throws BoxdException
     */
    Block getBlock(int  height) throws BoxdException;

    /**
     * Get block hash of the block by height
     *
     * @param blockHeight
     * @return
     * @throws BoxdException
     */
    String getBlockHash(int blockHeight) throws BoxdException;

    /**
     * Get network id
     *
     * @return
     * @throws BoxdException
     */
    NetworkID getNetworkId() throws BoxdException;

    /**
     * Get header info of a block by the block hash
     *
     * @param hash
     * @return
     * @throws BoxdException
     */
    BlockHeader getBlockHeader(String hash) throws BoxdException;

    /**
     * Get header info of a block by the block height
     *
     * @param height
     * @return
     * @throws BoxdException
     */
    BlockHeader getBlockHeader(int  height) throws BoxdException;


    /**
     * Get rpc node info
     *
     * @return
     * @throws BoxdException
     */
    List<Node> getNodeInfo() throws BoxdException;

    /**
     * Get the height of the last block
     *
     * @return
     * @throws BoxdException
     */
    int getBlockHeight() throws BoxdException;


    /**
     * Get the balance of the given address
     *
     * @param addr
     * @return
     * @throws BoxdException
     */
    Long getBalance(String addr) throws BoxdException;


    /**
     * Get the balance of the given addresses
     *
     * @param addrs
     * @return
     * @throws BoxdException
     */
    Map<String, Long> getBalances(List<String> addrs) throws BoxdException;

    /**
     * Get UTXOs by the given address, tokenHash and tokenIndex
     *
     * @param address
     * @param amount
     * @param tokenHash
     * @param tokenIndex
     * @return
     * @throws BoxdException
     */
    List<Utxo> fetchTokenUtxos(String address, long amount, String tokenHash, int tokenIndex) throws BoxdException;


    /**
     * Get UTXOs by the given address
     *
     * @param address
     * @param amount
     * @return
     * @throws BoxdException
     */
    List<Utxo> fetchUtxos(String address, long amount) throws BoxdException;

    /**
     * Get the token balance by the given address, tokenHash and tokenIndex
     *
     * @param addr
     * @param tokenHash
     * @param tokenIndex
     * @return
     * @throws BoxdException
     */
    long  getTokenbalance(String addr, String tokenHash, int tokenIndex) throws BoxdException;


    /**
     * Get the token balance by the given address, tokenHash and tokenIndex
     *
     * @param addrs
     * @param tokenHash
     * @param tokenIndex
     * @return
     * @throws BoxdException
     */
    Map<String, Long> getTokenbalances(List<String> addrs, String tokenHash, int tokenIndex) throws BoxdException;

    /**
     * Make unsigned common transaction on-chain
     *
     * @param unsignedTxReq
     * @return
     * @throws BoxdException
     */
    UnsignedTx makeUnsignedTx(UnsignedTxReq unsignedTxReq) throws BoxdException;

    /**
     * Make unsigned common transaction on-chain
     *
     * @param from
     * @param to
     * @param fee
     * @return
     * @throws BoxdException
     */
    UnsignedTx makeUnsignedTx(String from, Map<String, Long> to, long fee) throws BoxdException;

    /**
     * Make unsigned split address tx
     *
     * @param splitAddrTxReq
     * @return
     * @throws BoxdException
     */
    UnsignedSplitAddrTx makeUnsignedSplitAddrTx(SplitAddrTx splitAddrTxReq) throws BoxdException;

    /**
     * Make unsigned token issue tx, if submited, this will issue a token
     *
     * @param tokenIssueTxReq
     * @return
     * @throws BoxdException
     */
    UnsignedTokenIssueTx makeUnsignedTokenIssueTx(TokenIssueTx tokenIssueTxReq) throws BoxdException;

    /**
     * Make unsigned token transfer tx
     *
     * @param tokenTransferTxReq
     * @return
     * @throws BoxdException
     */
    UnsignedTx makeUnsignedTokenTransferTx(TokenTransferTx tokenTransferTxReq) throws BoxdException;

    /**
     * Create unsigned transaction by UTXOs
     *
     * @param from
     * @param fee
     * @param utxos
     * @return
     * @throws BoxdException
     */
    UnsignedTx createRawTransaction(String from, Map<String, Long> to, long fee, List<Utxo> utxos) throws BoxdException;

    /**
     * Sign a unsigned transaction
     *
     * @param unsignedTx
     * @param privateKey
     * @return
     * @throws BoxdException
     */
    Transaction signTransaction(UnsignedTx unsignedTx, String privateKey) throws BoxdException;

    String signRawTransaction(String unsignedRawTx, String privateKey) throws BoxdException;

    /**
     * Send transaction to the chain, it will come into the memory pool
     *
     * @param transaction
     * @return
     * @throws BoxdException
     */
    String sendTransaction(Transaction transaction) throws BoxdException;

    String sendRawTransaction(String rawTransaction) throws BoxdException;

    /**
     * Get block info by the given block hash
     *
     * @param hash
     * @return
     * @throws BoxdException
     */
    BlockDetail viewBlockDetail(String hash) throws BoxdException;

    /**
     * Get transaction info by the given transaction hash
     *
     * @param hash
     * @return
     * @throws BoxdException
     */
    ExtendTxDetail viewTxDetail(String hash) throws BoxdException;

}
