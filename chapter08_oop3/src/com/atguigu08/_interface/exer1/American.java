package com.atguigu08._interface.exer1;

/**
 * ClassName: American
 * Package: com.atguigu08._interface.exer1
 * Description:
 * 3、声明实现类美国人American，重写抽象方法，打印用刀叉吃饭
 * @Author pluinyiasnhg
 * @Create 2026/1/3 09:21
 * @Version 1.0
 */
public class American implements Eatable {
    @Override
    public void eat() {
        System.out.println("用刀叉吃饭");
    }
}
