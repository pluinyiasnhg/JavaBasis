package com.atguigu06.polymorphism.exer1;

import javax.swing.*;
import java.awt.*;

/**
 * ClassName: GeometricTest
 * Package: com.atguigu06.polymorphism.exer1
 * Description:
 * 定义一个测试类GeometricTest，
 * 编写equalsArea方法测试两个对象的面积是否相等（注意方法的参数类型），
 * 编写displayGeometricObject方法显示对象的面积（注意方法的参数类型）。
 * @Author pluinyiasnhg
 * @Create 2025/12/28 10:21
 * @Version 1.0
 */
public class GeometricTest {
    public static void main(String[] args) {
        GeometricObject g1 = new Circle("红色", 1, 2);
        GeometricObject g2 = new MyRectangle("蓝色", 2, 3, 4);
        GeometricTest test = new GeometricTest();

        boolean isEqual = test.equalsArea(g1, g2);
        System.out.println("面积是否相等？" + isEqual);

        // 打印两个图形的面积
        test.displayGeometricObject(g1);
        test.displayGeometricObject(g2);
    }

    public boolean equalsArea(GeometricObject g1, GeometricObject g2) {
        return g1.findArea() == g2.findArea();
    }

    public void displayGeometricObject(GeometricObject g) {
        System.out.println("几何图形的面积为：" + g.findArea());
    }
}
