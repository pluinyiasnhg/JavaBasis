package com.atguigu04.example.exer5_objarr1;

/**
 * ClassName: Student
 * Package: com.atguigu04.example.exer5_objarr1
 * Description:
 *
 * @Author pluinyiasnhg
 * @Create 2025/12/25 10:04
 * @Version 1.0
 */
public class Student {
    int number; // 学号
    int state;  // 年级
    int score;

    public void printInfo() {
        System.out.println("学号：" + number + "，年级：" + state + " 成绩：" + score);
    }
}
