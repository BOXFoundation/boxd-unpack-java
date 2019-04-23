package one.contentbox.boxd.samples;

import one.contentbox.boxd.crypto.secp256k1.Secp256k1;
import org.bouncycastle.util.encoders.Hex;

import java.math.BigInteger;

/**
 * describe: SignSample
 *
 * @author wangjunbao2018@gmail.com
 * @date 2019/04/19
 */
public class SignSample {

    public static void main(String args[]) throws Exception{
        String addr = "b1fc1Vzz73WvBtzNQNbBSrxNCUC1Zrbnq4m";
        String privKeyHex = "29fbf01166fc31c941cadc1659a5f684f81c22c1113e5aa5b0af28b7dd453269";
        String txHex = "8179bc9245379aa8ad1993c703de3740d7bdc1ecb481523880e854718bad3749";
        BigInteger privKeyBigInteger = new BigInteger(privKeyHex, 16);
        BigInteger privKey = privKeyBigInteger;

        byte[] bbb = Secp256k1.PublicFromPrivateKey(Hex.decode(privKeyHex));
        System.out.println(Hex.toHexString(bbb));

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
    }
}