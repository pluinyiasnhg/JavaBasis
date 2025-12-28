package com.atguigu02.memory;

/**
 * ClassName: PersonTest
 * Package: com.atguigu02.memory
 * Description:
 * 测试 Person 类
 * @Author pluinyiasnhg
 * @Create 2025/12/24 19:46
 * @Version 1.0
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();

        p1.name = "张三";
        p1.age = 20;
        p1.gender = '男';

        System.out.println("姓名：" + p1.name + " 年龄：" + p1.age + " 性别：" + p1.gender);

        p1.eat();
        p1.sleep(7);
        p1.interest("钓鱼");
    }
}
