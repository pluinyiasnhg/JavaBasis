package com.atguigu1.one.exer3;

import java.util.Scanner;

/**
 * ClassName: ArrayExer03
 * Package: com.atguigu1.one.exer3
 * Description:
 *  案例：学生考试等级划分
 *
 *  从键盘读入学生成绩，找出最高分，并输出学生成绩等级。
 *  成绩>=最高分-10    等级为’A’
 *  成绩>=最高分-20    等级为’B’
 *  成绩>=最高分-30    等级为’C’
 *  其余              等级为’D’
 *
 *  提示：先读入学生人数，根据人数创建int数组，存放学生成绩。
 * @Author pluinyiasnhg
 * @Create 2025/12/22 15:38
 * @Version 1.0
 */
public class ArrayExer03 {
    public static void main(String[] args) {
        // 1. 键盘输入
        System.out.print("请输入学生人数：");
        Scanner scanner = new Scanner(System.in);
        int people = scanner.nextInt();
        System.out.println("请输入" + people + "个成绩");

        // 2. 读取people个成绩，保存到数组scores
        // 3. 比较出最高分
        int[] scores = new int[people];
        int maxScore = -1;
        for (int i = 0; i < people; i++) {
            scores[i] = scanner.nextInt();
            maxScore = (maxScore < scores[i])? scores[i] : maxScore;
        }
        System.out.println("最高分是：" + maxScore);

        // 4. 输出people位学生的考试等级
        char grade;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > maxScore - 10)
                grade = 'A';
            else if (scores[i] > maxScore - 20)
                grade = 'B';
            else if (scores[i] > maxScore - 30)
                grade = 'C';
            else
                grade = 'D';
            System.out.println("Student " + i + " scores is " + scores[i] + " grade is " + grade);
        }

        scanner.close();
    }
}
