package com.atguigu03.field_method.method.exer;

/**
 * ClassName: Employee
 * Package: com.atguigu03.field_method.method.exer
 * Description:
 *
 * @Author pluinyiasnhg
 * @Create 2025/12/24 20:42
 * @Version 1.0
 */
public class Employee {
    int id;
    String name;
    int age;
    double salary;

    public void printEmployee() {
        System.out.println("员工编号：" + id + "，姓名：" + name +
                "，年龄：" + age + "，薪资：" + salary);
    }
}
