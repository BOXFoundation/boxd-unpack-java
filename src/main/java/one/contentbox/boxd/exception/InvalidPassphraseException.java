package one.contentbox.boxd.exception;

public class InvalidPassphraseException extends BoxdException {

    public InvalidPassphraseException(String msg){
        super(-1, msg);
    }
}
