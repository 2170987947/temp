package java0126_Library;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/1/26 12:37
 */
public class BookList {
    private Book[] books = new Book[100] ;
    private int size;

    public BookList() {
        this.books[this.size++] = new Book("三国演义",100, "罗贯中","历史小说");
    }

    public void setBook(int index, Book book) {
        this.books[index] = book;
    }
    public Book getBook(int index) {
        if (!checkIndex(index)) {
            return null;
        }
        return this.books[index];
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return this.size;
    }

    public boolean checkIndex(int index) {
        if (index < 0 && index >= this.size) {
            System.out.println("输入有误, 您输入的下标不存在!");
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BookList{" +
                "books=" + Arrays.toString(books) +
                '}';
    }
}
