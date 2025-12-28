package com.atguigu04.example.exer3;

/**
 * ClassName: Circle
 * Package: com.atguigu04.example.exer3
 * Description:
 * 案例：
 * 利用面向对象的编程方法，设计类Circle计算圆的面积。
 * @Author pluinyiasnhg
 * @Create 2025/12/25 09:00
 * @Version 1.0
 */
public class Circle {
    double radius;

    public double findArea() {
        return 3.14 * radius * radius;
    }

    public void printArea() {
        System.out.println("圆的面积为：" + findArea());
    }
}
