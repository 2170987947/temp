package java0125.genericity;


/**
 * @author FMM
 * @version 7.0
 * @date 2021/1/25 20:37
 */
// MyArray 为泛型类的名称
// E 为泛型类的形参列表, 是一种类型
public class MyArray<E> {
    public E[] array = null;
    public int size;
    public int capacity;

    public MyArray(int capacity) {
        this.array = (E[]) new Object[capacity];
        this.size = 0;
        this.capacity = capacity;
    }
    public void add(E data) {
        if (size < capacity) {
            array[size++] = data;
        }
    }
    public E get(int index) {
        return this.array[index];
    }
    public int size() {
        return this.size;
    }

}
