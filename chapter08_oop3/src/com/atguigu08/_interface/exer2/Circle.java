package com.atguigu08._interface.exer2;

/**
 * ClassName: Circle
 * Package: com.atguigu08._interface.exer2
 * Description:
 * 定义一个Circle类，声明radius属性，提供getter和setter方法
 * @Author pluinyiasnhg
 * @Create 2026/1/3 09:28
 * @Version 1.0
 */
public class Circle {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
