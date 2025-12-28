package com.atguigu06.polymorphism.exer4;

/**
 * ClassName: Man
 * Package: com.atguigu06.polymorphism.exer4
 * Description:
 * （2）在Man类中，包含
 * ①重写上面的方法
 * ②增加  public void smoke()：打印抽烟
 * @Author pluinyiasnhg
 * @Create 2025/12/28 21:33
 * @Version 1.0
 */
public class Man extends Person{
    @Override
    public void eat() {
        System.out.println("男人在吃饭");
    }

    @Override
    public void toilet() {
        System.out.println("男人去上洗手间");
    }

    public void smoke() {
        System.out.println("男人在抽烟");
    }
}
