package book_manager.user;

import book_manager.book.BookList;
import book_manager.operation.IOperation;

/**
 * Author: lisiyu
 * Created: 2019/10/26
 */
public abstract class User {
    protected String name;

    // 持有当前用户的基本操作
    protected IOperation[] opreations;

    public User(String name) {
        this.name = name;
    }

    // 打印一个操作菜单. 不同的用户
    // 支持的操作不同, 对应的菜单也就不同

    public abstract int menu();

    // 根据用户输入的选项(menu返回结果)
    // 调用对应的操作对象
    // 注意多态在这个代码中的体现

    public void doOpreation(int choice, BookList bookList) {
        opreations[choice].work(bookList);
    }
}
