package com.atguigu01._static.exer1;

/**
 * ClassName: Account
 * Package: com.atguigu01._static.exer1
 * Description:
 * 编写一个类实现银行账户的概念，包含的属性有“帐号”、“密码”、“存款余额”、“利率”、“最小余额”，定义封装这些属性的方法。
 * 账号要自动生成。
 *
 * 考虑：哪些属性可以设计成static属性。
 * @Author pluinyiasnhg
 * @Create 2026/1/1 07:58
 * @Version 1.0
 */
public class Account {
    private int id;
    private String password;
    private double balance;
    private static double interestRate;
    private static double minBalance = 1.0; // 最小余额
    private static int init = 1001;  // 帐号id自动生成

    public Account() {
        this.id = init++;
        password = "000000";
    }

    public Account(String password, double balance) {
        this();
        this.password = password;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(double interestRate) {
        Account.interestRate = interestRate;
    }

    public static double getMinBalance() {
        return minBalance;
    }

    public static void setMinBalance(double minBalance) {
        Account.minBalance = minBalance;
    }

    public static int getInit() {
        return init;
    }

    public static void setInit(int init) {
        Account.init = init;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                '}';
    }
}
