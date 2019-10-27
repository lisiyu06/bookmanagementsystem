package book_manager.operation;

import book_manager.book.Book;
import book_manager.book.BookList;

import java.util.Scanner;

/**
 * Author: lisiyu
 * Created: 2019/10/26
 */
public class DelOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("输入书籍");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要删除的书籍的序号");
        String id = scanner.next();

        // 先查找
        int i= 0;
        for(i = 0; i < bookList.getSize(); i++) {
            Book book = bookList.getBook(i);
            if (book.getId().equals(id)) {
                // 找到了
                break;
            }
        }
        if (i >= bookList.getSize()) {
            // 没找到
            System.out.println("未找到要删除的书籍");
            return;
        }
        // 处理找到了要删除的书籍的情况
        // 直接用最后一个元素覆盖当前要删除的元素
        // 再进行尾删
        Book lastBook = bookList.getBook(bookList.getSize() - 1);
        bookList.setBook(i, lastBook);
        bookList.setSize(bookList.getSize() - 1);
        System.out.println("删除成功！");

    }

}
