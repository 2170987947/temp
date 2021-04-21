package java0125.genericity;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/1/27 0:14
 */
public class Test2 {
    public static void main(String[] args) {

        MyArray<String> myArray = new MyArray<String>(2);
        myArray.add("12");
        myArray.add("34");
        System.out.println(myArray.size());
        System.out.println(myArray.get(0));
        MyArray<Integer> myArray1 = new MyArray<>(2);
        myArray1.add(1);
        System.out.println(myArray1.get(0));
        System.out.println(myArray1.get(1));
        System.out.println(myArray.size());
        System.out.println(myArray.get(0));

    }
}
