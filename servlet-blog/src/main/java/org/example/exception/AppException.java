package org.example.exception;


/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/25 20:26
 */
public class AppException extends RuntimeException {
    private String code;

    public AppException(String code, String message) {
        this(code, message, null);
    }

    public AppException(String code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }
    public String getCode() {
        return code;
    }
}
