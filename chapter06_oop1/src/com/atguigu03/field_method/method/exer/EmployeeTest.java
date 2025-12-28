package com.atguigu03.field_method.method.exer;

/**
 * ClassName: EmployeeTest
 * Package: com.atguigu03.field_method.method.exer
 * Description:
 *
 * @Author pluinyiasnhg
 * @Create 2025/12/24 20:44
 * @Version 1.0
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.id = 1;
        employee1.name = "张三";
        employee1.age = 23;
        employee1.salary = 10000.0;
        employee1.printEmployee();

        Employee employee2 = new Employee();
        employee2.id = 2;
        employee2.name = "李四";
        employee2.age = 22;
        employee2.salary = 11000.0;
        employee2.printEmployee();
    }
}
