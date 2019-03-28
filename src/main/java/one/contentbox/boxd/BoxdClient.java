package one.contentbox.boxd;

import io.grpc.ManagedChannel;
import one.contentbox.boxd.proto.Block;
import one.contentbox.boxd.proto.BlockDetail;
import one.contentbox.boxd.proto.BlockHeader;
import one.contentbox.boxd.proto.Transaction;
import one.contentbox.boxd.request.*;
import one.contentbox.boxd.response.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.FileAlreadyExistsException;
import java.util.List;
import java.util.Map;

/**
 * Boxd client to interact with boxd rpc node
 */
public interface BoxdClient {

    /**
     * Get rpc channel
     *
     * @return
     */
    ManagedChannel getManagedChannel();


    boolean isValidAddr(String addr);

    /**
     * Get private key in hex by passphrase and keystore
     *
     * @param file
     * @param passphrase
     * @return
     * @throws BoxdException
     */
    String dumpPrivKeyFromKeyStore(File file, String passphrase) throws BoxdException, FileNotFoundException;

    /**
     * Get address by private key
     *
     * @param privKey
     * @return
     * @throws BoxdException
     */
    String dumpAddrFromPrivKey(String privKey) throws BoxdException;

    /**
     * Get address by private key
     *
     * @param privKey
     * @return
     * @throws BoxdException
     */
    String dumpPubKeyFromPrivKey(String privKey) throws BoxdException;

    /**
     * Get public key hash by private key
     *
     * @param privKey
     * @return
     * @throws BoxdException
     */
    String dumpPubKeyHashFromPrivKey(String privKey) throws BoxdException;

    /**
     * Get address by private key
     *
     * @param privKeyBytes
     * @return
     * @throws BoxdException
     */
    String dumpAddrFromPrivKey(byte[] privKeyBytes) throws BoxdException;

    /**
     * Get public key by private key
     *
     * @param privKeyBytes
     * @return
     * @throws BoxdException
     */
    String dumpPubKeyFromPrivKey(byte[] privKeyBytes) throws BoxdException;

    /**
     * Get public key hash by private key
     *
     * @param privKeyBytes
     * @return
     * @throws BoxdException
     * @throws Exception
     */
    String dumpPubKeyHashFromPrivKey(byte[] privKeyBytes) throws BoxdException, Exception;

    /**
     * Sign  transaction using private key
     *
     * @param txBytes
     * @param privKeyBytes
     * @return
     * @throws BoxdException
     */
    byte[] sign(byte[] txBytes, byte[] privKeyBytes) throws BoxdException;

    /**
     * Sign transaction using private key
     *
     * @param txBytes
     * @param privKey
     * @return
     * @throws BoxdException
     */
    byte[] sign(byte[] txBytes, String privKey) throws BoxdException;

    /**
     * Get public key by private key
     *
     * @param privKey
     * @return
     * @throws BoxdException
     */
    byte[] dumpPubKey(String privKey) throws BoxdException;

    /**
     * Get public key hash by private key
     *
     * @param privKey
     * @return
     * @throws BoxdException
     */
    byte[] dumpPubKeyHash(String privKey) throws BoxdException;

    /**
     * Create a new account by a passphrase and the path of keyStore, This will create a keystore file
     *
     * @param passphrase
     * @param keyStoreFilePath
     * @return
     * @throws BoxdException
     * @throws FileAlreadyExistsException
     * @throws Exception
     */
    boolean newAccount(String passphrase, String keyStoreFilePath)
            throws BoxdException, FileAlreadyExistsException, Exception;


    /**
     * send token to others
     *
     * @param fee
     * @param to
     * @param tokenHash
     * @param tokenIndex
     * @param privKeyHex
     * @return
     * @throws BoxdException
     */
    String sendTokenToAdddresses(long fee, Map<String, Long> to, String tokenHash, int tokenIndex, String privKeyHex) throws BoxdException;


    /**
     * Send box to others, This method will execute 3 main steps:\n
     *
     * 1. fetch utxos
     *
     * 2. make unsigned transction
     *
     * 3. sign transaction
     *
     * 4. send signed transaction
     *
     * @param fee
     * @param to
     * @param privKeyHex
     * @return
     * @throws BoxdException
     */
    String sendToAdddresses(long fee, Map<String, Long> to,  String privKeyHex) throws BoxdException;

