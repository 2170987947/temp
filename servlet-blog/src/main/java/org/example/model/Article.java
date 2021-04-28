package org.example.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/25 19:46
 */
@ToString
@Getter
@Setter
public class Article {
    private Integer id;
    private String title;
    private String content;
    private Date createTime;
    private Integer viewCount;
    private Integer userId;
}
