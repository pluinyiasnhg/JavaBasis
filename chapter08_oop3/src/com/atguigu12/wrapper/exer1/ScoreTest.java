package com.atguigu12.wrapper.exer1;

import java.util.Scanner;
import java.util.Vector;

/**
 * ClassName: ScoreTest
 * Package: com.atguigu12.wrapper.exer1
 * Description:
 * 利用Vector代替数组处理：从键盘读入学生成绩（以负数代表输入结束），找出最高分，并输出学生成绩等级。
 *
 * 提示：数组一旦创建，长度就固定不变，所以在创建数组前就需要知道它的长度。而向量类java.util.Vector可以根据需要动态伸缩。
 *
 * 创建Vector对象：Vector v=new Vector();
 * 给向量添加元素：v.addElement(Object obj);   //obj必须是对象
 * 取出向量中的元素：Object  obj=v.elementAt(0);
 * 注意第一个元素的下标是0，返回值是Object类型的。
 * 计算向量的长度：v.size();
 * 若与最高分相差10分内：A等；20分内：B等；30分内：C等；其它：D等
 * @Author pluinyiasnhg
 * @Create 2026/1/4 09:35
 * @Version 1.0
 */
public class ScoreTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vector v = new Vector();
        int maxScore = -1;

        while (true) {
            System.out.print("输入学生成绩（负数表示输入结束）：");
            int score = scanner.nextInt();
            if (score < 0)
                break;
            v.addElement(Integer.valueOf(score));

            if (score > maxScore)
                maxScore = score;
        }

        System.out.println("最高分为：" + maxScore);

        // 输出学生成绩等级
        for (int i = 0; i < v.size(); i++) {
            int result = maxScore - (Integer) v.elementAt(i);
            char grade;

            if (result <= 10)
                grade = 'A';
            else if (result <= 20)
                grade = 'B';
            else if (result <= 30)
                grade = 'C';
            else
                grade = 'D';
            System.out.println("Student " + (i + 1) + ": " + grade + "等");
        }

        scanner.close();

    }
}
