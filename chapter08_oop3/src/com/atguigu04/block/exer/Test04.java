package com.atguigu04.block.exer;

/**
 * ClassName: Test04
 * Package: com.atguigu04.block.exer
 * Description:
 * 练习3
 * @Author pluinyiasnhg
 * @Create 2026/1/1 14:59
 * @Version 1.0
 */
public class Test04 {
    public static void main(String[] args) {
        /*
        顺序：
        （1）加载类：静态变量和静态代码块，同时出现二者，则按自上而下的顺序
        （2）创建对象时：非静态变量和代码块，然后是构造函数
         */
        Zi zi = new Zi();
    }
}

class Fu{
    private static int i = getNum("（1）i");
    private int j = getNum("（2）j");

    static{
        print("（3）父类静态代码块");
    }

    {
        print("（4）父类非静态代码块，又称为构造代码块");
    }

    Fu(){
        print("（5）父类构造器");
    }

    public static void print(String str){
        System.out.println(str + "->" + i);
    }

    public static int getNum(String str){
        print(str);
        return ++i;
    }
}
class Zi extends Fu{
    private static int k = getNum("（6）k");
    private int h = getNum("（7）h");

    static{
        print("（8）子类静态代码块");
    }

    {
        print("（9）子类非静态代码块，又称为构造代码块");
    }

    Zi(){
        print("（10）子类构造器");
    }

    public static void print(String str){
        System.out.println(str + "->" + k);
    }

    public static int getNum(String str){
        print(str);
        return ++k;
    }
}
