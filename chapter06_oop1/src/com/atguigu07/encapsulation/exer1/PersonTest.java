package com.atguigu07.encapsulation.exer1;

/**
 * ClassName: PersonTest
 * Package: com.atguigu07.encapsulation.exer1
 * Description:
 * 案例：
 * 创建程序,在其中定义两个类：Person和PersonTest类。定义如下：
 * 在PersonTest类中实例化Person类的对象b，调用setAge()和getAge()方法，体会Java的封装性。
 * @Author pluinyiasnhg
 * @Create 2025/12/25 16:16
 * @Version 1.0
 */
public class PersonTest {
    public static void main(String[] args) {
        Person b = new Person();
        b.setAge(15);
//        b.age = 16;
        System.out.println("年龄为：" + b.getAge());
    }
}
