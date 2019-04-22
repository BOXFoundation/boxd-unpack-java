package one.contentbox.boxd.account;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class KeyStore {

    String id;
    String address;
    Cryto crypto;
    String version;

    public KeyStore() {
    }

    public String getId() {
        return this.id;
    }

    public String getAddress() {
        return this.address;
    }

    public Cryto getCrypto() {
        return this.crypto;
    }

    public String getVersion() {
        return this.version;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCrypto(Cryto crypto) {
        this.crypto = crypto;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof KeyStore)) return false;
        final KeyStore other = (KeyStore) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$address = this.getAddress();
        final Object other$address = other.getAddress();
        if (this$address == null ? other$address != null : !this$address.equals(other$address)) return false;
        final Object this$crypto = this.getCrypto();
        final Object other$crypto = other.getCrypto();
        if (this$crypto == null ? other$crypto != null : !this$crypto.equals(other$crypto)) return false;
        final Object this$version = this.getVersion();
        final Object other$version = other.getVersion();
        if (this$version == null ? other$version != null : !this$version.equals(other$version)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $address = this.getAddress();
        result = result * PRIME + ($address == null ? 43 : $address.hashCode());
        final Object $crypto = this.getCrypto();
        result = result * PRIME + ($crypto == null ? 43 : $crypto.hashCode());
        final Object $version = this.getVersion();
        result = result * PRIME + ($version == null ? 43 : $version.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof KeyStore;
    }

    public String toString() {
        return "KeyStore(id=" + this.getId() + ", address=" + this.getAddress() + ", crypto=" + this.getCrypto() + ", version=" + this.getVersion() + ")";
    }

    static class Cryto {
        String ciphertext;
        String cipher;
        Cipherparams cipherparams;
        String mac;
        Kdfparams kdfparams;

        public Cryto() {
        }

        public String getCiphertext() {
            return this.ciphertext;
        }

        public String getCipher() {
            return this.cipher;
        }

        public Cipherparams getCipherparams() {
            return this.cipherparams;
        }

        public String getMac() {
            return this.mac;
        }

        public Kdfparams getKdfparams() {
            return this.kdfparams;
        }

        public void setCiphertext(String ciphertext) {
            this.ciphertext = ciphertext;
        }

        public void setCipher(String cipher) {
            this.cipher = cipher;
        }

        public void setCipherparams(Cipherparams cipherparams) {
            this.cipherparams = cipherparams;
        }

        public void setMac(String mac) {
            this.mac = mac;
        }

        public void setKdfparams(Kdfparams kdfparams) {
            this.kdfparams = kdfparams;
        }

        public boolean equals(Object o) {
            if (o == this) return true;
            if (!(o instanceof Cryto)) return false;
            final Cryto other = (Cryto) o;
            if (!other.canEqual((Object) this)) return false;
            final Object this$ciphertext = this.getCiphertext();
            final Object other$ciphertext = other.getCiphertext();
            if (this$ciphertext == null ? other$ciphertext != null : !this$ciphertext.equals(other$ciphertext))
                return false;
            final Object this$cipher = this.getCipher();
            final Object other$cipher = other.getCipher();
            if (this$cipher == null ? other$cipher != null : !this$cipher.equals(other$cipher)) return false;
            final Object this$cipherparams = this.getCipherparams();
            final Object other$cipherparams = other.getCipherparams();
            if (this$cipherparams == null ? other$cipherparams != null : !this$cipherparams.equals(other$cipherparams))
                return false;
            final Object this$mac = this.getMac();
            final Object other$mac = other.getMac();
            if (this$mac == null ? other$mac != null : !this$mac.equals(other$mac)) return false;
            final Object this$kdfparams = this.getKdfparams();
            final Object other$kdfparams = other.getKdfparams();
            if (this$kdfparams == null ? other$kdfparams != null : !this$kdfparams.equals(other$kdfparams))
                return false;
            return true;
        }

        public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            final Object $ciphertext = this.getCiphertext();
            result = result * PRIME + ($ciphertext == null ? 43 : $ciphertext.hashCode());
            final Object $cipher = this.getCipher();
            result = result * PRIME + ($cipher == null ? 43 : $cipher.hashCode());
            final Object $cipherparams = this.getCipherparams();
            result = result * PRIME + ($cipherparams == null ? 43 : $cipherparams.hashCode());
            final Object $mac = this.getMac();
            result = result * PRIME + ($mac == null ? 43 : $mac.hashCode());
            final Object $kdfparams = this.getKdfparams();
            result = result * PRIME + ($kdfparams == null ? 43 : $kdfparams.hashCode());
            return result;
        }

        protected boolean canEqual(Object other) {
            return other instanceof Cryto;
        }

        public String toString() {
            return "KeyStore.Cryto(ciphertext=" + this.getCiphertext() + ", cipher=" + this.getCipher() + ", cipherparams=" + this.getCipherparams() + ", mac=" + this.getMac() + ", kdfparams=" + this.getKdfparams() + ")";
        }
    }

    static class Cipherparams {
        String iv;

        public Cipherparams() {
        }

        public String getIv() {
            return this.iv;
        }

        public void setIv(String iv) {
            this.iv = iv;
        }

        public boolean equals(Object o) {
            if (o == this) return true;
            if (!(o instanceof Cipherparams)) return false;
            final Cipherparams other = (Cipherparams) o;
            if (!other.canEqual((Object) this)) return false;
            final Object this$iv = this.getIv();
            final Object other$iv = other.getIv();
            if (this$iv == null ? other$iv != null : !this$iv.equals(other$iv)) return false;
            return true;
        }

        public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            final Object $iv = this.getIv();
            result = result * PRIME + ($iv == null ? 43 : $iv.hashCode());
            return result;
        }

        protected boolean canEqual(Object other) {
            return other instanceof Cipherparams;
        }

        public String toString() {
            return "KeyStore.Cipherparams(iv=" + this.getIv() + ")";
        }
    }

    static class Kdfparams {
        String salt;
        int dklen;
        int n;
        int r;
        int p;

        public Kdfparams() {
        }

        public String getSalt() {
            return this.salt;
        }

        public int getDklen() {
            return this.dklen;
        }

        public int getN() {
            return this.n;
        }

        public int getR() {
            return this.r;
        }

        public int getP() {
            return this.p;
        }

        public void setSalt(String salt) {
            this.salt = salt;
        }

        public void setDklen(int dklen) {
            this.dklen = dklen;
        }

        public void setN(int n) {
            this.n = n;
        }

        public void setR(int r) {
            this.r = r;
        }

        public void setP(int p) {
            this.p = p;
        }

        public boolean equals(Object o) {
            if (o == this) return true;
            if (!(o instanceof Kdfparams)) return false;
            final Kdfparams other = (Kdfparams) o;
            if (!other.canEqual((Object) this)) return false;
            final Object this$salt = this.getSalt();
            final Object other$salt = other.getSalt();
            if (this$salt == null ? other$salt != null : !this$salt.equals(other$salt)) return false;
            if (this.getDklen() != other.getDklen()) return false;
            if (this.getN() != other.getN()) return false;
            if (this.getR() != other.getR()) return false;
            if (this.getP() != other.getP()) return false;
            return true;
        }

        public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            final Object $salt = this.getSalt();
            result = result * PRIME + ($salt == null ? 43 : $salt.hashCode());
            result = result * PRIME + this.getDklen();
            result = result * PRIME + this.getN();
            result = result * PRIME + this.getR();
            result = result * PRIME + this.getP();
            return result;
        }

        protected boolean canEqual(Object other) {
            return other instanceof Kdfparams;
        }

        public String toString() {
            return "KeyStore.Kdfparams(salt=" + this.getSalt() + ", dklen=" + this.getDklen() + ", n=" + this.getN() + ", r=" + this.getR() + ", p=" + this.getP() + ")";
        }
    }
}