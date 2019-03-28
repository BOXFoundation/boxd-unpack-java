package one.contentbox.boxd.request;

import lombok.Data;

import java.util.Map;

@Data
public class SplitAddrTxReq {

    private String from;
    private long fee;
    private Map<String, Long>  detail;

}
