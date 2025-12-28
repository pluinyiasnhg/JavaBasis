package com.atguigu07.object.tostring.exer;

import java.sql.SQLOutput;

/**
 * ClassName: CircleTest
 * Package: com.atguigu07.object.tostring.exer
 * Description:
 * 写一个测试类，创建两个Circle对象，判断其颜色是否相等；
 * 利用equals方法判断其半径是否相等；
 * 利用toString()方法输出其半径。
 * @Author pluinyiasnhg
 * @Create 2025/12/28 22:57
 * @Version 1.0
 */
public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle(1);
        Circle c2 = new Circle("black", 2, 3);
//        Circle c2 = new Circle("white", 2, 1);

        System.out.println("颜色是否相等？" + c1.getColor().equals(c2.getColor()));
        System.out.println("半径是否相等？" + c1.equals(c2));
        System.out.println("c1的半径为：" + c1.toString());
        System.out.println("c2的半径为：" + c2);
    }

}