    /**
     * Create a split address on-chain
     *
     * @param fee
     * @param privKeyHex
     * @param addrsAndWeight
     * @return split address
     * @throws BoxdException
     */
    SplitAddrTxResp createSplitAddr(long fee, Map<String, Long> addrsAndWeight, String privKeyHex) throws BoxdException;

    /**
     * Issue a token on-chain
     *
     * @param fee
     * @param tokenName
     * @param tokenSymbol
     * @param tokenDecimals
     * @param tokenSupply
     * @param privKeyHex
     * @return  token address
     * @throws BoxdException
     */
    TokenIssueTxResp tokenIssue(long fee, String owner, String tokenName, String tokenSymbol, int tokenDecimals, int tokenSupply, String privKeyHex) throws BoxdException;

    /**
     * Issue a token on-chain
     *
     * @param fee
     * @param owner
     * @param token
     * @param privKeyHex
     * @return
     * @throws BoxdException
     */
    TokenIssueTxResp tokenIssue(long fee, String owner, Token token, String privKeyHex) throws BoxdException;


    /**
     * Get test box coin by this api
     *
     * @param addr
     * @param amount
     * @return
     * @throws BoxdException
     */
    String faucet(String addr, long amount) throws BoxdException;

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
    int getNetworkId() throws BoxdException;

    /**
     * Update network id
     *
     * @param id
     * @return
     * @throws BoxdException
     */
    int updateNetworkId(int id) throws BoxdException;

    /**
     * Sets the debug level of blockchain server, the value of parameter level must be one of the following: \n
     *
     *  debug|info|warning|error|fatal.
     *
     * @param level
     * @return
     * @throws BoxdException
     */
    String setDebugLevel(String level) throws BoxdException;

    /**
     * Get header info of a block by the block hash
     *
     * @param hash
     * @return
     * @throws BoxdException
     */
    BlockHeader getBlockHeader(String hash) throws BoxdException;

    /**
     * Get rpc node info
     *
     * @return
     * @throws BoxdException
     */
    NodeInfoResp getNodeInfo() throws BoxdException;

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
     * @param addrs
     * @return
     * @throws BoxdException
     */
    BalanceResp getBalance(List<String> addrs) throws BoxdException;

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
    one.contentbox.boxd.response.FetchUtxosResp fetchUtxos(String address, long amount, String tokenHash, int tokenIndex) throws BoxdException;

    /**
     * Get fee price on-chain
     *
     * @return
     * @throws BoxdException
     */
    long getFeePrice() throws BoxdException;

    /**
     * Get the token balance by the given address, tokenHash and tokenIndex
     *
     * @param addrs
     * @param tokenHash
     * @param tokenIndex
     * @return
     * @throws BoxdException
     */
    BalanceResp getTokenbalance(List<String> addrs, String tokenHash, int tokenIndex) throws BoxdException;

    /**
     * Get raw transaction info by transaction hash
     *
     * @param txHash
     * @return
     * @throws BoxdException
     */
    Transaction getRawTransaction(String txHash) throws BoxdException;

    /**
     * Make unsigned common transaction on-chain
     *
     * @param unsignedTxReq
     * @return
     * @throws BoxdException
     */
    TransactionResp makeUnsignedTx(UnsignedTxReq unsignedTxReq) throws BoxdException;

    /**
     * Make unsigned split address tx
     *
     * @param splitAddrTxReq
     * @return
     * @throws BoxdException
     */
    SplitAddrTxResp makeUnsignedSplitAddrTx(SplitAddrTxReq splitAddrTxReq) throws BoxdException;

    /**
     * Make unsigned token issue tx, if submited, this will issue a token
     *
     * @param tokenIssueTxReq
     * @return
     * @throws BoxdException
     */
    TokenIssueTxResp makeUnsignedTokenIssueTx(TokenIssueTxReq tokenIssueTxReq) throws BoxdException;

    /**
     * Make unsigned token transfer tx
     *
     * @param tokenTransferTxReq
     * @return
     * @throws BoxdException
     */
    TransactionResp makeUnsignedTokenTransferTx(TokenTransferTxReq tokenTransferTxReq) throws BoxdException;

    /**
     * Send transaction to the chain, it will come into the memory pool
     *
     * @param transaction
     * @return
     * @throws BoxdException
     */
    String sendTransaction(Transaction transaction) throws BoxdException;

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
    one.contentbox.boxd.response.ViewTxDetailResp viewTxDetail(String hash) throws BoxdException;

}
