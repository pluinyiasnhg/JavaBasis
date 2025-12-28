package com.atguigu01.project;

/**
 * ClassName: FamilyAccount
 * Package: com.atguigu01.project
 * Description:
 *
 * @Author pluinyiasnhg
 * @Create 2025/12/26 19:03
 * @Version 1.0
 */
public class FamilyAccount {
    public static void main(String[] args) {
        int balance = 10000;
        String details = "收支\t账户金额\t收支金额\t说    明\n";
        boolean loopFlag = true;
        int amount;
        String description;

        while (loopFlag) {
            System.out.println("-----------------谷粒记账软件-----------------");
            System.out.println();
            System.out.println("                   1 收支明细");
            System.out.println("                   2 登记收入");
            System.out.println("                   3 登记支出");
            System.out.println("                   4 退 出");
            System.out.println();
            System.out.print("                   请选择(1-4)：");

            char option = Utility.readMenuSelection();
            System.out.println();
            switch (option) {
                case '1':
                    System.out.println("-----------------当前收支明细记录-----------------");
                    System.out.println(details);
                    break;
                case '2':
                    System.out.print("本次收入金额：");
                    amount = Utility.readNumber();
                    System.out.print("本次收入说明：");
                    description = Utility.readString();
                    if (amount > 0) {
                        balance += amount;
                        details += ("收入\t" + balance + "\t" + amount + "\t" + description + "\n");
                    }
                    break;
                case '3':
                    System.out.print("本次支出金额：");
                    amount = Utility.readNumber();
                    System.out.print("本次支出说明：");
                    description = Utility.readString();
                    if (amount > 0) {
                        balance -= amount;
                        details += ("支出\t" + balance + "\t" + amount + "\t" + description + "\n");
                    }
                    break;
                case '4':
                    System.out.print("确认是否退出(Y/N)：");
                    char c = Utility.readConfirmSelection();
                    if (c == 'Y')
                        loopFlag = false;
                    break;
                default:
                    System.out.println("输入数字错误");
            }
        }
    }
}
