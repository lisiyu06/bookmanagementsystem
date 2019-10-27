package book_manager.operation;

import book_manager.book.BookList;

import java.util.Scanner;

/**
 * Author: lisiyu
 * Created: 2019/10/26
 */
public class FindOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("查找书籍");
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
    }
}
