package com.atguigu03._extends.exer2;

/**
 * ClassName: Cylinder
 * Package: com.atguigu03._extends.exer2
 * Description:
 *
 * @Author pluinyiasnhg
 * @Create 2025/12/27 15:30
 * @Version 1.0
 */
public class Cylinder extends Circle {
    private double length;

    public Cylinder() {
        length = 1;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public double findVolume() {
        return findArea() * length;
    }
}
