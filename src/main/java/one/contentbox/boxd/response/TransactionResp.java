package one.contentbox.boxd.response;

import com.google.protobuf.ByteString;
import lombok.Data;
import one.contentbox.boxd.proto.MakeTxResp;
import one.contentbox.boxd.proto.Transaction;

import java.util.List;

@Data
public class TransactionResp {

    private Transaction tx;
    private int count;
    private List<ByteString> rawMsgs;

    public TransactionResp(MakeTxResp makeTxResp){
        this.tx = makeTxResp.getTx();
        this.count = makeTxResp.getRawMsgsCount();
        this.rawMsgs = makeTxResp.getRawMsgsList();
    }
}
