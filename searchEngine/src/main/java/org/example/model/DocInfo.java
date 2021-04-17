package org.example.model;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/15 10:19
 */


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DocInfo docInfo = (DocInfo) o;
        return id.equals(docInfo.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    private String content; // 网页正文: <标签> 内容 <标签>, 内容为正文
}
