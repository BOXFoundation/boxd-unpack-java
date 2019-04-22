```bash
BoxdClient
│
├── block
      ├── addNode # 将给定的 nodeId 添加到本地节点，本地节点将连接到给定节点
      ├── getBlockByHash # Get block info by the block hash
      ├── getBlockByHeight # Get block info by the block height
      ├── getBlockHashByHeight # Get block hash of the block by height
      ├── getBlockHeaderByHash # Get header info of a block by the block hash
      ├── getBlockHeaderByHeight # Get header info of a block by the block height
      ├── getNodeInfo # Get rpc node info
      ├── getBlockHeight # Get the height of the last block
      ├── viewBlockDetail # Get block info by the given block hash

├── wallet
      ├── getNetworkId # Get network id [ign]
      ├── getBalances # Get the balance of the given addresses
      ├── getTokenbalances # Get the token balance by the given address, tokenHash and tokenIndex
      ├── fetchUtxos # Get UTXOs by the given address
      ├── fetchTokenUtxos # Get UTXOs by the given address, tokenHash and tokenIndex

      ├── dumpAddrFromPrivKey # 由私钥拿到地址 ()
      ├── dumpPrivKeyFromKeyStore # 由 KS 拿到私钥 ()

├── TX
    ├── makeUnsignedTx # Make unsigned common transaction on-chain
    ├── makeUnsignedSplitAddrTx # Make unsigned split address tx
    ├── makeUnsignedTokenIssueTx # Make unsigned token issue tx, if submited, this will issue a token
    ├── makeUnsignedTokenTransferTx # Make unsigned token transfer tx
    ├── createTransaction # Create unsigned transaction by UTXOs
    ├── signTransaction # Sign a unsigned transaction
    ├── sendTransaction # Send transaction to the chain, it will come into the memory pool
    ├── viewTxDetail # Get transaction info by the given transaction hash

    ├── createSplitAddr # 构建分账合约 (整个流程)
    ├── createTransaction # 创建交易 (先实现一种)

├── crypto

├── util

├── core
```