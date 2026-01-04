package com.atguigu04.block.exer;

/**
 * ClassName: Son
 * Package: com.atguigu04.block.exer
 * Description:
 * 练习2：分析加载顺序
 * @Author pluinyiasnhg
 * @Create 2026/1/1 14:52
 * @Version 1.0
 */
class Father {
    static {
        System.out.println("11111111111");
    }

    {
        System.out.println("22222222222");
    }

    public Father() {
        System.out.println("33333333333");

    }
}

public class Son extends Father {
    static {
        System.out.println("44444444444");
    }

    {
        System.out.println("55555555555");
    }

    public Son() {
        System.out.println("66666666666");
    }

    public static void main(String[] args) {
        /*
        1 - 4 - 7 - *
        2 - 3 - 5 - 6 - *
        2 - 3 - 5 - 6 - *
        2 - 3
         */
        System.out.println("77777777777");
        System.out.println("************************");
        new Son();
        System.out.println("************************");

        new Son();
        System.out.println("************************");
        new Father();
    }

}
