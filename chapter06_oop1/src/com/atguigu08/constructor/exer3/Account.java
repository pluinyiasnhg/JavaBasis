package com.atguigu08.constructor.exer3;

import java.util.AbstractCollection;

/**
 * ClassName: Account
 * Package: com.atguigu08.constructor.exer3
 * Description:
 * 1、写一个名为Account的类模拟账户。该类的属性和方法如下图所示。
 * 该类包括的属性：账号id，余额balance，年利率annualInterestRate；
 * 包含的构造器：自定义
 * 包含的方法：访问器方法（getter和setter方法），取款方法withdraw()，存款方法deposit()。
 *
 * 提示：在提款方法withdraw中，需要判断用户余额是否能够满足提款数额的要求，如果不能，应给出提示。
 * @Author pluinyiasnhg
 * @Create 2025/12/26 12:30
 * @Version 1.0
 */
public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    // 取钱
    public void withdraw(double amount) {
        if (amount > balance || amount < 0)
            System.out.println("余额不足，取款失败");
        else {
            balance -= amount;
            System.out.println("成功取出：" + amount);
        }
    }

    // 存钱
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("成功存入：" + amount);
        }
    }
}
