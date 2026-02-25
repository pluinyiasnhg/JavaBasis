package com.atguigu03.list.exer1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * ClassName: StudentTest
 * Package: com.atguigu03.list.exer1
 * Description:
 * 案例：键盘录入学生信息，保存到集合List中。
 * (2) 使用ArrayList集合，保存录入的多个学生对象。
 * (3) 循环录入的方式，1：继续录入，0：结束录入。
 * (4) 录入结束后，用foreach遍历集合。
 * @Author pluinyiasnhg
 * @Create 2026/2/17 12:24
 * @Version 1.0
 */
public class StudentTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List list = new ArrayList();

        System.out.println("请录入学生的信息");
        while (true) {
            System.out.println("1：继续录入，0：结束录入");
            int num = scanner.nextInt();

            if (num == 0) {
                break;
            }

            System.out.print("请输入学生姓名：");
            String name = scanner.next();
            System.out.print("请输入学生年龄：");
            int age = scanner.nextInt();
            list.add(new Student(name, age));
        }

        for (Object stu : list) {
            System.out.println(stu);
        }

        scanner.close();
    }
}
