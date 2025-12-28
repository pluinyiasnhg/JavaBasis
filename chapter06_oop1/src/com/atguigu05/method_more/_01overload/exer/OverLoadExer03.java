package com.atguigu05.method_more._01overload.exer;

/**
 * ClassName: OverLoadExer03
 * Package: com.atguigu05.method_more._01overload.exer
 * Description:
 * 练习3：
 * 定义三个重载方法max()：
 * 第一个方法求两个int值中的最大值，
 * 第二个方法求两个double值中的最大值，
 * 第三个方法求三个double值中的最大值，并分别调用三个方法。
 * @Author pluinyiasnhg
 * @Create 2025/12/25 11:56
 * @Version 1.0
 */
public class OverLoadExer03 {
    public int max(int a, int b) {
        return (a > b)? a : b;
    }

    public double max(double a, double b) {
        return (a > b)? a : b;
    }

    public double max(double a, double b, double c) {
        double tempMax = max(a, b);
        return max(tempMax, c);
    }
}
