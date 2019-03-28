package one.contentbox.boxd.util;

public class ArrayUtils {

    public static byte[] join(byte[] first, byte[] second)
    {
        byte[] ret = new byte[first.length + second.length];
        System.arraycopy(first, 0, ret, 0, first.length);
        System.arraycopy(second, 0, ret, first.length, second.length);
        return ret;
    }
}
