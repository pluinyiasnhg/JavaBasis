package com.atguigu02.selfdefine.exer3;

/**
 * ClassName: StudentTest
 * Package: com.atguigu02.selfdefine.exer3
 * Description:
 * 语文老师希望成绩是“优秀”、“良好”、“及格”、“不及格”，数学老师希望成绩是89.5, 65.0，
 * 英语老师希望成绩是'A','B','C','D','E'
 * @Author pluinyiasnhg
 * @Create 2026/3/6 10:46
 * @Version 1.0
 */
public class StudentTest {
    public static void main(String[] args) {
        Student<String> stu1 = new Student<>("小明", "优秀");
        Student<Double> stu2 = new Student<>("小红", 89.5);
        Student<Character> stu3 = new Student<>("小张", 'A');

        System.out.println(stu1);
        System.out.println(stu2);
        System.out.println(stu3);
    }
}
