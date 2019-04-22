package one.contentbox.boxd.util;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import one.contentbox.boxd.crypto.hash.Base58;
import org.bouncycastle.util.encoders.Hex;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;


public class TokenIdUtils {


    public static Outpoint parse(String base58Outpint) throws Exception{
        byte[] indexByte = new byte[4];

        try {
            byte[] bs = Base58.decode(base58Outpint);

            indexByte[0] = bs[bs.length - 1];
            indexByte[1] = bs[bs.length - 2];
            indexByte[2] = bs[bs.length - 3];
            indexByte[3] = bs[bs.length - 4];

            String hexString = Hex.toHexString(bs);
            String hash = hexString.substring(0, hexString.length() - 10);
            int index = ByteBuffer.wrap(indexByte).getInt();
            return new Outpoint(hash, index);
        }catch (Exception e){
            throw new Exception("Input can't be decoded");
        }
    }

    public static String encodeTokenId(String hash, int index) {

        byte[] hbhbytes = ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(index).array();
        String hexIndex = Hex.toHexString(hbhbytes);

        String hexStr = hash + "3a" + hexIndex;
        byte[] bs = Hex.decode(hexStr);

        String tokenId = Base58.encode(bs);
        return tokenId;
    }

    @AllArgsConstructor
    @NoArgsConstructor
    static class Outpoint {
        String hash;
        int index;

        @Override
        public String toString() {
            return hash + ":" + index;
        }

        public String getHash() {
            return this.hash;
        }

        public int getIndex() {
            return this.index;
        }

        public void setHash(String hash) {
            this.hash = hash;
        }

        public void setIndex(int index) {
            this.index = index;
        }

        public boolean equals(Object o) {
            if (o == this) return true;
            if (!(o instanceof Outpoint)) return false;
            final Outpoint other = (Outpoint) o;
            if (!other.canEqual((Object) this)) return false;
            final Object this$hash = this.getHash();
            final Object other$hash = other.getHash();
            if (this$hash == null ? other$hash != null : !this$hash.equals(other$hash)) return false;
            if (this.getIndex() != other.getIndex()) return false;
            return true;
        }

        public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            final Object $hash = this.getHash();
            result = result * PRIME + ($hash == null ? 43 : $hash.hashCode());
            result = result * PRIME + this.getIndex();
            return result;
        }

        protected boolean canEqual(Object other) {
            return other instanceof Outpoint;
        }
    }
}
