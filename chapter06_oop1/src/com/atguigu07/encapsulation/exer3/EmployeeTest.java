package com.atguigu07.encapsulation.exer3;

import java.util.Scanner;

/**
 * ClassName: EmployeeTest
 * Package: com.atguigu07.encapsulation.exer3
 * Description:
 * 案例：普通员工类
 * （2）在测试类的main中创建员工数组，并从键盘输入员工对象信息，最后遍历输出
 * @Author pluinyiasnhg
 * @Create 2025/12/25 16:33
 * @Version 1.0
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入员工数量：");
        int n = scanner.nextInt();
        Employee[] employee = new Employee[n];

        for (int i = 0; i < employee.length; i++) {
            System.out.println("-----------添加第" + (i + 1) + "个员工------------");
            employee[i] = new Employee();
            employee[i].setId(i + 1);

            System.out.print("姓名：");
            employee[i].setName(scanner.next());
            System.out.print("性别：");
            employee[i].setGender(scanner.next().charAt(0));
            System.out.print("年龄：");
            employee[i].setAge(scanner.nextInt());
            System.out.print("电话：");
            employee[i].setTelephone(scanner.next());
        }

        scanner.close();

        System.out.println("-----------员工列表------------");
        System.out.println("编号\t姓名\t性别\t年龄\t电话");
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i].getInfo());
        }

        System.out.println("-----------员工列表完成---------");
    }
}
