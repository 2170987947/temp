package java0120;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/1/20 9:52
 */
public class Animal1 {
    public String name;
    public Animal1(String name) {
        System.out.println("super " + this.name);
    }
    public void jump() {
        System.out.println("jump");
    }
}
