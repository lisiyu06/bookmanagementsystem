package book_manager.operation;

import book_manager.book.Book;
import book_manager.book.BookList;

import java.util.Scanner;

/**
 * Author: lisiyu
 * Created: 2019/10/26
 */
public class BorrowOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("借阅书籍");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要借阅的书本的编号：");
        String id = scanner.next();
        for (int i = 0; i < bookList.getSize(); i++) {
            Book book = bookList.getBook(i);
            if (!book.getId().equals(id)) {
                continue;
            }
            // 执行具体的借书操作
            if (book.isBorrowed()) {
                System.out.println("此书已被借走");
                break;
            }
            book.setBorrowed(true);
        }
    }
}
