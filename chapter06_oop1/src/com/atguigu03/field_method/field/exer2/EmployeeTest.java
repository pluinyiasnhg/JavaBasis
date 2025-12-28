package com.atguigu03.field_method.field.exer2;

/**
 * ClassName: EmployeeTest
 * Package: com.atguigu03.field_method.field.exer2
 * Description:
 * 案例：
 * （1）声明一个MyDate类型，有属性：年year，月month，日day
 * （2）声明一个Employee类型，包含属性：编号、姓名、年龄、薪资、生日（MyDate类型）
 * （3）在EmployeeTest测试类中的main()中，创建两个员工对象，并为他们的姓名和生日赋值，并显示
 * @Author pluinyiasnhg
 * @Create 2025/12/24 20:18
 * @Version 1.0
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee();

        employee1.name = "张三";
        employee1.birthday = new MyDate();
        employee1.birthday.year = 2000;
        employee1.birthday.month = 1;
        employee1.birthday.day = 2;
        System.out.println("姓名：" + employee1.name + " 生日：" + employee1.birthday.year + "/" +
                employee1.birthday.month + "/" + employee1.birthday.day);

        Employee employee2 = new Employee();

        employee2.name = "李四";
        employee2.birthday = new MyDate();
        employee2.birthday.year = 2002;
        employee2.birthday.month = 2;
        employee2.birthday.day = 3;
        System.out.println("姓名：" + employee2.name + " 生日：" + employee2.birthday.year + "/" +
                employee2.birthday.month + "/" + employee2.birthday.day);
    }
}
