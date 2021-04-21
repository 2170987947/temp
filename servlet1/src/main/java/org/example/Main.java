package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.demo.User;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/20 21:23
 */
public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        User user = new User();
        user.setUsername("fmm");
        user.setPassword("123");
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(user);
        System.out.println(json);

        String input = "{\"username\":\"mm\",\"password\":\"123\"}";
        User user1 = mapper.readValue(input, User.class);
        System.out.println(user1);

    }
}
