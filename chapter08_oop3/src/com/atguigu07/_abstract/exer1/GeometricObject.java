package com.atguigu07._abstract.exer1;

/**
 * ClassName: GeometricObject
 * Package: com.atguigu06.polymorphism.exer1
 * Description:
 * 定义三个类，父类GeometricObject代表几何形状，
 * @Author pluinyiasnhg
 * @Create 2025/12/28 10:14
 * @Version 1.0
 */
public abstract class GeometricObject {
    protected String color;
    protected double weight;

    protected GeometricObject(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // 针对多态性的练习题1：GeometricObject等类进行升级，体现抽象的使用
    public abstract double findArea();
}
