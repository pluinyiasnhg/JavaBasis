package com.atguigu05._super.exer3;

/**
 * ClassName: CheckAccountTest
 * Package: com.atguigu05._super.exer3
 * Description:
 * 要求：写一个用户程序测试CheckAccount类。
 * 在用户程序中，创建一个账号为1122、余额为20000、年利率4.5%，可透支限额为5000元的CheckAccount对象。
 *
 * 使用withdraw方法提款5000元，并打印账户余额和可透支额。
 * 再使用withdraw方法提款18000元，并打印账户余额和可透支额。
 * 再使用withdraw方法提款3000元，并打印账户余额和可透支额。
 *
 * 提示：
 * （1）子类CheckAccount的构造方法需要将从父类继承的3个属性和子类自己的属性全部初始化。
 * （2）父类Account的属性balance被设置为private，但在子类CheckAccount的withdraw方法中需要修改它的值，因此应修改父类的balance属性，定义其为protected。
 *
 * 运行结果如下图所示。
 * @Author pluinyiasnhg
 * @Create 2025/12/28 09:30
 * @Version 1.0
 */
public class CheckAccountTest {
    public static void main(String[] args) {
        CheckAccount account = new CheckAccount(1122, 20000, 0.045, 5000);
        account.withdraw(5000);
        account.getInfo();

        account.withdraw(18000);
        account.getInfo();

        account.withdraw(3000);
        account.getInfo();
    }
}
