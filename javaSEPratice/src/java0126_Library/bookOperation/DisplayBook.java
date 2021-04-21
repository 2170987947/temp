package java0126_Library.bookOperation;

import java0126_Library.BookList;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/1/26 14:12
 */
public class DisplayBook implements IBookOperation {

    @Override
    public void work(BookList bookList) {
        System.out.println("显示书籍");
        for (int i = 0; i < bookList.getSize(); i++) {
            System.out.println(bookList.getBook(i));
        }
    }
}
