package com.atguigu05.method_more._01overload.exer;

/**
 * ClassName: OverLoadExer02
 * Package: com.atguigu05.method_more._01overload.exer
 * Description:
 * 练习2：
 * 编写程序，定义三个重载方法并调用。方法名为mOL。
 * 三个方法分别接收一个int参数、两个int参数、一个字符串参数。
 * 分别执行平方运算并输出结果，相乘并输出结果，输出字符串信息。
 * @Author pluinyiasnhg
 * @Create 2025/12/25 11:52
 * @Version 1.0
 */
public class OverLoadExer02 {
    public void mOL(int num) {
        System.out.println(num * num);
    }

    public void mOL(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public void mOL(String str) {
        System.out.println(str);
    }
}
