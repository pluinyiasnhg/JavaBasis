package com.atguigu08.constructor.exer2;

import javax.imageio.plugins.tiff.TIFFImageReadParam;

/**
 * ClassName: TriAngleTest
 * Package: com.atguigu08.constructor.exer2
 * Description:
 * 案例：
 * 编写两个类，TriAngle和TriAngleTest，其中TriAngle类中声明私有的底边长base和高height，同时声明公共方法访问私有变量。
 * 此外，提供类必要的构造器。另一个类中使用这些公共方法，计算三角形的面积。
 * @Author pluinyiasnhg
 * @Create 2025/12/26 12:25
 * @Version 1.0
 */
public class TriAngleTest {
    public static void main(String[] args) {
        TriAngle triAngle = new TriAngle(1.5, 1.2);
        System.out.println("三角形的面积为：" + triAngle.getArea());

        triAngle = new TriAngle();
        triAngle.setBase(2.0);
        triAngle.setHeight(1.3);
        System.out.println("三角形的面积为：" + triAngle.getArea());
    }
}
