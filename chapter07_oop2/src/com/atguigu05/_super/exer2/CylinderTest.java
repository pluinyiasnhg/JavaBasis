package com.atguigu05._super.exer2;

/**
 * ClassName: CylinderTest
 * Package: com.atguigu03._extends.exer2
 * Description:
 * 在CylinderTest类中创建Cylinder类的对象，设置圆柱的底面半径和高，并输出圆柱的体积。
 * @Author pluinyiasnhg
 * @Create 2025/12/27 15:32
 * @Version 1.0
 */
public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        cylinder.setRadius(3.0);
        cylinder.setLength(1.0);
        System.out.println("圆柱体的体积为：" + cylinder.findVolume());
        System.out.println("圆柱体的表面积为：" + cylinder.findArea());
    }
}
