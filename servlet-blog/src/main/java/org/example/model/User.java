package org.example.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/25 19:44
 */
@ToString
@Getter
@Setter
public class User {
    private Integer id;
    private String username;
    private String password;
    private String nickname;
    private Boolean sex;
    private Date birthday;
    private String head;
}
