package com.atguigu04.other.exer;

/**
 * ClassName: Apple
 * Package: com.atguigu04.other.exer
 * Description:
 * 3、声明各种水果类，实现水果接口，并重写squeeze();
 * @Author pluinyiasnhg
 * @Create 2026/3/14 08:21
 * @Version 1.0
 */
public class Apple implements Fruit {
    @Override
    public void squeeze() {
        System.out.println("榨出一杯苹果汁儿");
    }
}
