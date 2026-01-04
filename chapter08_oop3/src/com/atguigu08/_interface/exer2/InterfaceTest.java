package com.atguigu08._interface.exer2;

/**
 * ClassName: InterfaceTest
 * Package: com.atguigu08._interface.exer2
 * Description:
 * 定义一个测试类InterfaceTest，创建两个ComparableCircle对象，调用compareTo方法比较两个类的半径大小。
 *
 * 拓展：参照上述做法定义矩形类Rectangle和ComparableRectangle类，在ComparableRectangle类
 * 中给出compareTo方法的实现，比较两个矩形的面积大小。
 * @Author pluinyiasnhg
 * @Create 2026/1/3 09:37
 * @Version 1.0
 */
public class InterfaceTest {
    public static void main(String[] args) {
        ComparableCircle c1 = new ComparableCircle(10);
        ComparableCircle c2 = new ComparableCircle(8);

        int result = c1.compareTo(c2);
        if (result == 0)
            System.out.println("半径一样大");
        else if (result > 0)
            System.out.println("c1半径大");
        else
            System.out.println("c2半径大");
    }
}
