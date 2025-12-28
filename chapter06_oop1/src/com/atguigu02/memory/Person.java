package com.atguigu02.memory;

/**
 * ClassName: Person
 * Package: com.atguigu02.memory
 * Description:
 * 创建一个 Person 类，
 * 人有名字、年龄、性别，
 * 人会吃饭，人会睡觉，每个人的睡眠时长不同，人会有自己的爱好
 * @Author pluinyiasnhg
 * @Create 2025/12/24 19:41
 * @Version 1.0
 */
public class Person {
    String name;
    int age;
    char gender;

    public void eat() {
        System.out.println("人要吃饭");
    }

    public void sleep(int hour) {
        System.out.println("人要一天睡" + hour + "小时");
    }

    public void interest(String hobby) {
        System.out.println("这个人的爱好是" + hobby);
    }
}
