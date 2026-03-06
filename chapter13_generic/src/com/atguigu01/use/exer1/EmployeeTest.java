package com.atguigu01.use.exer1;

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * ClassName: EmployeeTest
 * Package: com.atguigu01.use.exer1
 * Description:
 * 3. 创建该类的 5 个对象，并把这些对象放入 TreeSet 集合中（TreeSet 需使用泛型来定义）
 * 4. 分别按以下两种方式对集合中的元素进行排序，并遍历输出：
 *    1). 使Employee 实现 Comparable 接口，并按 name 排序
 *    2). 创建 TreeSet 时传入 Comparator对象，按生日日期的先后排序。
 * @Author pluinyiasnhg
 * @Create 2026/2/27 10:20
 * @Version 1.0
 */
public class EmployeeTest {
    @Test
    public void test1() {
        Employee e1 = new Employee("HanMeimei",18, new MyDate(1998,12,21));
        Employee e2 = new Employee("LiLei",20, new MyDate(1996,11,21));
        Employee e3 = new Employee("LiHua",21, new MyDate(2000,9,12));
        Employee e4 = new Employee("ZhangLei",19, new MyDate(1997,5,31));
        Employee e5 = new Employee("ZhangYi",23, new MyDate(2001,11,2));

        TreeSet<Employee> employees = new TreeSet<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);

        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

    @Test
    public void test2() {
        Employee e1 = new Employee("HanMeimei",18, new MyDate(1998,12,21));
        Employee e2 = new Employee("LiLei",20, new MyDate(1996,11,21));
        Employee e3 = new Employee("LiHua",21, new MyDate(2000,9,12));
        Employee e4 = new Employee("ZhangLei",19, new MyDate(1997,5,31));
        Employee e5 = new Employee("ZhangYi",23, new MyDate(2001,11,2));

        TreeSet<Employee> employees = new TreeSet<>(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getBirthday().compareTo(o2.getBirthday());
            }
        });
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);

        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

}


