package java0111;

public class MyArrayList {
    public int[] elem;
    public int usedSize;
    public MyArrayList() {
        this.elem = new int[10];
        this.usedSize = 0;
    }
    //在 pos 位置新增元素
    public void add(int pos, int data) {
        if (pos == this.usedSize) {
            this.usedSize++;
            this.elem[usedSize] = data;
        }
        if (pos < this.usedSize) {
            this.usedSize++;
            for (int i = usedSize; i > pos; i--) {
                this.elem[i] = this.elem[i - 1];
            }
            this.elem[pos] = data;
        }
    }
    //判定是否包含某元素
    public boolean contains(int toFind) {
        return true;
    }
    //查找某个元素对应的位置
    public int search(int toFind) {
        return -1;
    }
    //获取 pos 位置的元素
    public int getPos(int pos) {
        return -1;
    }
    //给 pos 位置的元素设为 value
    public void setPos(int value) {

    }
    //删除第一次出现的关键字 key
    public void remove(int toRemove) {

    }
    //获取顺序表长度
    public int sizee() {
        return 0;
    }
    //打印顺序表
    public void display() {

    }
    //清空顺序表
    public void clear() {

    }
}
