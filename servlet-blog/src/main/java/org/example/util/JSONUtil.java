package org.example.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.exception.AppException;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/25 20:44
 */
public class JSONUtil {
    private  static final ObjectMapper M = new ObjectMapper();
    // 序列化: 将 java 对象序列化为 json 字符串
    public static String serialize(Object o) {
        try {
            return M.writeValueAsString(o);
        } catch (JsonProcessingException e) {
            throw new AppException("XLH001", "序列化失败", e);
        }
    }
    public static <T> T deserialize(InputStream s, Class<T> c) {
        try {
            return M.readValue(s, c);
        } catch (IOException e) {
            throw new AppException("XLX002", "反序列化失败", e);
        }
    }
}
