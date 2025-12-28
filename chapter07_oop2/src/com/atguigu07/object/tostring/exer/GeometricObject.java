package com.atguigu07.object.tostring.exer;

/**
 * ClassName: GeometricObject
 * Package: com.atguigu07.object.tostring.exer
 * Description:
 * 定义两个类，父类GeometricObject代表几何形状，
 * 子类Circle代表圆形。
 * @Author pluinyiasnhg
 * @Create 2025/12/28 22:47
 * @Version 1.0
 */
public class GeometricObject {
    protected String color;
    protected double weight;

    public GeometricObject() {
        color = "white";
        weight = 1.0;
    }

    public GeometricObject(String color, double weight) {
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
}
