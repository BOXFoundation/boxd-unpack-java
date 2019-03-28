package one.contentbox.boxd.response;

import lombok.Data;
import one.contentbox.boxd.proto.GetBalanceResp;

import java.util.List;

@Data
public class BalanceResp {

    private int count;
    private List<Long> balances;

    public BalanceResp(GetBalanceResp getBalanceResp){
        this.count  = getBalanceResp.getBalancesCount();
        this.balances = getBalanceResp.getBalancesList();
    }
}
