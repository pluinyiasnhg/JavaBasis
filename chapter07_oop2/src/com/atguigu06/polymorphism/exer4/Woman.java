package com.atguigu06.polymorphism.exer4;

/**
 * ClassName: Woman
 * Package: com.atguigu06.polymorphism.exer4
 * Description:
 * （3）在Woman类中，包含
 * ①重写上面的方法
 * ②增加 public void makeup()：打印化妆
 * @Author pluinyiasnhg
 * @Create 2025/12/28 21:35
 * @Version 1.0
 */
public class Woman extends Person{
    @Override
    public void eat() {
        System.out.println("女人在吃饭");
    }

    @Override
    public void toilet() {
        System.out.println("女人去上洗手间");
    }

    public void makeup() {
        System.out.println("女人在化妆");
    }
}
