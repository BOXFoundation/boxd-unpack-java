package one.contentbox.boxd.exception;

import one.contentbox.boxd.BoxdException;

public class InvalidPassphraseException extends BoxdException {

    public InvalidPassphraseException(String msg){
        super(-1, msg);
    }
}
