package one.contentbox.boxd.response;

import com.google.protobuf.ByteString;
import lombok.Data;
import one.contentbox.boxd.proto.MakeSplitAddrTxResp;
import one.contentbox.boxd.proto.Transaction;

import java.util.List;

@Data
public class SplitAddrTxResp {

    private String splitAddr;
    private Transaction transaction;
    private int rawMsgCount;
    private List<ByteString> rawMsgs;
    private String hash;


    public SplitAddrTxResp(MakeSplitAddrTxResp splitAddrTxResp){
        this.splitAddr = splitAddrTxResp.getSplitAddr();
        this.transaction = splitAddrTxResp.getTx();
        this.rawMsgCount = splitAddrTxResp.getRawMsgsCount();
        this.rawMsgs = splitAddrTxResp.getRawMsgsList();
    }
}
