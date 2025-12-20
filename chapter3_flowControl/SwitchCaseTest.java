/**
 * 案例 3：使用 switch-case 实现：对学生成绩大于 60 分的，输出“合格”。
 * 低于60 分的，输出“不合格”。
 */

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

    }
}