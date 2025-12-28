package com.atguigu01.oop;

/**
 * ClassName: Phone
 * Package: com.atguigu01.oop
 * Description:
 * 创建一个手机类 Phone,
 * 手机有品牌和价格，手机的功能包括打电话、发送消息、玩游戏
 * @Author pluinyiasnhg
 * @Create 2025/12/24 19:30
 * @Version 1.0
 */
public class Phone {
    String name;
    double price;

    public void call() {
        System.out.println("手机能拨打电话");
    }

    public void sendMessage(String message) {
        System.out.println("手机发送一条消息：" + message);
    }

    public void playGame() {
        System.out.println("手机能玩游戏");
    }
}
