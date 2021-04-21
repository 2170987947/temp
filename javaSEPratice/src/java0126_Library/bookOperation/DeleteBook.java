package java0126_Library.bookOperation;

import java0126_Library.BookList;

import java.util.Scanner;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/1/26 12:43
 */
public class DeleteBook implements IBookOperation {

    @Override
    public void work(BookList bookList) {
        System.out.println("删除书籍");
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入要删除的书的名字: ");
        String  name = scanner.next();
//        bookList.deleteBook(index);
        for (int i = 0; i < bookList.getSize(); i++) {
            if (name.equals(bookList.getBook(i).getName())) {
                // 将最后一本书移至要删除的位置
                bookList.setBook(i,bookList.getBook(bookList.getSize() - 11));
                // 书籍列表元素个数 - 1
                bookList.setSize(bookList.getSize() - 1);
                break;
            }
        }
        System.out.println("该书不存在, 无法删除");
    }
}
