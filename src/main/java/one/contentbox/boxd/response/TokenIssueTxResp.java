package one.contentbox.boxd.response;

import com.google.protobuf.ByteString;
import lombok.Data;
import one.contentbox.boxd.proto.MakeTokenIssueTxResp;
import one.contentbox.boxd.proto.Transaction;

import java.util.List;

@Data
public class TokenIssueTxResp {
    private Transaction transaction;
    private int issueOutIndex;
    private int rawMsgCount;
    private List<ByteString> rawMsgs;
    private String hash;
    private String tokenAddress;

    public TokenIssueTxResp(MakeTokenIssueTxResp tokenIssueTxResp){
        this.transaction = tokenIssueTxResp.getTx();
        this.issueOutIndex = tokenIssueTxResp.getIssueOutIndex();
        this.rawMsgCount = tokenIssueTxResp.getRawMsgsCount();
        this.rawMsgs = tokenIssueTxResp.getRawMsgsList();
    }
}
