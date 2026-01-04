package com.atguigu10._enum.exer1;

/**
 * ClassName: GirlFriendTest
 * Package: com.atguigu10._enum.exer1
 * Description:
 * 案例：使用枚举类实现单例模式
 * @Author pluinyiasnhg
 * @Create 2026/1/4 08:32
 * @Version 1.0
 */
public class GirlFriendTest {
    public static void main(String[] args) {
        System.out.println(GirlFridend.XIAO_HONG);
        System.out.println(GirlFriend1.XIAOHONG);
    }
}

//jdk5.0之前定义枚举类的方式
class GirlFridend {
    private final int age;

    private GirlFridend(int age) {
        this.age = age;
    }

    public static final GirlFridend XIAO_HONG = new GirlFridend(20);
}

//jdk5.0使用enum关键字定义枚举类的方式定义单例模式
enum GirlFriend1 {
    XIAOHONG(21);

    private final int age;

    private GirlFriend1(int age) {
        this.age = age;
    }
}