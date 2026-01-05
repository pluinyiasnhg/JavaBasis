package com.atguigu05.exer.exer1;

/**
 * ClassName: ComparableCircle
 * Package: com.atguigu08._interface.exer2
 * Description:
 * 定义一个ComparableCircle类，继承Circle类并且实现CompareObject接口。
 * 在ComparableCircle类中给出接口中方法compareTo的实现体，用来比较两个圆的半径大小。
 * @Author pluinyiasnhg
 * @Create 2026/1/3 09:29
 * @Version 1.0
 */
public class ComparableCircle extends Circle implements  CompareObject {
    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    /**
     * 比较两个圆的半径大小
     * @param o 另一个圆
     * @return 若返回值是0, 代表相等; 若为正数，代表当前对象大；负数代表当前对象小
     */
    @Override
    public int compareTo(Object o) {
        if (this == o)
            return 0;

        if (o instanceof ComparableCircle) {
            ComparableCircle c = (ComparableCircle) o;
            return Double.compare(getRadius(), c.getRadius());
        }
        else
            throw new RuntimeException("输入的类型不匹配");
    }
}
