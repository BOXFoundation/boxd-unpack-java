package one.contentbox.boxd.account;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class KeyStoreFile {

    String id;
    String address;
    Cryto crypto;
    String version;

    @Data
    static class Cryto {
        String ciphertext;
        String cipher;
        Cipherparams cipherparams;
        String mac;
        Kdfparams kdfparams;
    }

    @Data
    static class Cipherparams {
        String iv;
    }

    @Data
    static class Kdfparams {
        String salt;
        int dklen;
        int n;
        int r;
        int p;
    }
}