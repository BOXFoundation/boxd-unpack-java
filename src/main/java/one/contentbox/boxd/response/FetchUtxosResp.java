package one.contentbox.boxd.response;

import lombok.Data;
import one.contentbox.boxd.proto.Utxo;

import java.util.List;

@Data
public class FetchUtxosResp {

    private int count;
    private List<Utxo> utxos;


    public FetchUtxosResp(one.contentbox.boxd.proto.FetchUtxosResp fetchUtxosResp){
        this.count = fetchUtxosResp.getUtxosCount();
        this.utxos = fetchUtxosResp.getUtxosList();
    }
}
