package book_manager.operation;

import book_manager.book.BookList;

/**
 * Author: lisiyu
 * Created: 2019/10/26
 */
public class PrintAllOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("打印所有的书籍信息");
        for (int i = 0; i <bookList.getSize(); i++) {
            System.out.println(bookList.getBook(i));
        }
        System.out.println("共计 " + bookList.getSize() + "本书！");
    }
}