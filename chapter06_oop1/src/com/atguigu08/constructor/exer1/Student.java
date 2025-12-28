package com.atguigu08.constructor.exer1;

/**
 * ClassName: Student
 * Package: com.atguigu08.constructor.exer1
 * Description:
 * 案例：
 * (1)定义Student类,有4个属性：
 *   String name;
 *   int age;
 *   String school;
 *   String major;
 * (2)定义Student类的3个构造器:
 * - 第一个构造器Student(String n, int a)设置类的name和age属性；
 * - 第二个构造器Student(String n, int a, String s)设置类的name, age 和school属性；
 * - 第三个构造器Student(String n, int a, String s, String m)设置类的name, age ,school和major属性；
 * @Author pluinyiasnhg
 * @Create 2025/12/26 12:13
 * @Version 1.0
 */
public class Student {
    String name;
    int age;
    String school;
    String major;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, String school) {
        this.name = name;
        this.age = age;
        this.school = school;
    }

    public Student(String name, int age, String school, String major) {
        this.name = name;
        this.age = age;
        this.school = school;
        this.major = major;
    }

    public void printInfo() {
        System.out.println("姓名：" + name + " 年龄：" + age + " 学校：" + school + " 专业：" + major);
    }
}
