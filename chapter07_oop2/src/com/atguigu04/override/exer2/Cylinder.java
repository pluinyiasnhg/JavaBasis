package com.atguigu04.override.exer2;

import com.atguigu03._extends.exer2.Circle;

/**
 * ClassName: Cylinder
 * Package: com.atguigu03._extends.exer2
 * Description:
 * 修改继承内容的练习中定义的类Cylinder，在Cylinder中重写父类方法findArea()，用于计算圆柱的表面积
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
        return super.findArea() * length;
    }

    /**
     * 计算圆柱的表面积
     * @return 表面积
     */
    public double findArea() {
        return super.findArea() * 2 + 2 * Math.PI * getRadius() * length;
    }
}
