package one.contentbox.boxd.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bitcoinj.core.Base58;
import org.bouncycastle.util.encoders.Hex;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;


public class OutPointHashParserUtils {


    public static Outpoint parse(String base58Outpint) {
        byte[] indexByte = new byte[4];

        byte[] bs = Base58.decode(base58Outpint);
        indexByte[0] = bs[bs.length - 1];
        indexByte[1] = bs[bs.length - 2];
        indexByte[2] = bs[bs.length - 3];
        indexByte[3] = bs[bs.length - 4];

        String hexString = Hex.toHexString(bs);
        String hash = hexString.substring(0, hexString.length() - 10);
        int index = ByteBuffer.wrap(indexByte).getInt();
        return new Outpoint(hash, index);
    }

    public static String encodeTokenId(String hash, int index) {

        byte[] hbhbytes = ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(index).array();
        String hexIndex = Hex.toHexString(hbhbytes);

        String hexStr = hash + "3a" + hexIndex;
        byte[] bs = Hex.decode(hexStr);

        String tokenId = Base58.encode(bs);
        return tokenId;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    static class Outpoint {
        String hash;
        int index;

        @Override
        public String toString() {
            return hash + ":" + index;
        }
    }
}
