package org.example.test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class TestGson {
    public static void main(String[] args) {
        Student student = new Student();
        Gson gson = new GsonBuilder().create();
        String string = gson.toJson(student);
        System.out.println(gson.toJson(string));

        System.out.println(gson.fromJson(string, Student.class));

    }
}
