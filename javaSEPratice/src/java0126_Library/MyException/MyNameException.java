package java0126_Library.MyException;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/1/26 23:59
 */
// 受查异常: 显示处理
public class MyNameException extends Exception{
    public MyNameException() {
        System.out.println("异常: 用户名错误");
    }
}
