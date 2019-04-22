package one.contentbox.boxd.crypto.hash;

import org.bouncycastle.crypto.digests.RIPEMD160Digest;
import org.bouncycastle.crypto.digests.SHA3Digest;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Hash {

    public static byte[] Sha3256(byte[]... args) {
        SHA3Digest digest = new SHA3Digest();
        for (int i = 0; i < args.length; i++) {
            byte[] bytes = args[i];
            digest.update(bytes, 0, bytes.length);
        }
        byte[] out = new byte[256 / 8];
        digest.doFinal(out, 0);
        return out;
    }

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

    public static byte[] sha256hash160(byte[] input) {
        byte[] sha256 = Sha256Hash.hash(input);
        RIPEMD160Digest digest = new RIPEMD160Digest();
        digest.update(sha256, 0, sha256.length);
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
