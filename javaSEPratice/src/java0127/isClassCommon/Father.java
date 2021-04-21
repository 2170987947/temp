package java0127.isClassCommon;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/1/27 12:34
 */
public abstract class Father {
    public void work() {
        System.out.println(this.getClass());
        // 判断 this 的类型 是否与 Child 相同
        if (this instanceof Child) {
            System.out.println("[ " + this);
            System.out.println("1");
        }
        if (this.getClass().equals(Child.class)) {
            System.out.println("判断相等");
        }
        if (this instanceof Child)
        if (!(this instanceof Chlid2)) {
            System.out.println(Child.class);
            System.out.println("不是");
        }
    }
}
