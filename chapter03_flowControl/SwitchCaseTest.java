/**
 * 案例 3：使用 switch-case 实现：对学生成绩大于 60 分的，输出“合格”。
 * 低于60 分的，输出“不合格”。
 */

import java.util.Map;
import java.util.Scanner;

class SwitchCaseTest3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入成绩：");
        int score = scanner.nextInt();

//        // 方法一: switch/10
//        switch (score / 10) {
//            case 0:
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("不合格");
//                break;
//            case 6:
//            case 7:
//            case 8:
//            case 9:
//            case 10:
//                System.out.println("合格");
//                break;
        // 方法二: switch/60
        switch (score / 60) {
            case 0:
                System.out.println("不合格");
                break;
            case 1:
                System.out.println("合格");
                break;
            default:
                System.out.println("输入的成绩有误");
        }
        scanner.close();
    }
}

/**
 * 案例 4：编写程序：从键盘上输入 2023 年的“month”和“totalDay”，要求通过程序
 * 输出输入的日期为 2023 年的第几天。
 * 拓展：
 * 从键盘分别输入年、月、日，判断这一天是当年的第几天
 * 注：判断一年是否是闰年的标准：
 * 1）可以被 4 整除，但不可被 100 整除 或 2）可以被 400 整除
 * 例如：1900，2200 等能被 4 整除，但同时能被 100 整除，但不能被 400 整除，不是闰年
 */
class SwitchCaseTest4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("输入年：");
        int year = scanner.nextInt();
        System.out.print("输入月：");
        int month = scanner.nextInt();
        System.out.print("输入日：");
        int day = scanner.nextInt();

//        // case 按月份正序排序，会很麻烦
//        switch (month) {
//            case 1:
//                totalDay;
//            case 2:
//                totalDay = totalDay + 31;
//            case 3:
//                totalDay = totalDay + 28;
//        }

        // 月份逆序排序，利用 case 的穿透特点
        int totalDay = 0;
        switch (month) {
            case 12:
                totalDay += 30;
            case 11:
                totalDay += 31;
            case 10:
                totalDay += 30;
            case 9:
                totalDay += 31;
            case 8:
                totalDay += 31;
            case 7:
                totalDay += 30;
            case 6:
                totalDay += 31;
            case 5:
                totalDay += 30;
            case 4:
                totalDay += 31;
            case 3:
                // totalDay += 28;  // 28是2月份的满月天数
                if (year % 4 == 0 && year % 100 == 0 || year % 400 == 0)
                    totalDay += 29;
                else
                    totalDay += 28;
            case 2:
                totalDay += 31;  // 31是1月份的满月天数
            case 1:
                totalDay += day;
                String current = year + "年" + month + "月" + day + "日";
                System.out.println(current + "是" + year + "年的第" + totalDay + "天");
                break;
            default:
                System.out.println("请输入正确的月份");
        }

        scanner.close();
    }
}

/**
 * 案例 5：根据指定的月份输出对应季节
 * 需求：指定一个月份，输出该月份对应的季节。一年有四季:
 * 3,4,5 春季
 * 6,7,8 夏季
 * 9,10,11 秋季
 * 12,1,2 冬季
 */
class SwitchCaseTest5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入月份：");
        int month = scanner.nextInt();

        switch (month) {
            case 3:
            case 4:
            case 5:
                System.out.println("当前为春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("当前为夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("当前为秋季");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("当前为冬季");
                break;
            default:
                System.out.println("请输入正确的月份");
        }

        scanner.close();
    }
}

/**
 * 练习 1：从键盘输入星期的整数值，输出星期的英文单词
 */
class SwitchCaseExer1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入星期的整数值：");
        int weekday = scanner.nextInt();

        switch (weekday) {
            case 1:
                System.out.println("对应的英文单词为：Monday");
                break;
            case 2:
                System.out.println("对应的英文单词为：Tuesday");
                break;
            case 3:
                System.out.println("对应的英文单词为：Wednesday");
                break;
            case 4:
                System.out.println("对应的英文单词为：Thursday");
                break;
            case 5:
                System.out.println("对应的英文单词为：Friday");
                break;
            case 6:
                System.out.println("对应的英文单词为：Saturday");
                break;
            case 7:
                System.out.println("对应的英文单词为：Sunday");
                break;
            default:
                System.out.println("输入的星期有误");
        }

        scanner.close();
    }
}

/**
 * 练习 2：
 * 使用 switch 把小写类型的 char 型转为大写。只转换 a, b, c, d, e. 其它的输出
 * “other”。
 */
