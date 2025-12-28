package com.atguigu05.method_more._04recursion.exer1;

/**
 * ClassName: RecusionExer01
 * Package: com.atguigu05.method_more._04recursion.exer1
 * Description:
 * 练习1：
 * 已知一个数列：f(20) = 1,f(21) = 4,f(n+2) = 2*f(n+1)+f(n),
 * 其中n是大于0的整数，求f(10)的值。
 * @Author pluinyiasnhg
 * @Create 2025/12/25 14:46
 * @Version 1.0
 */
public class RecusionExer01 {
    public static void main(String[] args) {
        RecusionExer01 test = new RecusionExer01();
        System.out.println(test.f(10));
    }

    // f(n) = f(n+2) - 2*f(n+1)
    public int f(int n) {
        if (n == 20)
            return 1;
        else if (n == 21)
            return 4;
        else
            return f(n + 2) - 2 * f(n + 1);
    }
}
