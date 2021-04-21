package java0125.loginException;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/1/25 15:03
 */
// 非受查异常
public class MyNameException extends RuntimeException {
    public MyNameException() {
        System.out.println("name is error.");
    }
}
