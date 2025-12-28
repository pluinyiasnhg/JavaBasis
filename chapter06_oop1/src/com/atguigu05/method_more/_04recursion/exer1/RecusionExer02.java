package com.atguigu05.method_more._04recursion.exer1;

/**
 * ClassName: RecusionExer02
 * Package: com.atguigu05.method_more._04recursion.exer1
 * Description:
 * 练习2：
 * 已知有一个数列：f(0) = 1,f(1) = 4,
 * f(n+2)=2*f(n+1) + f(n),其中n是大于0的整数，求f(10)的值。
 * @Author pluinyiasnhg
 * @Create 2025/12/25 14:54
 * @Version 1.0
 */
public class RecusionExer02 {
    public static void main(String[] args) {
        RecusionExer02 test = new RecusionExer02();
        System.out.println(test.f(10));
    }
    public int f(int n) {
        if (n == 0)
            return 1;
        else if (n == 1)
            return 4;
        else
            return 2 * f(n - 1) + f(n - 2);
    }
}
