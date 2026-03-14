package com.atguigu04.other.exer;

/**
 * ClassName: Banana
 * Package: com.atguigu04.other.exer
 * Description:
 * 3、声明各种水果类，实现水果接口，并重写squeeze();
 * @Author pluinyiasnhg
 * @Create 2026/3/14 08:25
 * @Version 1.0
 */
public class Banana implements Fruit {
    @Override
    public void squeeze() {
        System.out.println("榨出一杯香蕉汁儿");
    }
}
