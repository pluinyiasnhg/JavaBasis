package com.atguigu07.object.tostring.exer;

/**
 * ClassName: Circle
 * Package: com.atguigu07.object.tostring.exer
 * Description:
 *
 * @Author pluinyiasnhg
 * @Create 2025/12/28 22:48
 * @Version 1.0
 */
public class Circle extends GeometricObject{
    private double radius;

    public Circle() {
        super();
        radius = 1.0;
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

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

    public double findArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj instanceof Circle circle) {
            return radius == circle.radius;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
