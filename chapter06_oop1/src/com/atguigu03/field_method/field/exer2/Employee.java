package com.atguigu03.field_method.field.exer2;

/**
 * ClassName: Employee
 * Package: com.atguigu03.field_method.field.exer2
 * Description:
 * 案例：
 * （1）声明一个MyDate类型，有属性：年year，月month，日day
 * （2）声明一个Employee类型，包含属性：编号、姓名、年龄、薪资、生日（MyDate类型）
 * （3）在EmployeeTest测试类中的main()中，创建两个员工对象，并为他们的姓名和生日赋值，并显示
 * @Author pluinyiasnhg
 * @Create 2025/12/24 20:17
 * @Version 1.0
 */
public class Employee {
        int id;
        String name;
        int age;
        double salary;
        MyDate birthday;
}
