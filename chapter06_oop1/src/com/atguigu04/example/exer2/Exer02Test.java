package com.atguigu04.example.exer2;

/**
 * ClassName: Exer02Test
 * Package: com.atguigu04.example.exer2
 * Description:
 *
 * @Author pluinyiasnhg
 * @Create 2025/12/25 08:56
 * @Version 1.0
 */
public class Exer02Test {
    public static void main(String[] args) {
        Exer02 exer = new Exer02();

        exer.method1();

        int area = exer.method2();
        System.out.println("矩阵的面积为：" + area);

        area = exer.method3(2, 3);
        System.out.println("矩阵的面积为：" + area);
    }
}
