package book_manager.operation;

import book_manager.book.Book;
import book_manager.book.BookList;

import java.util.Scanner;

/**
 * Author: lisiyu
 * Created: 2019/10/26
 */
public class ReturnOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("归还书籍");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要归还的书籍的编号");
        String id = scanner.next();
        for (int i = 0; i < bookList.getSize(); i++) {
            Book book = bookList.getBook(i);
            if (!book.getId().equals(id)) {
                continue;
            }
            // 执行具体的归还操作
            if (!book.isBorrowed()) {
                System.out.println("此书已被归还！");
                break;
            }
            book.setBorrowed(false);
        }
    }
}
