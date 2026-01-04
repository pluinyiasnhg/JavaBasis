package com.atguigu04.block.exer;

/**
 * ClassName: LeafTest
 * Package: com.atguigu04.block.exer
 * Description:
 * 练习1：分析加载顺序
 * @Author pluinyiasnhg
 * @Create 2026/1/1 14:44
 * @Version 1.0
 */
class Root{
    static{
        System.out.println("Root的静态初始化块");
    }

    {
        System.out.println("Root的普通初始化块");
    }

    public Root(){
        System.out.println("Root的无参数的构造器");
    }
}

class Mid extends Root{
    static{
        System.out.println("Mid的静态初始化块");
    }

    {
        System.out.println("Mid的普通初始化块");
    }

    public Mid(){
        System.out.println("Mid的无参数的构造器");
    }

    public Mid(String msg){
        //通过this调用同一类中重载的构造器
        this();
        System.out.println("Mid的带参数构造器，其参数值："
                + msg);
    }
}

class Leaf extends Mid{
    static{
        System.out.println("Leaf的静态初始化块");
    }

    {
        System.out.println("Leaf的普通初始化块");
    }

    public Leaf(){
        //通过super调用父类中有一个字符串参数的构造器
        super("尚硅谷");
        System.out.println("Leaf的构造器");
    }
}

public class LeafTest{
    public static void main(String[] args){
        /*
        root静态初始块
        mid 静态初始块
        leaf静态初始块

        root普通初始块
        root无参构造器
        mid 普通初始块
        mid 无参构造器
        mid 带参构造器
        leaf普通初始块
        leaf无参构造器
         */
        new Leaf();
        System.out.println("****************");
        new Leaf();
    }
}