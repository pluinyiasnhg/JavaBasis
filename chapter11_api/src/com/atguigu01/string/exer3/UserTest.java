package com.atguigu01.string.exer3;
import org.hamcrest.core.Is;

import java.util.Scanner;

/**
 * ClassName: UserTest
 * Package: com.atguigu01.string.exer3
 * Description:
 * 案例：模拟用户登录
 * （1）定义用户类，属性为用户名和密码，提供相关的getter和setter方法，构造器，toString()。
 * （2）使用数组存储多个用户对象。
 * （3）录入用户和密码，对比用户信息，匹配成功登录成功，否则登录失败。
 *     > 登录失败时，当用户名错误，提示没有该用户。
 *     > 登录失败时，当密码错误时，提示密码有误。
 * @Author pluinyiasnhg
 * @Create 2026/2/12 11:05
 * @Version 1.0
 */
public class UserTest {
    public static void main(String[] args) {
        User[] arr = new User[3];
        arr[0] = new User("songhk", "123");
        arr[1] = new User("Tom", "8888");
        arr[2] = new User("Jerry", "6666");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入用户名：");
        String name = scanner.next();
        System.out.print("请输入密码：");
        String password = scanner.next();

        // 验证用户名和密码
        boolean isFlag = true;  // 默认用户不存在
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getName().equals(name)) {
                isFlag = false;

                if (arr[i].getPassword().equals(password))
                    System.out.println("登录成功，" + name);
                else
                    System.out.println("密码有误");

                break;
            }
        }

        if (isFlag) {
            System.out.println("没有该用户");
        }

        scanner.close();
    }
}
