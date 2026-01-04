package com.atguigu04.block.exer;

/**
 * ClassName: Chinese
 * Package: com.atguigu04.block.exer
 * Description:
 *
 * @Author pluinyiasnhg
 * @Create 2026/1/1 09:09
 * @Version 1.0
 */
public class Chinese {
    public static void main(String[] args) {
//        System.out.println(Chinese.country);

        Chinese man = new Chinese("张三");
        Chinese woman = new Chinese("小红");
    }
//    private static String country = "中国";

    private static String country;
    private String name;

    {
        System.out.println("非静态代码块，country = " + country);
    }

    static {
        country = "中国";
        System.out.println("静态代码块");
    }

    public Chinese(String name) {
        this.name = name;
    }
}
