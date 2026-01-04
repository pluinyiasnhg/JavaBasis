package com.atguigu09.inner.exer;

/**
 * ClassName: ObjectTest
 * Package: com.atguigu09.inner.exer
 * Description:
 * 编写一个匿名内部类，它继承Object，并在匿名内部类中，声明一个方法public void test()打印尚硅谷。
 * 请编写代码调用这个方法。
 * @Author pluinyiasnhg
 * @Create 2026/1/3 10:55
 * @Version 1.0
 */
public class ObjectTest {
    public static void main(String[] args) {
        new Object() {
            public void  test() {
                System.out.println("尚硅谷");
            }
        }.test();
    }
}