class SwitchCaseExer2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("输入一个小写字母：");
        char word = scanner.next().charAt(0);

        switch (word) {
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
                System.out.println((char)(word - 32));
                break;
            default:
                System.out.println("other");
        }

        scanner.close();
    }
}

/**
 * 练习 3：
 * 编写程序：从键盘上读入一个学生成绩，存放在变量 score 中，根据 score 的值输出
 * 其对应的成绩等级：
 * score>=90     等级：A
 * 70<=score<90  等级：B
 * 60<=score<70  等级：C
 * score<60      等级：D
 * 方式一：使用 if-else
 * 方式二：使用 switch-case: score / 10:
 * 0 - 10
 */
class SwitchCaseExer3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("输入一个学生成绩：");
        int score = scanner.nextInt();

        switch (score / 10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("等级：D");
                break;
            case 6:
                System.out.println("等级：C");
                break;
            case 7:
            case 8:
                System.out.println("等级：B");
                break;
            case 9:
            case 10:
                System.out.println("等级：A");
                break;
            default:
                System.out.println("输入成绩不在0-100范围内");
        }

        scanner.close();
    }
}

/**
 * 练习 4：
 * 编写一个程序，为一个给定的年份找出其对应的中国生肖。中国的生肖基于 12 年一个
 * 周期，每年用一个动物代表：rat、ox、tiger、rabbit、dragon、snake、horse、
 * sheep、monkey、rooster、dog、pig。
 * 提示：2022 年：虎
 * 2022 % 12 == 6
 */
class SwitchCaseExer4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入年份：");
        int year = scanner.nextInt();

        switch (year % 12) {
            case 0:
                System.out.println(year + "年：猴");
                break;
            case 1:
                System.out.println(year + "年：鸡");
                break;
            case 2:
                System.out.println(year + "年：狗");
                break;
            case 3:
                System.out.println(year + "年：猪");
                break;
            case 4:
                System.out.println(year + "年：鼠");
                break;
            case 5:
                System.out.println(year + "年：牛");
                break;
            case 6:
                System.out.println(year + "年：虎");
                break;
            case 7:
                System.out.println(year + "年：兔");
                break;
            case 8:
                System.out.println(year + "年：龙");
                break;
            case 9:
                System.out.println(year + "年：蛇");
                break;
            case 10:
                System.out.println(year + "年：马");
                break;
            case 11:
                System.out.println(year + "年：羊");
                break;
            default:
                System.out.println("输入错误");
        }
        scanner.close();
    }
}

/**
 * 练习 5：押宝游戏
 * 随机产生 3 个 1-6 的整数，如果三个数相等，那么称为“豹子”，如果三个数之和大于 9，称为“大”，
 * 如果三个数之和小于等于 9，称为“小”，
 * 用户从键盘输入押的是“豹子”、“大”、“小”，并判断是否猜对了
 * 提示：随机数 Math.random()产生 [0,1)范围内的小数
 * 如何获取[a,b]范围内的随机整数呢？(int)(Math.random() * (b - a + 1)) + a
 */
class SwitchCaseExer5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = (int)(Math.random() * 6) + 1;
        int num2 = (int)(Math.random() * 6) + 1;
        int num3 = (int)(Math.random() * 6) + 1;

        System.out.print("请押宝（豹子、大、小）：");
        String cai = scanner.next();
        System.out.println("a，b，c分别是：" + num1 + "，" + num2 + "，" + num3);

//        // 三个数之和的范围为 [3, 18]，将三数之和 / 9，得到三种情况 0 1 2
//        // 豹子的情况，放到 default 中讨论
//        int sum = num1 + num2 + num3;
//        switch (sum / 9) {
//            default:
//                // 豹子
//                if (num1 == num2 && num2 == num3)
//                    System.out.println("猜中了");
//                else
//                    System.out.println("猜错了");
//                break;
//            case 0:
//                // 小
//                if ("小".equals(cai))
//                    System.out.println("猜中了");
//                else
//                    System.out.println("猜错了");
//                break;
//            case 1:
//            case 2:
//                // 大
//                if ("大".equals(cai))
//                    System.out.println("猜中了");
//                else
//                    System.out.println("猜错了");
//                break;
//        }

        // 用字符串比较，而不是数字比较
        int sum = num1 + num2 + num3;
        boolean result = false; // 输入错误时候，不初始化会出问题
        switch (cai) {
            case "豹子":
                result = num1 == num2 && num2 == num3;
                break;
            case "大":
                result = sum > 9;
                break;
            case "小":
                result = sum <= 9;
                break;
            default:
                System.out.println("输入错误");
        }

        if (result)
            System.out.println("猜中了");
        else
            System.out.println("猜错了");

        scanner.close();
    }
}