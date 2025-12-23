/**
 * 5.1 各种类型的数据输入
 * 案例：小明注册某交友网站，要求录入个人相关信息。如下：
 * 请输入你的网名、你的年龄、你的体重、你是否单身、你的性别等情况。
 */

import java.util.Scanner;

class ScannerTest1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入你的网名：");
        String name = scanner.next();
        System.out.print("请输入你的年龄：");
        int dogAge = scanner.nextInt();
        System.out.print("请输入你的体重：");
        double weight = scanner.nextDouble();
        System.out.print("你是否单身？");
        boolean isMarried = scanner.nextBoolean();
        System.out.print("请输入你的性别：");
        char gender = scanner.next().charAt(0); // 先按照字符串接收，然后再取字符串的第一个字符（下标为 0）

        System.out.println("你的基本情况如下：");
        System.out.println("网名：" + name + "，年龄：" + dogAge + "，体重：" + weight +
                "，是否单身：" + isMarried + "，性别：" + gender);

        scanner.close();
    }
}

/**
 * 5.2 练习
 * 练习 1：
 * 大家都知道，男大当婚，女大当嫁。那么女方家长要嫁女儿，当然要提出一定的条件：
 * 高：180cm 以上；富：财富 1 千万以上；帅：是。
 * 如果这三个条件同时满足，则：“我一定要嫁给他!!!”
 * 如果三个条件有为真的情况，则：“嫁吧，比上不足，比下有余。”
 * 如果三个条件都不满足，则：“不嫁！”
 * 提示：
 * System.out.println(“身高: (cm));
 * scanner.nextInt();
 * System.out.println(“财富: (千万));
 * scanner.nextDouble();
 * System.out.println(“帅否: (true/false));
 * scanner.nextBoolean();
 * System.out.println(“帅否: (是/否));
 * scanner.next(); "是".equals(str)
 */
class ScannerExer1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("身高(cm): ");
        int height = scanner.nextInt();
        System.out.print("财富(千万): ");
        double money = scanner.nextDouble();
//        System.out.print("帅否(true/false): ");
//        boolean isHandsome = scanner.nextBoolean();
//
//        if (height > 180 && money > 1.0 && isHandsome)
//            System.out.println("我一定要嫁给他！！！");
//        else if (height > 180 || money > 1.0 || isHandsome)
//            System.out.println("嫁吧，比上不足，比下有余。");
//        else
//            System.out.println("不嫁");

        System.out.print("帅否(是/否): ");
        String isHandsome = scanner.next();

        if (height > 180 && money > 1.0 && "是".equals(isHandsome))
            System.out.println("我一定要嫁给他！！！");
        else if (height > 180 || money > 1.0 || "是".equals(isHandsome))
            System.out.println("嫁吧，比上不足，比下有余。");
        else
            System.out.println("不嫁");

        scanner.close();
    }
}

/**
 * 练习 2：我家的狗 5 岁了，5 岁的狗相当于人类多大呢？
 * 其实，狗的前两年每一年相当于人类的 10.5 岁，之后每增加一年就增加四岁。那么 5 岁的狗相当于人类多少年龄呢？
 * 应该是：10.5 + 10.5 + 4 + 4 + 4 = 33 岁。
 * 编写一个程序，获取用户输入的狗的年龄，通过程序显示其相当于人类的年龄。
 * 如果用户输入负数，请显示一个提示信息。
 */
class ScannerExer2 {
    public static void main(String[] args) {
        System.out.print("请输入狗的年龄：");
        Scanner scanner = new Scanner(System.in);
        double dogAge = scanner.nextDouble();
        double personAge;

        if (dogAge < 0)
            System.out.println("狗的年龄错误！");
        else if (dogAge <= 2) {
            personAge = dogAge * 10.5;
            System.out.println(dogAge + "岁的狗相当于人类" + personAge + "岁");
        }
        else {
            personAge = 10.5 * 2 + (dogAge - 2) * 4;
            System.out.println(dogAge + "岁的狗相当于人类" + personAge + "岁");
        }

        scanner.close();
    }
}