package org.example.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/25 20:02
 */
@ToString
@Setter
@Getter
public class JSONResponse {
    private boolean success;
    private String code;
    private String message;
    private Object data;
}
