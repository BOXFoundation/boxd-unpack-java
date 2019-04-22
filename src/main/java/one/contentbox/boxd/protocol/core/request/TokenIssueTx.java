package one.contentbox.boxd.protocol.core.request;

import lombok.Data;
import lombok.ToString;
import one.contentbox.boxd.protocol.core.response.TokenTag;

@Data
@ToString
public class TokenIssueTx {

    private long fee;
    private String issuee;
    private String issuer;
    private TokenTag token;
}
