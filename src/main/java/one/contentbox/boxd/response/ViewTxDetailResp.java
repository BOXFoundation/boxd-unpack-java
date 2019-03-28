package one.contentbox.boxd.response;

import lombok.Data;

@Data
public class ViewTxDetailResp {

    private int blockHeight;
    private long blockTime;
    private one.contentbox.boxd.proto.TxDetail txDetail;

    public ViewTxDetailResp(one.contentbox.boxd.proto.ViewTxDetailResp viewTxDetailResp){
        this.blockHeight = viewTxDetailResp.getBlockHeight();
        this.blockTime = viewTxDetailResp.getBlockTime();
        this.txDetail = viewTxDetailResp.getDetail();
    }
}
