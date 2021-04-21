package java0126_Library.bookOperation;

import java0126_Library.Book;
import java0126_Library.BookList;

import java.util.Scanner;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/1/26 12:43
 */
public class FindBook implements IBookOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("查找书籍");
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入查找的书的名字: ");
        String  name = scanner.next();
//        Book book = bookList.getBook(index);
//        System.out.println(book);
        for (int i = 0; i < bookList.getSize(); i++) {
            if (bookList.getBook(i).getName().contains(name)) {
                System.out.println(bookList.getBook(i));
            }
        }
    }
}
