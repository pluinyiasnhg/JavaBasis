package com.atguigu02.singleton;

/**
 * ClassName: BankTest
 * Package: com.atguigu02.singleton
 * Description:
 * 饿汉式
 * @Author pluinyiasnhg
 * @Create 2026/1/1 08:33
 * @Version 1.0
 */
public class BankTest {
    public static void main(String[] args) {
        Bank bank1 = Bank.getInstance();
        Bank bank2 = Bank.getInstance();

        System.out.println(bank1 == bank2);
    }
}

class Bank {
    // 1. 私有化构造器
    private Bank() {

    }

    // 2. 内部提供一个当前类的实例
    // 4. 此实例也必须静态化
    private static Bank instance = new Bank();

    // 3. 提供公共的静态的方法，返回当前类的对象
    public static Bank getInstance() {
        return instance;
    }
}