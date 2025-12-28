package com.atguigu04.example.exer1;

/**
 * ClassName: PersonTest
 * Package: com.atguigu04.example.exer1
 * Description:
 * 案例：
 * (1)创建Person类的对象，设置该对象的name、age和gender属性，
 * 调用study方法，输出字符串“studying”;
 * 调用showAge()方法，返回age值;
 * 调用addAge(int addAge)方法给对象的age属性值增加addAge岁。比如：2岁。
 * (2)创建第二个对象，执行上述操作，体会同一个类的不同对象之间的关系。
 * @Author pluinyiasnhg
 * @Create 2025/12/24 20:56
 * @Version 1.0
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "张三";
        p1.age = 20;
        p1.gender = '男';

        p1.study();
        System.out.println(p1.showAge());
        p1.addAge(2);
        System.out.println(p1.showAge());

        Person p2 = new Person();
        p2.name = "李四";
        p2.age = 10;
        p2.gender = '男';

        p2.study();
        System.out.println(p2.showAge());
        p2.addAge(3);
        System.out.println(p2.showAge());
    }
}
