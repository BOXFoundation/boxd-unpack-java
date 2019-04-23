package one.contentbox.boxd.crypto.keystore;

/**
 * describe: ECKeyPair
 *
 * @author wangjunbao2018@gmail.com
 * @date 2019/04/23
 */

import one.contentbox.boxd.crypto.secp256k1.Secp256k1;
import one.contentbox.boxd.util.ByteUtils;
import org.bouncycastle.jcajce.provider.asymmetric.ec.BCECPrivateKey;
import org.bouncycastle.jcajce.provider.asymmetric.ec.BCECPublicKey;

import java.math.BigInteger;
import java.util.Arrays;

/**
 * Elliptic Curve SECP-256k1 generated key pair.
 */
public class ECKeyPair {
    private final BigInteger privateKey;
    private final BigInteger publicKey;

    public ECKeyPair(BigInteger privateKey, BigInteger publicKey) {
        this.privateKey = privateKey;
        this.publicKey = publicKey;
    }

    public BigInteger getPrivateKey() {
        return privateKey;
    }

    public BigInteger getPublicKey() {
        return publicKey;
    }


    public static ECKeyPair create(byte[] privateKey) {
        byte[] publicKey = Secp256k1.PublicFromPrivateKey(privateKey);
        return new ECKeyPair(ByteUtils.toBigInt(privateKey), ByteUtils.toBigInt(publicKey));
    }

    public static ECKeyPair create(BigInteger privateKey) {
        return create(privateKey.toByteArray());
    }

    public static ECKeyPair create(KeyPair keyPair) {
        BCECPrivateKey privateKey = (BCECPrivateKey) keyPair.getPrivate();
        BCECPublicKey publicKey = (BCECPublicKey) keyPair.getPublic();

        BigInteger privateKeyValue = privateKey.getD();

        // Ethereum does not use encoded public keys like bitcoin - see
        // https://en.bitcoin.it/wiki/Elliptic_Curve_Digital_Signature_Algorithm for details
        // Additionally, as the first bit is a constant prefix (0x04) we ignore this value
        byte[] publicKeyBytes = publicKey.getQ().getEncoded(false);
        BigInteger publicKeyValue =
                new BigInteger(1, Arrays.copyOfRange(publicKeyBytes, 1, publicKeyBytes.length));

        return new ECKeyPair(privateKeyValue, publicKeyValue);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ECKeyPair ecKeyPair = (ECKeyPair) o;

        if (privateKey != null
                ? !privateKey.equals(ecKeyPair.getPrivateKey()) : ecKeyPair.getPrivateKey() != null) {
            return false;
        }

        return publicKey != null
                ? publicKey.equals(ecKeyPair.getPublicKey()) : ecKeyPair.getPublicKey() == null;
    }

    @Override
    public int hashCode() {
        int result = privateKey != null ? privateKey.hashCode() : 0;
        result = 31 * result + (publicKey != null ? publicKey.hashCode() : 0);
        return result;
    }
}