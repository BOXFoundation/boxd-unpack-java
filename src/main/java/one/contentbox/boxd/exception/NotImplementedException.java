package one.contentbox.boxd.exception;

public class NotImplementedException extends BoxdException {

    public NotImplementedException(){
        super(-1, "Api not implemented");
    }
}
