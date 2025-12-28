package com.atguigu08.constructor.exer2;

/**
 * ClassName: TriAngle
 * Package: com.atguigu08.constructor.exer2
 * Description:
 * 案例：
 * 编写两个类，TriAngle和TriAngleTest，其中TriAngle类中声明私有的底边长base和高height，同时声明公共方法访问私有变量。
 * 此外，提供类必要的构造器。另一个类中使用这些公共方法，计算三角形的面积。
 * @Author pluinyiasnhg
 * @Create 2025/12/26 12:21
 * @Version 1.0
 */
public class TriAngle {
    private double base;
    private double height;

    public TriAngle() {}

    public TriAngle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getArea() {
        return 0.5 * base * height;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getBase() {
        return base;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
}
