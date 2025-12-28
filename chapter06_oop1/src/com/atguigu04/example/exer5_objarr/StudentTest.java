package com.atguigu04.example.exer5_objarr;

/**
 * ClassName: StudentTest
 * Package: com.atguigu04.example.exer5_objarr
 * Description:
 * 案例：
 * 1）定义类Student，包含三个属性：学号number(int)，年级state(int)，成绩score(int)。
 * 2）创建20个学生对象，学号为1到20，年级和成绩都由随机数确定。
 * 问题一：打印出3年级(state值为3）的学生信息。
 * 问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息
 * 提示：
 * 1) 生成随机数：Math.random()，返回值类型double;
 * 2) 四舍五入取整：Math.round(double d)，返回值类型long。
 * 年级[1,6] : (int)(Math.random() * 6 + 1)
 * 分数[0,100] : (int)(Math.random() * 101)
 * @Author pluinyiasnhg
 * @Create 2025/12/25 09:48
 * @Version 1.0
 */
public class StudentTest {
    public static void main(String[] args) {
        Student[] students = new Student[20];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            students[i].number = i + 1;
            students[i].state = (int)(Math.random() * 6 + 1);
            students[i].score = (int)(Math.random() * 101);
        }

        // 打印出3年级(state值为3）的学生信息。
        System.out.println("3年级的学生信息如下：");
        for (int i = 0; i < students.length; i++) {
            if (students[i].state == 3)
                students[i].printInfo();
        }

        // 使用冒泡排序按学生成绩排序，并遍历所有学生信息
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - 1 - i; j++) {
                if (students[j].score > students[j + 1].score) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
        System.out.println("所有学生信息如下：");
        for (int i = 0; i < students.length; i++) {
                students[i].printInfo();
        }

    }
}
