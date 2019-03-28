package one.contentbox.boxd.request;

import lombok.Data;
import one.contentbox.boxd.proto.TokenTag;

@Data
public class Token {

    private String name;
    private int decimal;
    private int  supply;
    private String symbol;
}
