package one.contentbox.boxd.exception;

import one.contentbox.boxd.BoxdException;

public class NotImplementedException extends BoxdException {

    public NotImplementedException(){
        super(-1, "Api not implemented");
    }
}
