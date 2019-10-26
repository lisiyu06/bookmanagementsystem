package book_manager.operation;

import book_manager.book.BookList;

/**
 * Author: lisiyu
 * Created: 2019/10/26
 */
public class ExitOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("goodbye!");
        System.exit(0);
    }
}
