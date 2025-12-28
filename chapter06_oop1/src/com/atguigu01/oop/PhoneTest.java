package com.atguigu01.oop;

/**
 * ClassName: PhoneTest
 * Package: com.atguigu01.oop
 * Description:
 * 测试类 Phone
 * @Author pluinyiasnhg
 * @Create 2025/12/24 19:34
 * @Version 1.0
 */
public class PhoneTest {
    public static void main(String[] args) {
        Phone phone = new Phone();

        phone.name = "Honor";
        phone.price = 2000.0;
        System.out.println("我的手机是" + phone.name + "牌子的，它的价格是" + phone.price + "元");

        phone.call();
        phone.sendMessage("你好，世界！");
        phone.playGame();
    }
}
