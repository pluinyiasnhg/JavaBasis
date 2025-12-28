package com.atguigu08.constructor.exer1;

/**
 * ClassName: StudentTest
 * Package: com.atguigu08.constructor.exer1
 * Description:
 * (3)在main方法中分别调用不同的构造器创建的对象，并输出其属性值。
 * @Author pluinyiasnhg
 * @Create 2025/12/26 12:16
 * @Version 1.0
 */
public class StudentTest {
    public static void main(String[] args) {
        Student stu1 = new Student("张三", 18);
        stu1.printInfo();

        Student stu2 = new Student("李四", 19, "希望大学");
        stu2.printInfo();

        Student stu3 = new Student("王五", 20, "育才大学", "软件工程");
        stu3.printInfo();
    }
}
