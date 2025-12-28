package com.atguigu05.method_more._03valuetransfer.exer1;

/**
 * ClassName: PassObject
 * Package: com.atguigu05.method_more._03valuetransfer.exer1
 * Description:
 * 2. 定义一个类PassObject，在类中定义一个方法printAreas()，该方法的定义如下：
 *      public void printAreas(Circle c, int time)。
 * 3. 在printAreas方法中打印输出1到time之间的每个整数半径值，以及对应的面积。
 *     例如，time为5，则输出半径1，2，3，4，5，以及对应的圆面积。
 * 4. 在main方法中调用printAreas()方法，调用完毕后输出当前半径值。程序运行结果如图所示。
 * @Author pluinyiasnhg
 * @Create 2025/12/25 12:26
 * @Version 1.0
 */
public class PassObject {
    public static void main(String[] args) {
        PassObject test = new PassObject();
        Circle circle = new Circle();
        test.printAreas(circle, 5);
    }

    public void printAreas(Circle c, int time) {
        System.out.println("Radius\tArea");
        for (int i = 1; i <= time; i++) {
            c.radius = i;
            System.out.println((double)i + "\t\t" + c.findArea());
        }

        System.out.println();
        System.out.println("now radius is:" + (double)(time + 1));
    }
}
