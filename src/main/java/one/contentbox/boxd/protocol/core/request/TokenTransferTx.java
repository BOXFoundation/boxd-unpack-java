package one.contentbox.boxd.protocol.core.request;

import lombok.Data;
import lombok.ToString;

import java.util.Map;

@Data
@ToString
public class TokenTransferTx {

    private String from;
    private long fee;
    private String tokenHash;
    private int  tokenIndex;
    private Map<String, Long> to;
}
