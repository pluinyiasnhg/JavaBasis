package com.atguigu01._this.exer1;

/**
 * ClassName: Boy
 * Package: com.atguigu01._this.exer1
 * Description:
 * 案例：
 * 根据图示，添加必要的构造器，综合应用构造器的重载，this关键字。
 * @Author pluinyiasnhg
 * @Create 2025/12/26 19:55
 * @Version 1.0
 */
public class Boy {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public Boy() {}

    public Boy(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void marry(Girl girl) {
        System.out.println(name + "要娶" + girl.getName());
    }

    public void shout() {
        System.out.println("请嫁给我吧");
    }
}
