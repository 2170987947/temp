package java0126_Library.bookOperation;

import java0126_Library.AdminList;
import java0126_Library.Book;
import java0126_Library.BookList;


import java.util.Scanner;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/1/26 12:42
 */
public class AddBook implements IBookOperation {
    
    @Override
    public void work(BookList bookList) {
        System.out.println("添加书籍");
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入书的名字: ");
        String name = scanner.next();
        System.out.println("请输入书的价格:");
        int price = scanner.nextInt();
        System.out.println("请输入书的类型:");
        String type = scanner.next();
        System.out.println("请输入书的作者:");
        String author = scanner.next();
        bookList.setBook(bookList.getSize() - 1,new Book(name,price,author,type));
    }
}
