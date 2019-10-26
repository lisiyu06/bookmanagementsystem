package book_manager.user;

import book_manager.operation.*;

import java.util.Scanner;

/**
 * Author: lisiyu
 * Created: 2019/10/26
 */
public class NormalUser extends User {
    @Override
    public int menu() {
        System.out.println("============");
        System.out.println("hello " + name);
        System.out.println("1. 查找图书");
        System.out.println("2. 借阅图书");
        System.out.println("3. 归还图书");
        System.out.println("0. 退出");
        System.out.println("============");
        System.out.println("请输入您的选择: ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        // close 本质上是在关闭 System.in
        // 由于后面还需要用到 System.in, 此处不能盲目关闭.
        // scanner.close();
        return choice;
    }

    public NormalUser(String name) {
        super(name);

        // 在这里构造 operation 数组
        // 我们让数组中 operation 对象的顺序和菜单中的序号相匹配
        opreations = new IOperation[] {
                new ExitOperation(),
                new FindOperation(),
                new BorrowOperation(),
                new ReturnOperation()

        };


    }
}
