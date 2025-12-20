import java.util.Scanner;

/**
 * 案例 1：遍历 1-100 的偶数，并计算所有偶数的和、偶数的个数（累加的思想）
 */
class DoWhileTest1 {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        int i = 1;
        do {
            if (i % 2 == 0) {
                count++;
                sum += i;
            }
            i++;
        } while (i <= 100);

        System.out.println("偶数之和为" + sum + "，偶数个数为" + count);
    }
}

/**
 * 案例 3：ATM 取款
 * 声明变量 balance 并初始化为 0，用以表示银行账户的余额，下面通过 ATM 机程序实
 * 现存款，取款等功能。
 * =========ATM========
 * 1、存款
 * 2、取款
 * 3、显示余额
 * 4、退出
 * 请选择(1-4)：
 */
class DoWhileTest3 {
    public static void main(String[] args) {
        int balance = 0;
        int option;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("=========ATM========");
            System.out.println("1、存款");
            System.out.println("2、取款");
            System.out.println("3、显示余额");
            System.out.println("4、退出");
            System.out.print("请选择(1-4)：");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("输入存款金额：");
                    int inMoney = scanner.nextInt();
                    if (inMoney <= 0) {
                        System.out.println("请输入正数金额！");
                        break;
                    }
                    balance += inMoney;
                    break;
                case 2:
                    System.out.print("输入取款金额：");
                    int outMoney = scanner.nextInt();
                    if (outMoney <= 0) {
                        System.out.println("请输入正数金额！");
                        break;
                    }
                    if (balance < outMoney) {
                        System.out.println("余额不足！");
                        break;
                    }
                    balance -= outMoney;
                    break;
                case 3:
                    System.out.println("当前余额为：" + balance);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("请选择(1-4)！");
            }
        } while (option != 4);
        System.out.println("成功退出");

        scanner.close();
    }
}

/**
 * 3.3.3 练习
 * 练习 1：随机生成一个 100 以内的数，猜这个随机数是多少？
 * 从键盘输入数，如果大了提示，大了；如果小了，提示小了；如果对了，就不再猜了，
 * 并统计一共猜了多少次。
 */
class DoWhileExec1 {
    public static void main(String[] args) {
        int num = (int)(Math.random() * 100) + 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("猜数字，随机数大小为100以内：");

        int count = 0;
        int guess;
        do {
            guess = scanner.nextInt();
            count++;
            if (guess < num)
                System.out.println("太小");
            else if (guess > num)
                System.out.println("太大");
            else
                System.out.println("猜对了");
        } while (guess != num);

        System.out.println("一共猜了" + count + "次");

        scanner.close();
    }
}