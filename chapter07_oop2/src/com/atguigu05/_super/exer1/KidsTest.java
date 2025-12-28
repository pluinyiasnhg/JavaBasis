package com.atguigu05._super.exer1;

/**
 * ClassName: KidsTest
 * Package: com.atguigu03._extends.exer1
 * Description:
 * (3)定义类KidsTest，在类的main方法中实例化Kids的对象someKid，用该对象访问其父类的成员变量及方法。
 * @Author pluinyiasnhg
 * @Create 2025/12/27 15:21
 * @Version 1.0
 */
public class KidsTest {
    public static void main(String[] args) {

        Kids someKid = new Kids();

        someKid.setSex(0);
        someKid.setSalary(0);
        someKid.setYearsOld(18);
        someKid.printAge();
        // 访问父类方法
        someKid.manOrWoman();
        someKid.employeed();
        System.out.println("*********");
        someKid.setSalary(1);
        someKid.employeed();
    }
}
