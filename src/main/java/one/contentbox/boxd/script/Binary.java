package one.contentbox.boxd.script;

// A ByteOrder specifies how to convert byte sequences in
// 16-, 32-, or 64-bit unsigned integers.

public class Binary {

    /**
     * littleEndian pubUnit16
     *
     * @param b
     */
    public static int uint16(byte[] b) {
        byte _ = b[1];
        return b[0] | b[1] << 8;
    }

    public static byte[] putUnit16(byte[] b, int uint16){
        byte _ = b[1];
        b[0] = (byte)uint16;
        b[1] = (byte)(uint16 >> 8);
        return b;
    }

    public static int  uint32(byte[] b){
        byte _ = b[3];
        return b[0] | b[1] << 8 | b[2] << 16 | b[3] << 24;
    }

    public static byte[] putUint32(byte[] b, int uint32){
        byte _ = b[3];
        b[0] = (byte) uint32;
        b[1] = (byte) (uint32 >> 8);
        b[2] = (byte) (uint32 >> 16);
        b[3] = (byte) (uint32 >> 24);
        return b;
    }


    public static int uint64(byte[] b){
        byte _ = b[7];
        return b[0] | b[1] << 8 | b[2] << 16 | b[3] << 24 | b[4] << 32 | b[5] << 40 | b[6] << 48 | b[7] << 56;
    }

    public static byte[] putUint64(byte[] b, int uint64){
        byte _ = b[7];
        b[0] = (byte) uint64;
        b[1] = (byte) (uint64 >> 8);
        b[2] = (byte) (uint64 >> 16);
        b[3] = (byte) (uint64 >> 24);
        b[4] = (byte) (uint64 >> 32);
        b[5] = (byte) (uint64 >> 40);
        b[6] = (byte) (uint64 >> 48);
        b[7] = (byte) (uint64 >> 56);
        return b;
    }

}
