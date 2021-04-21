package java0126_Library.bookOperation;

import java0126_Library.BookList;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/1/26 14:19
 */
public class Exit implements IBookOperation {

    @Override
    public void work(BookList bookList) {
        System.out.println("退出");
//        bookList.setOpen(false);
        System.exit(0);
    }
}
