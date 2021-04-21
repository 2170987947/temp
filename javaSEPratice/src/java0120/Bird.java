package java0120;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/1/20 9:52
 */
public class Bird extends Animal1 {

    public Bird(String name) {
        super(name);
    }
    final public void jump() {
        System.out.println("jump");
    }
}
