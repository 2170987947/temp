package org.example.model;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/15 10:19
 */


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 每个本地
 */
@Setter
@Getter
@ToString
public class DocInfo {
    private Integer id; // 类似数据库中的主键, 识别不同文档
    private String title; // 标题: html 的文件名
    private String url; // oracle 官网 api 文档下 html 的上的 url
    private String content; // 网页正文: <标签> 内容 <标签>, 内容为正文
}
