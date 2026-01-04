package com.atguigu04.block.exer;

/**
 * ClassName: UserTest
 * Package: com.atguigu04.block.exer
 * Description:
 * （2）编写测试类，测试类main方法的代码
 * @Author pluinyiasnhg
 * @Create 2026/1/1 15:59
 * @Version 1.0
 */
public class UserTest {
    public static void main(String[] args) {
        User user1 = new User();
        System.out.println(user1.getInfo());
        User user2 = new User("张三", "654321");
        System.out.println(user2.getInfo());
    }
}
