package java0126_Library.bookOperation;

import java0126_Library.BookList;


import java.util.Scanner;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/1/26 15:48
 */
public class BorrowBook implements IBookOperation {

    @Override
    public void work(BookList bookList) {
        System.out.println("借书");
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入书的名字: ");
        String name = scanner.next();
        for (int i = 0; i < bookList.getSize(); i++) {
            // 书存在
            if (bookList.getBook(i).getName().equals(name)) {
                // 书未被借
                if (bookList.getBook(i).isBorrowed() == false) {
                    // 借书, 将该书的状态改为 true ,表示被借
                    bookList.getBook(i).setBorrowed(true);
                    System.out.println("借书成功");
                    return;
                }
            }
        }
        System.out.println("借书失败");
    }
}
