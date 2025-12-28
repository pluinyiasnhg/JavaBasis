package com.atguigu05._super.exer2;

/**
 * ClassName: Circle
 * Package: com.atguigu03._extends.exer2
 * Description:
 *
 * @Author pluinyiasnhg
 * @Create 2025/12/27 15:28
 * @Version 1.0
 */
public class Circle {
    private double radius;

    public Circle() {
        radius = 1;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double findArea() {
        return Math.PI * radius * radius;
    }
}
