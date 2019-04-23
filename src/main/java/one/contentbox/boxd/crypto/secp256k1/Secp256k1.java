package one.contentbox.boxd.crypto.secp256k1;

import one.contentbox.boxd.crypto.keystore.ECDSASignature;
import one.contentbox.boxd.crypto.keystore.ECKeyPair;
import one.contentbox.boxd.exception.BoxdException;
import one.contentbox.boxd.util.ByteUtils;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.DERSequenceGenerator;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.asn1.x9.X9IntegerConverter;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.ec.CustomNamedCurves;
import org.bouncycastle.crypto.generators.ECKeyPairGenerator;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECKeyGenerationParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.ec.FixedPointCombMultiplier;
import org.bouncycastle.math.ec.FixedPointUtil;
import org.bouncycastle.util.encoders.Hex;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.SecureRandom;

public class Secp256k1 {

    // The parameters of the secp256k1 curve that Bitcoin uses.
    private static final X9ECParameters CURVE_PARAMS = CustomNamedCurves.getByName("secp256k1");

    /**
     * The parameters of the secp256k1 curve that Bitcoin uses.
     */
    public static final ECDomainParameters CURVE;

    /**
     * Equal to CURVE.getN().shiftRight(1), used for canonicalising the S value of a signature. If you aren't
     * sure what this is about, you can ignore it.
     */
    public static final BigInteger HALF_CURVE_ORDER;

    static {

        // Tell Bouncy Castle to precompute data that's needed during secp256k1 calculations. Increasing the width
        // number makes calculations faster, but at a cost of extra memory usage and with decreasing returns. 12 was
        // picked after consulting with the BC team.
        FixedPointUtil.precompute(CURVE_PARAMS.getG());
        CURVE = new ECDomainParameters(CURVE_PARAMS.getCurve(), CURVE_PARAMS.getG(), CURVE_PARAMS.getN(),
                CURVE_PARAMS.getH());
        HALF_CURVE_ORDER = CURVE_PARAMS.getN().shiftRight(1);
    }

    public static byte[] GenerateECKey() {
        ECKeyPairGenerator generator = new ECKeyPairGenerator();
        ECKeyGenerationParameters keygenParams = new ECKeyGenerationParameters(CURVE, new SecureRandom());
        generator.init(keygenParams);
        AsymmetricCipherKeyPair keypair = generator.generateKeyPair();
        ECPrivateKeyParameters privParams = (ECPrivateKeyParameters) keypair.getPrivate();
        BigInteger privKey = privParams.getD();
        return ByteUtils.BigIntegerToBytes(privKey, 32);
    }

    public static byte[] PublicFromPrivateKey(byte[] privateKey) {
        BigInteger privKey = new BigInteger(1, privateKey);
        if (privKey.bitLength() > CURVE.getN().bitLength()) {
            privKey = privKey.mod(CURVE.getN());
        }

        ECPoint point = new FixedPointCombMultiplier().multiply(CURVE.getG(), privKey);
        return point.getEncoded(true);
    }


    public static byte[] PublicFromPrivateKey(BigInteger privateKey) {
        return PublicFromPrivateKey(privateKey.toByteArray());
    }

    private static void check(boolean test, String message) {
        if (!test) throw new IllegalArgumentException(message);
    }

    /**
     * Decompress a compressed public key (x co-ord and low-bit of y-coord).
     *
     * @param xBN  -
     * @param yBit -
     * @return -
     */
    private static ECPoint decompressKey(BigInteger xBN, boolean yBit) {
        X9IntegerConverter x9 = new X9IntegerConverter();
        byte[] compEnc = x9.integerToBytes(xBN, 1 + x9.getByteLength(CURVE.getCurve()));
        compEnc[0] = (byte) (yBit ? 0x03 : 0x02);
        return CURVE.getCurve().decodePoint(compEnc);
    }

    public static byte[] sign(byte[] txBytes, String privKey) throws BoxdException {
        return sign(txBytes, Hex.decode(privKey));
    }

    public static byte[] sign(byte[] txBytes, byte[] privKeyBytes) throws BoxdException {
        ECDSASignature signature = ECKeyPair.create(privKeyBytes).sign(txBytes);
        try {
            return derByteStream(signature.r, signature.s);
        } catch (IOException e) {
            throw new BoxdException(-1, "Sign io error");
        }
    }

    private static byte[] derByteStream(BigInteger r, BigInteger s) throws IOException {
        // Usually 70-72 bytes.
        ByteArrayOutputStream bos = new ByteArrayOutputStream(72);
        DERSequenceGenerator seq = new DERSequenceGenerator(bos);
        seq.addObject(new ASN1Integer(r));
        seq.addObject(new ASN1Integer(s));
        seq.close();
        return bos.toByteArray();
    }
}