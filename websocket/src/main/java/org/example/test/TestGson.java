package org.example.test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class TestGson {
    public static void main(String[] args) {
        Student student = new Student();
        student.setId("18060");
        
        student.setUsername("fff");
        Gson gson = new GsonBuilder().create();
        String string = gson.toJson(student);
        System.out.println(string);
        Student student1 = gson.fromJson(string, Student.class);
        System.out.println(student1);
    }
}
