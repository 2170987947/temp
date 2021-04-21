package java0126_Library.MyException;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/1/26 23:59
 */
public class MyPasswordException extends Exception {
    public MyPasswordException() {
        System.out.println("异常: 密码错误");
    }
}
