package com.atguigu01._this.exer2;

/**
 * ClassName: BankTest
 * Package: com.atguigu01._this.exer2
 * Description:
 * 4、创建BankTest类，进行测试。
 * @Author pluinyiasnhg
 * @Create 2025/12/26 20:26
 * @Version 1.0
 */
public class BankTest {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addCustomer("张", "三");
        bank.addCustomer("李", "四");
        System.out.println("当前银行客户个数：" + bank.getNumberOfCustomer());

        Customer zhang = bank.getCustomer(0);
        Customer li = bank.getCustomer(1);
        System.out.println("客户1的姓：" + zhang.getFirstName() + "，名：" + zhang.getLastName() +
                "，账户是否开通：" + zhang.getAccount());
        zhang.setAccount(new Account(10000));
        System.out.println("客户1的账户余额：" + zhang.getAccount().getBalance());

        Account zhangAccount = zhang.getAccount();
        zhangAccount.withdraw(500);
        zhangAccount.deposit(1000);
        zhangAccount.withdraw(100000);
        zhangAccount.deposit(-100);
    }
}
