package com.atguigu08._interface.exer1;

/**
 * ClassName: EatableTest
 * Package: com.atguigu08._interface.exer1
 * Description:
 * 5、声明测试类EatableTest，创建Eatable数组，存储各国人对象，并遍历数组，调用eat()方法
 * @Author pluinyiasnhg
 * @Create 2026/1/3 09:23
 * @Version 1.0
 */
public class EatableTest {
    public static void main(String[] args) {
        Eatable[] eatables = new Eatable[3];
        eatables[0] = new Chinese();
        eatables[1] = new American();
        eatables[2] = new Indian();

        for (int i = 0; i < eatables.length; i++) {
            eatables[i].eat();
        }
    }
}
