package one.contentbox.boxd.util;

import com.google.protobuf.ByteString;
import one.contentbox.boxd.proto.OutPoint;
import one.contentbox.boxd.proto.Transaction;
import one.contentbox.boxd.proto.TxIn;

import java.util.ArrayList;
import java.util.List;

public class TxUtils {


    public static byte[] calcTxHashForSig(byte[] scriptPubKey, Transaction transaction, int txInIdx){

        // CalcTxHashForSig
        Transaction.Builder builder = Transaction.newBuilder();
        List<TxIn> vins = new ArrayList<>();
        for(int i = 0; i < transaction.getVinCount(); i ++){
            TxIn txIn = transaction.getVin(i);

            TxIn.Builder txInBuilder = TxIn.newBuilder();
            txInBuilder.setPrevOutPoint(OutPoint.newBuilder()
                    .setHash(txIn.getPrevOutPoint().getHash()).setIndex(txIn.getPrevOutPoint().getIndex()).build());

            if(i != txInIdx){
            }else {
                txInBuilder.setScriptSig(ByteString.copyFrom(scriptPubKey));
            }

            vins.add(txInBuilder.build());
        }
        builder.addAllVin(vins);
        builder.addAllVout(transaction.getVoutList());
        Transaction newTx = builder.build();

        // CalcTxHash
        byte[] data = newTx.toByteArray();

        return data;
    }

}
