package one.contentbox.boxd.request;

import lombok.Data;

import java.util.Map;

@Data
public class TokenTransferTxReq {

    private String from;
    private long fee;
    private String tokenHash;
    private int  tokenIndex;
    private Map<String, Long> to;
}
