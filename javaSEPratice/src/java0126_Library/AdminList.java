package java0126_Library;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/1/27 0:26
 */
public class AdminList {
    private Admin[] admins = new Admin[10];
    private int size;

    public AdminList() {
        this.admins[this.size++] = new Admin("樊茂茂","123");
    }

    public Admin getAdmin(int index) {
        return this.admins[index];
    }

    public void setAdmin(int index, Admin admin) {
        this.admins[index] = admin;
    }
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
