package one.contentbox.boxd.exception;

/**
 * Boxd Exception class
 */
public class BoxdException extends Exception{

    private int code;

    public BoxdException(int code, String message){
        super(message);
        this.code = code;
    }
}
