package one.contentbox.boxd.account;

import one.contentbox.boxd.exception.BoxdException;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.FileAlreadyExistsException;

public interface AccountManager {

    boolean dumpKeyStoreFromPrivKey(String privKey, String password, String path)
            throws FileAlreadyExistsException,  BoxdException;

    String dumpPrivKeyFromKeyStore(String  file, String passphrase) throws FileNotFoundException, BoxdException;
    String dumpPrivKeyFromKeyStore(File file, String passphrase) throws FileNotFoundException, BoxdException;

    String dumpAddrFromPrivKey(String privKey) throws BoxdException;
    String dumpAddrFromPrivKey(byte[] privKeyBytes) throws BoxdException;


    byte[] dumpPubKeyHashFromPrivKey(byte[] privKey) throws BoxdException;
    byte[] dumpPubKeyHashFromPrivKey(String privKey) throws BoxdException;

    byte[] dumpPubKeyHashFromAddr(String addr) throws BoxdException;

    byte[] dumpPubKeyFromPrivKey(String privKey) throws BoxdException;
    byte[] dumpPubKeyFromPrivKey(byte[] privKey) throws BoxdException;


    boolean newAccount(String passphrase, String keyStoreFilePath)
            throws FileAlreadyExistsException, BoxdException;
}
