package java0126_Library.bookOperation;


import java0126_Library.Book;
import java0126_Library.BookList;

import java.util.Scanner;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/1/26 12:43
 */
public class UpdateBook implements IBookOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("更新书籍信息");
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入书的名字: ");
        String name = scanner.next();
//        bookList.updateBook(index);
        for (int i = 0; i < bookList.getSize(); i++) {
            if (name.equals(bookList.getBook(i).getName())) {
                System.out.println("请输入修改后书的名字: ");
                String name1 = scanner.next();
                System.out.println("请输入修改后书的价格: ");
                int price1 = scanner.nextInt();
                System.out.println("请输入修改后书的作者: ");
                String author1 = scanner.next();
                System.out.println("请输入修改后书的类型: ");
                String type1 = scanner.next();
                bookList.setBook(i,new Book(name1,price1,author1,type1));
                System.out.println("更新成功");
            }
        }
    }
}
