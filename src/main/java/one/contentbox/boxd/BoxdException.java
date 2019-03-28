package one.contentbox.boxd;

import lombok.Data;

/**
 * Boxd Exception class
 */
@Data
public class BoxdException extends Exception{

    private int code;

    public BoxdException(int code, String message){
        super(message);
        this.code = code;
    }
}
