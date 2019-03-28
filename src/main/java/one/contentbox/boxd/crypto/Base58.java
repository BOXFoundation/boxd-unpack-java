package one.contentbox.boxd.crypto;

public class Base58 {

    public String hash(byte[] bytes) {
        return org.bitcoinj.core.Base58.encode(bytes);
    }
}
