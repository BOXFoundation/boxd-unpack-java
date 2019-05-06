package one.contentbox.boxd.util;

import one.contentbox.boxd.crypto.hash.Base58;
import one.contentbox.boxd.crypto.hash.Hash;
import one.contentbox.boxd.crypto.hash.Sha256Hash;
import one.contentbox.boxd.exception.BoxdException;

public class AddressUtils {


    public static boolean isValidAddr(String addr) {
        // check len
        if(addr == null || "".equalsIgnoreCase(addr)
                || addr.length() != 35){
            return false;
        }

        // check prefix
        if( !addr.startsWith("b1") && !addr.startsWith("b2")){
            return false;
        }

        // check ckecksum
        try {
            byte[] base58Checked = Base58.decodeChecked(addr);
            if (base58Checked == null || base58Checked.length != 22) {
                return false;
            }
        }catch (Exception e){
            return false;
        }
        return true;
    }

    public static  byte[] getPubKeyHashFromAddr(String addr) throws BoxdException {
        if( !isValidAddr(addr)){
            throw new BoxdException(-1, "Addr format error");
        }

        byte[] base58Checked;
        try {
            base58Checked = Base58.decodeChecked(addr);
            if(base58Checked.length != 22){
                return null;
            }
        }catch (Exception e) {
            throw new BoxdException(-1, "Addr checksum error");
        }

        byte[] result = new byte[base58Checked.length - 2];
        for(int i = 2; i < base58Checked.length; i ++){
            result[i-2] = base58Checked[i];
        }
        return result;
    }

    public static String getAddrFromPubKey(byte[] pubKey) {
        byte[] pub = Hash.Ripemd160(Sha256Hash.hash(pubKey));
        // prefix
        byte[] prefix = {0x13, 0x26};

        // checksum
        byte[] all = ArrayUtils.join(prefix, pub);

        byte[] checksumAll = Sha256Hash.hashTwice(all);
        byte[] checksum = new byte[4];
        System.arraycopy(checksumAll, 0, checksum, 0, 4);

        byte[] tmp = ArrayUtils.join(prefix, pub);
        byte[] content = ArrayUtils.join(tmp, checksum);

        String addr = Base58.encode(content);
        return addr;
    }

}
