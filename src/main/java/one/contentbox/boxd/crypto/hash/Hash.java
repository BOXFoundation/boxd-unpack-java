package one.contentbox.boxd.crypto.hash;

import org.bouncycastle.crypto.digests.RIPEMD160Digest;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Hash {

    public static byte[] Ripemd160(byte[]... args) {
        RIPEMD160Digest digest = new RIPEMD160Digest();
        for (int i = 0; i < args.length; i++) {
            byte[] bytes = args[i];
            digest.update(bytes, 0, bytes.length);
        }
        byte[] out = new byte[20];
        digest.doFinal(out, 0);
        return out;
    }

    public static byte[] sha256(byte[] input) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            return digest.digest(input);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Couldn't find a SHA-256 provider", e);
        }
    }
}
