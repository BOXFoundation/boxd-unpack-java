package one.contentbox.boxd.samples;

import one.contentbox.boxd.crypto.secp256k1.Secp256k1;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.DERSequenceGenerator;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.crypto.ec.CustomNamedCurves;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.ec.FixedPointCombMultiplier;
import org.bouncycastle.util.encoders.Hex;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.Security;

//import org.bitcoinj.core.ECKey;
//import org.bitcoinj.core.Sha256Hash;
//import org.web3j.crypto.ECKeyPair;
//import org.web3j.crypto.Sign;
//import org.web3j.utils.Numeric;

/**
 * describe: SignSample
 *
 * @author wangjunbao2018@gmail.com
 * @date 2019/04/19
 */
public class SignSample {

    public static final ECDomainParameters CURVE;
    // The parameters of the secp256k1 curve that Bitcoin uses.
    private static final X9ECParameters CURVE_PARAMS = CustomNamedCurves.getByName("secp256k1");

    static {
        Security.addProvider(new BouncyCastleProvider());
        CURVE = new ECDomainParameters(CURVE_PARAMS.getCurve(), CURVE_PARAMS.getG(), CURVE_PARAMS.getN(),
                CURVE_PARAMS.getH());
    }


    protected static byte[] derByteStream(BigInteger r, BigInteger s) throws IOException {
        // Usually 70-72 bytes.
        ByteArrayOutputStream bos = new ByteArrayOutputStream(72);
        DERSequenceGenerator seq = new DERSequenceGenerator(bos);
        seq.addObject(new ASN1Integer(r));
        seq.addObject(new ASN1Integer(s));
        seq.close();
        return bos.toByteArray();
    }

    public static void main(String args[]) throws Exception{
        String addr = "b1fc1Vzz73WvBtzNQNbBSrxNCUC1Zrbnq4m";
        String privKeyHex = "29fbf01166fc31c941cadc1659a5f684f81c22c1113e5aa5b0af28b7dd453269";
        String txHex = "8179bc9245379aa8ad1993c703de3740d7bdc1ecb481523880e854718bad3749";
        BigInteger privKeyBigInteger = new BigInteger(privKeyHex, 16);
        BigInteger privKey = privKeyBigInteger;


        byte [] a = Hex.decode(txHex);




        ECPoint ecPoint =  null;
        if (privKey.bitLength() > CURVE.getN().bitLength()) {
            privKey = privKey.mod(CURVE.getN());
        }
        ecPoint = new FixedPointCombMultiplier().multiply(CURVE.getG(), privKey);
        byte[] aaa = ecPoint.getEncoded(true);
        System.out.println(Hex.toHexString(aaa));


        byte[] bbb = Secp256k1.PublicFromPrivateKey(Hex.decode(privKeyHex));
        System.out.println(Hex.toHexString(bbb));


//03ac5906f34b6f12150d49942dcd3df4b30716cb78abc9e3f6e488e2c1f28ab8bd
//03ac5906f34b6f12150d49942dcd3df4b30716cb78abc9e3f6e488e2c1f28ab8bd
//04ac5906f34b6f12150d49942dcd3df4b30716cb78abc9e3f6e488e2c1f28ab8bd17c8cd3a225b2a903710e7102b383a1e83e4bdbdfb8f174536a379bbdc1068ad
//

        //3044022019baa58637d50074c6a49910ced0b273736bb1b8b5096c2797ea4523fc06f4f502204e9ff57345485c4d24807ef1cbd3408151674e27d876c34c925813f245e1f7f9

//        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC");
//        ECGenParameterSpec ecGenParameterSpec = new ECGenParameterSpec("secp256k1");
//        keyPairGenerator.initialize(ecGenParameterSpec, SecureRandom.);
//        KeyPair keyPair = keyPairGenerator.generateKeyPair();


//        //  bitcoin
//        ECKey ecKey = ECKey.fromPrivate(privKeyBigInteger);
//        Sha256Hash sha256Hash = Sha256Hash.wrap(Hex.decode(txHex));
//        ECKey.ECDSASignature signature = ecKey.sign(sha256Hash);
//        System.out.println(signature.r);
//        System.out.println(signature.s);
//        byte[] ret =  signature.encodeToDER();
//        System.out.println(Hex.toHexString(ret));

        // eth
//        System.out.println("\n\neth:");
//        org.web3j.crypto.Sign.SignatureData signatureData = Sign
//                .signMessage(Hex.decode(txHex), ECKeyPair.create(privKeyBigInteger), false);
//        System.out.println(Numeric.toBigInt(signatureData.getR()));
//        System.out.println(Numeric.toBigInt(signatureData.getS()));
//        System.out.println(Hex.toHexString(derByteStream(Numeric.toBigInt(signatureData.getR()), Numeric.toBigInt(signatureData.getS()))));


//        // cava
//        SECP256K1.Signature signature1 = SECP256K1
//                .signHashed(Hex.decode(txHex), SECP256K1.KeyPair.
//                        fromSecretKey(SECP256K1.SecretKey.fromInteger(privKeyBigInteger)));
//        byte[] data  = signature1.bytes().toArray();
//        System.out.println("\n\ncava:");
//        System.out.println(signature1.r());
//        System.out.println(signature1.s());
//        System.out.println(Hex.toHexString(derByteStream(signature1.r(), signature1.s())));
//
//        // boxd
//        byte[] boxdRet = TxUtils.sign(Hex.decode(txHex), Hex.decode(privKeyHex));
//        System.out.println("\n\nboxd:");
//        System.out.println(Hex.toHexString(boxdRet));
//
//        // neb
//        byte[] nebRet  = Secp256k1.Sign(Hex.decode(txHex), Hex.decode(privKeyHex));
//        System.out.println("\n\nneb:");
//        System.out.println(Hex.toHexString(nebRet));

        //
//        Security.addProvider(new BouncyCastleProvider());
//        ECParameterSpec ecSpec = ECNamedCurveTable.getParameterSpec("B-571");
//        KeyPairGenerator g = KeyPairGenerator.getInstance("ECDSA", "BC");
//        g.initialize(ecSpec, new SecureRandom());
//        KeyPair keyPair = g.generateKeyPair();
//        System.out.println(keyPair.getPrivate().getFormat());
//        Signature ecdsaSign = Signature.getInstance("SHA512withECDSA", "BC");
//        ecdsaSign.initSign(keyPair.getPrivate());
//        ecdsaSign.update(Hex.decode(txHex));
//        byte[] signature = ecdsaSign.sign();
//        System.out.println(Hex.toHexString(signature));
    }
}

//73b16e963656c7597d18238260c0e1b9c6fa3d02bfd225843525963d73e7458f
//3045022100b13f6aa73b69c1f0f0462680b607e7644d8a897a8766ac09ff7b6c271bfbdd9e022071eb455399bc735142fca1416433adf400ee62a4a8eb5015cdd61ffd5c45d145

//         216fdf577fc913641453f5460a7cc5dfe36adb974134e64fd3db04d3aaaab4950      c4d7a280aa0b491ffee5323d1dd9aeeeaf8f2fb3917c156d6c91426ca3e2851  00
//30440220 216fdf577fc913641453f5460a7cc5dfe36adb974134e64fd3db04d3aaaab4950 2200 c4d7a280aa0b491ffee5323d1dd9aeeeaf8f2fb3917c156d6c91426ca3e2851