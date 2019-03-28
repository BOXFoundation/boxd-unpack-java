package one.contentbox.boxd.util;

import org.bitcoinj.core.Base58;

public class AddressUtils {


    public static boolean isVaildAddr(String addr) {
        if(addr == null || "".equalsIgnoreCase(addr)
                || addr.length() != 35 || !addr.startsWith("b1")){
            return false;
        }

        byte[] base58Checked  = Base58.decodeChecked(addr);
        if(base58Checked == null || base58Checked.length != 22){
            return false;
        }

        return true;
    }

    public static  byte[] getPkh(String addr) {
        if(addr.length() != 35 && !addr.startsWith("b1")){
            return null;
        }

        byte[] base58Checked = Base58.decodeChecked(addr);

        if(base58Checked.length != 22){
            return null;
        }

        byte[] a = new byte[base58Checked.length - 2];
        for(int i = 2; i < base58Checked.length; i ++){
            a[i-2] = base58Checked[i];
        }

        return a;
    }
}
