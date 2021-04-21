package test0421;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/21 12:50
 */
class Person {
    String name = "No name";

    public Person(String name) {
        this.name = name;
    }
}
class Employee extends Person {
    String empID = "0000";

    public Employee(String empID) {
        super("ss");
        this.empID = empID;
    }
}
public class ex1 {
    public static void main(String[] args) {

    }
}
