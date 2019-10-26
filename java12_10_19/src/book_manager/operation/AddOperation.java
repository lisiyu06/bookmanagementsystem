package book_manager.operation;

import book_manager.book.Book;
import book_manager.book.BookList;

import java.util.Scanner;

/**
 * Author: lisiyu
 * Created: 2019/10/19
 */
public class AddOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("新增一本书籍");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入书名");
        String name = scanner.next();
        System.out.println("请输入序号");
        String id = scanner.next();
        System.out.println("请输入作者");
        String author = scanner.next();
        System.out.println("请输入价格:");
        int price = scanner.nextInt();
        System.out.println("请输入类别: ");
        String type = scanner.next();

        Book book = new Book(name, id, author, price, type, false);

        bookList.setBook(bookList.getSize(), book);
        bookList.setSize(bookList.getSize() + 1);
    }
}
