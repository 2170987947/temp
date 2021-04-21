package java0125.loginException;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/1/25 17:47
 */
// 受查异常: 必须显示处理
public class MyPasswordException extends Exception {
    public MyPasswordException() {
        System.out.println("password is error.");
    }
}
