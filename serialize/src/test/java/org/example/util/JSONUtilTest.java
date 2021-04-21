package org.example.util;

import org.junit.Assert;
import org.junit.Test;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/3/30 7:56
 */
public class JSONUtilTest {

    // 单元测试: junit 框架使用方法上的 @Test 注解,
    // 保证方法为 public void
    @Test
    public void testSerialize() {
        // 测试序列化操作: 使用 map 模拟复杂对象
        Map map = new HashMap();
        map.put("name", "java42班");
        map.put("student", new int[]{1, 2});
        String json = JSONUtil.serialize(map);
        System.out.println(json);
        Assert.assertNotNull(json);
    }

    @Test
    public void testDeserialize() {
        // 类加载器加载谋个资源, 返回输入流.
        InputStream is = JSONUtilTest.class.getClassLoader()
                .getResourceAsStream("login.json");
        Map map = JSONUtil.deserialize(is, Map.class);
        System.out.println(map);
        Assert.assertNotNull(map);
    }
}
