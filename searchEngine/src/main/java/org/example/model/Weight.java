package org.example.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/15 15:34
 */
@Getter
@Setter
@ToString
public class Weight {

    private DocInfo doc;
    private int weight;
    private String keyword;

}
