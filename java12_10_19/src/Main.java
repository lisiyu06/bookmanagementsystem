import book_manager.book.BookList;
import book_manager.user.Admin;
import book_manager.user.NormalUser;
import book_manager.user.User;

import java.util.Scanner;

/**
 * Author: lisiyu
 * Created: 2019/10/28
 */
public class Main {
    public static void main(String[] args) {
        // 程序的入口
        // 1. 准备好书籍信息数据
        BookList bookList = new BookList();
        // 2. 创建用户（此处使用多态）
        User user = login();
        // 3. 进入主循环
        while (true) {
            int choice = user.menu();
            user.doOpreation(choice, bookList);
        }
    }

    public static User login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的姓名");
        String name = scanner.next();
        System.out.println("请输入您的角色：");
        System.out.println("1. 普通用户");
        System.out.println("2. 管理员");
        int role = scanner.nextInt();
        if (role == 1) {
            return new NormalUser(name);
        }
        return new Admin(name);
    }
}
