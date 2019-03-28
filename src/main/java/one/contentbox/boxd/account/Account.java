package one.contentbox.boxd.account;

import one.contentbox.boxd.BoxdException;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.FileAlreadyExistsException;

public abstract class Account {

    public abstract String dumpPrivKeyFromKeyStore(String  file, String passphrase) throws FileNotFoundException, BoxdException;

    public abstract String dumpPrivKeyFromKeyStore(File file, String passphrase) throws FileNotFoundException, BoxdException;

    public abstract String dumpAddrFromPrivKey(String privKey) throws BoxdException;

    public abstract String dumpPubKeyFromPrivKey(String privKey) throws BoxdException;

    public abstract String dumpPubKeyHashFromPrivKey(String privKey) throws BoxdException;

    public abstract String dumpAddrFromPrivKey(byte[] privKeyBytes);

    public abstract String dumpPubKeyFromPrivKey(byte[] privKeyBytes);

    public abstract String dumpPubKeyHashFromPrivKey(byte[] privKeyBytes);

    public abstract byte[] sign(byte[] txBytes, byte[] privKeyBytes);

    public abstract byte[] sign(byte[] txBytes, String privKey);

    public abstract byte[] dumpPubKey(String privKey) throws BoxdException;

    public abstract byte[] dumpPubKeyHash(String privKey) throws BoxdException;

    public abstract boolean newAccount(String passphrase, String keyStoreFilePath)
            throws FileAlreadyExistsException, Exception;
}
