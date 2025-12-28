package com.atguigu01._this.exer2;

/**
 * ClassName: Account
 * Package: com.atguigu01._this.exer2
 * Description:
 * 1、按照UML类图，创建Account类，提供必要的结构。
 * - 在提款方法withdraw()中，需要判断用户余额是否能够满足提款数额的要求，如果不能，应给出提示。
 * - deposit()方法表示存款。
 * @Author pluinyiasnhg
 * @Create 2025/12/26 20:17
 * @Version 1.0
 */
public class Account {
    private double balance;

    public Account(double init_balance) {
        balance = init_balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amt) {
        if (amt < 0) {
            System.out.println("存款失败");
        }
        else {
            balance += amt;
            System.out.println("成功存入：" + amt);
        }
    }

    public void withdraw(double amt) {
        if (amt < 0 || amt > balance) {
            System.out.println("取款失败");
        }
        else {
            balance -= amt;
            System.out.println("成功取出：" + amt);
        }
    }
}
