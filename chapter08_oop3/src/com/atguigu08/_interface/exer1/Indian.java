package com.atguigu08._interface.exer1;

/**
 * ClassName: Indian
 * Package: com.atguigu08._interface.exer1
 * Description:
 * 4、声明实现类印度人Indian，重写抽象方法，打印用手抓饭
 * @Author pluinyiasnhg
 * @Create 2026/1/3 09:22
 * @Version 1.0
 */
public class Indian implements Eatable {
    @Override
    public void eat() {
        System.out.println("用手抓饭");
    }
}
