package test0412;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/12 19:18
 */
public class Test3 {
    public static boolean isAdmin(String userId) {
        return userId.toLowerCase().equals("admin");
    }
    public static void main(String[] args) {
        System.out.println(isAdmin("Admin"));
        Test3();
    }
    public static void Test3() {
        System.out.println("kkk");
    }
}
