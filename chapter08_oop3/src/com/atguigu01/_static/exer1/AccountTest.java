package com.atguigu01._static.exer1;

/**
 * ClassName: AccountTest
 * Package: com.atguigu01._static.exer1
 * Description:
 * 编写主类，使用银行账户类，输入、输出3个储户的上述信息。
 * @Author pluinyiasnhg
 * @Create 2026/1/1 08:10
 * @Version 1.0
 */
public class AccountTest {
    public static void main(String[] args) {
        Account acc1 = new Account();
        Account acc2 = new Account("123456", 2000);
        System.out.println(acc1);
        System.out.println(acc2);

        // 静态方法
        Account.setInterestRate(0.0123);
        Account.setMinBalance(100);
        System.out.println("银行利率为" + Account.getInterestRate());
        System.out.println("最小余额为" + Account.getMinBalance());
    }
}
