package org.example.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/17 11:18
 */
@Getter
@Setter
@ToString
public class Result {
    private Integer id;
    private int weight;
    private String title;
    private String url;
    private String desc;
}
