package lession6;

public class VMStackTest {
    public static void main(String[] args) {
        int m = 1;
        int n = 2;
        swap(1, 2);
        System.out.printf("m = %s, n = %s\n", m, n);
    }

    private static void swap(int m, int n) {
        int tmp = m;
        m = n;
        n = tmp;
        Person person1 = new Person("person1");
        Person person2 = new Person("person2");
        swap(person1, person2);
        System.out.printf("p1 = %s, p2 = %s\n", person1.name, person2.name);
    }

    private static void swap(Person p1, Person p2) {
        Person tmp = p1;
        p1 = p2;
        p2 = tmp;
    }

    public static class Person {
        String name;
        Person(String name) {
            this.name = name;
        }
    }
}
