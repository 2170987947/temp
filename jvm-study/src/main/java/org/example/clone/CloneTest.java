package org.example.clone;

public class CloneTest {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Yuisama", "JavaTeacher");
        Student student = new Student("张三", 18, teacher);
        Student cloneStudent = student.clone();
        System.out.println(cloneStudent.getName());
        System.out.println(cloneStudent.getAge());
        // true
        System.out.println(teacher == cloneStudent.getTeacher());
    }
}