package one.contentbox.boxd.protocol.core.request;

import lombok.Data;
import lombok.ToString;

import java.util.Map;


@Data
@ToString
public class SplitAddrTx {

    private String from;
    private long fee;
    private Map<String, Long>  detail;

}
