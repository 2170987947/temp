package java0126_Library;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/1/27 0:27
 */
public class NormalUserList {
    private NormalUser[] normalUsers = new NormalUser[10];
    private int size;

    public NormalUserList() {
        this.normalUsers[this.size++] = new NormalUser("小樊","1");
    }
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setNormalUser(int index, NormalUser normalUser) {
        this.normalUsers[index] = normalUser;
    }

    public NormalUser getNormalUser(int index) {
        return this.normalUsers[index];
    }
}
