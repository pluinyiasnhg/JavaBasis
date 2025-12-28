package com.atguigu03.field_method.field.exer1;

/**
 * ClassName: EmployeeTest
 * Package: com.atguigu03.field_method.field.exer1
 * Description:
 * 案例：
 * 声明员工类Employee，包含属性：编号id、姓名name、年龄age、薪资salary。
 * 声明EmployeeTest测试类，并在main方法中，创建2个员工对象，并为属性赋值，并打印两个员工的信息。
 * @Author pluinyiasnhg
 * @Create 2025/12/24 20:09
 * @Version 1.0
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.id = 1;
        employee1.name = "张三";
        employee1.age = 23;
        employee1.salary = 10000.0;
        System.out.println("员工1的编号：" + employee1.id + "，姓名：" + employee1.name +
                "，年龄：" + employee1.age + "，薪资：" + employee1.salary);

        Employee employee2 = new Employee();
        employee2.id = 2;
        employee2.name = "李四";
        employee2.age = 22;
        employee2.salary = 11000.0;
        System.out.println("员工2的编号：" + employee2.id + "，姓名：" + employee2.name +
                "，年龄：" + employee2.age + "，薪资：" + employee2.salary);
    }
}
