package java0126_Library.bookOperation;

import java0126_Library.BookList;

import java.util.Scanner;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/1/26 21:45
 */
public class ReturnBook implements IBookOperation {

    @Override
    public void work(BookList bookList) {
        System.out.println("还书");
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入书的名字: ");
        String name = scanner.next();
//        if (bookList.checkIndex(index) && bookList.getBook(index).isBorrowed()) {
//            bookList.getBook(index).setBorrowed(false);
//        }
        int i = 0;
        for (; i < bookList.getSize(); i++) {
            if (name.equals(bookList.getBook(i).getName())) {
                if (bookList.getBook(i).isBorrowed() == true) {
                    bookList.getBook(i).setBorrowed(false);
                    System.out.println("还书成功");
                    return;
                }
            }
        }
        if (i >= bookList.getSize()) {
            System.out.println("还书失败");
        }
    }
}
