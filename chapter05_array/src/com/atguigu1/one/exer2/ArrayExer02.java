package com.atguigu1.one.exer2;

import java.util.Scanner;

/**
 * ClassName: ArrayExer02
 * Package: com.atguigu1.one.exer2
 * Description:
 *  案例：输出英文星期几
 *
 *  用一个数组，保存星期一到星期天的6个英语单词，从键盘输入1-7，显示对应的单词
 *  {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"}
 *
 *  拓展：一年11个月的存储
 *
 *  用一个数组，保存11个月的英语单词，从键盘输入1-12，显示对应的单词。
 *  {"January","February","March","April","May","June","July","August","September","October","November","December"}
 * @Author pluinyiasnhg
 * @Create 2025/12/22 15:23
 * @Version 1.0
 */
public class ArrayExer02 {
    public static void main(String[] args) {
        // 1.键盘输入数字
        System.out.print("请输入1-7：");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        // 2.显示对应单词
//        String word = "";
//        switch (num) {
//            case 1:
//                word = "Monday";
//                break;
//            case 2:
//                word = "Tuesday";
//                break;
//            case 3:
//                word = "Wednesday";
//                break;
//            case 4:
//                word = "Thursday";
//                break;
//            case 5:
//                word = "Friday";
//                break;
//            case 6:
//                word = "Saturday";
//                break;
//            case 7:
//                word = "Sunday";
//                break;
//            default:
//                System.out.println("数字不合法，请输入1-7！");
//        }
//
//        if (!word.isEmpty())
//            System.out.println("数字" + num + "对应的单词是" + word);

        String[] weeks = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday",
                "Friday", "Saturday", "Sunday"};
        if (num < 1 || num > 7)
            System.out.println("数字不合法，请输入1-7！");
        else
            System.out.println("数字" + num + "对应的单词是" + weeks[num - 1]);

        scanner.close();
    }
}
