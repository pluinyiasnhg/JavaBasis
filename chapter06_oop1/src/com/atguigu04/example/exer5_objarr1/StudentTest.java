package com.atguigu04.example.exer5_objarr1;


/**
 * ClassName: StudentTest
 * Package:
 * Description:
 *
 * @Author pluinyiasnhg
 * @Create 2025/12/25 10:05
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

        StudentUtil util = new StudentUtil();
        // 打印出3年级(state值为3）的学生信息。
        System.out.println("3年级的学生信息如下：");
        util.printStudentWithState(students, 3);

        util.bubbleSortStudents(students);
        System.out.println("所有学生信息如下：");
        for (int i = 0; i < students.length; i++) {
            students[i].printInfo();
        }
    }
}

