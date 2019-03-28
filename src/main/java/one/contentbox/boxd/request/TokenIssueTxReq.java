package one.contentbox.boxd.request;

import lombok.Data;

@Data
public class TokenIssueTxReq {

    private long fee;
    private String issuee;
    private String issuer;
    private Token token;
}
