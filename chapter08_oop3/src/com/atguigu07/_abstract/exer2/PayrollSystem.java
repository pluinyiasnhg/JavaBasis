package com.atguigu07._abstract.exer2;

import java.util.Scanner;

/**
 * ClassName: PayrollSystem
 * Package: com.atguigu07._abstract.exer2
 * Description:
 * （5）定义PayrollSystem类，创建Employee变量数组并初始化，该数组存放各类雇员对象的引用。
 * 利用循环结构遍历数组元素，输出各个对象的类型,name,number,birthday,以及该对象生日。
 * 当键盘输入本月月份值时，如果本月是某个Employee对象的生日，还要输出增加工资信息。
 * //提示：
 * //定义People类型的数组People c1[]=new People[10];
 * //数组元素赋值
 * c1[0]=new People("John","0001",20);
 * c1[1]=new People("Bob","0002",19);
 * //若People有两个子类Student和Officer，则数组元素赋值时，可以使父类类型的数组元素指向子类。
 * c1[0]=new Student("John","0001",20,85.0);
 * c1[1]=new Officer("Bob","0002",19,90.5);
 * @Author pluinyiasnhg
 * @Create 2026/1/2 18:23
 * @Version 1.0
 */
public class PayrollSystem {
    public static void main(String[] args) {
        Employee[] employees = new Employee[2];
        employees[0] = new SalariedEmployee("张三", 1001, new MyDate(2000, 1, 1),
                10000);
        employees[1] = new HourlyEmployee("李四", 1002, new MyDate(2001, 2, 2),
                300, 10);

        System.out.print("请输入本月月份：");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();

        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].toString());
            System.out.println("工资为：" + employees[i].earnings());

            if (month == employees[i].getBirthday().getMonth())
                System.out.println("今天是生日，多加两千块钱！");
        }

        scanner.close();
    }
}
