package com.atguigu04.example.exer5_objarr1;

/**
 * ClassName: StudentUtil
 * Package: com.atguigu04.example.exer5_objarr1
 * Description:
 *
 * @Author pluinyiasnhg
 * @Create 2025/12/25 10:07
 * @Version 1.0
 */
public class StudentUtil {
    // 打印指定年级的学生信息
    public void printStudentWithState(Student[] students, int state) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].state == state)
                students[i].printInfo();
        }
    }

    // 使用冒泡排序按学生成绩排序，并遍历所有学生信息
    public void bubbleSortStudents(Student[] students) {
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - 1 - i; j++) {
                if (students[j].score > students[j + 1].score) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }
}
