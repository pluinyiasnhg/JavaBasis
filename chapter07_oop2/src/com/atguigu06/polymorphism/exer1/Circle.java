package com.atguigu06.polymorphism.exer1;

/**
 * ClassName: Circle
 * Package: com.atguigu06.polymorphism.exer1
 * Description:
 * 子类Circle代表圆形，
 * @Author pluinyiasnhg
 * @Create 2025/12/28 10:16
 * @Version 1.0
 */
public class Circle extends GeometricObject{
    private double radius;

    public Circle(String color, double weight, double radius) {
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * 计算圆的面积
     * @return 返回圆的面积
     */
    @Override
    public double findArea() {
        return Math.PI * getRadius() * getRadius();
    }
}
