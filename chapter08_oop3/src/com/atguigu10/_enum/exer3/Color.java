package com.atguigu10._enum.exer3;

import org.junit.runner.notification.RunListener;

/**
 * ClassName: Color
 * Package: com.atguigu10._enum.exer3
 * Description:
 * 案例拓展：颜色枚举类(使用enum声明)
 * （1）声明颜色枚举类Color：
 * - 声明final修饰的int类型的属性red,green,blue
 * - 声明final修饰的String类型的属性description
 * - 声明有参构造器Color(int red, int green, int blue,String description)
 * - 创建7个常量对象：红、橙、黄、绿、青、蓝、紫，
 * - 重写toString方法，例如：RED(255,0,0)->红色
 *
 * 提示：
 * - 7个常量对象的RGB值如下：
 * 红：(255,0,0)
 * 橙：(255,128,0)
 * 黄：(255,255,0)
 * 绿：(0,255,0)
 * 青：(0,255,255)
 * 蓝：(0,0,255)
 * 紫：(128,0,255)
 *
 * 7个常量对象名如下：
 * RED, ORANGE, YELLOW, GREEN, CYAN, BLUE,PURPLE
 * @Author pluinyiasnhg
 * @Create 2026/1/4 08:50
 * @Version 1.0
 */
public enum Color {
    RED(255, 0, 0, "红"),
    ORANGE(255, 128, 0, "橙"),
    YELLOW(255, 255, 0, "黄"),
    GREEN(0, 255, 0, "绿"),
    CYAN(0, 255, 255, "青"),
    BLUE(0, 0, 255, "蓝"),
    PURPLE(128, 0, 255, "紫");

    private final int red;
    private final int green;
    private final int blue;
    private final String description;

    private Color(int red, int green, int blue, String description) {
        this.red = red;
        this.green = green;
        this.blue = blue;
        this.description = description;
    }

    public int getRed() {
        return red;
    }

    public int getGreen() {
        return green;
    }

    public int getBlue() {
        return blue;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return super.toString() + "(" + red + "," + green + "," + blue + ")->" +
                description + "色";
    }
}
