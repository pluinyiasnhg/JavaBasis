package com.atguigu02.selfdefine.exer2;

import java.util.Arrays;

/**
 * ClassName: Exer02
 * Package: com.atguigu02.selfdefine.exer2
 * Description:
 * 练习1: 泛型方法
 * 编写一个泛型方法，实现任意引用类型数组指定位置元素交换。
 * public static <E> void method1( E[] e,int a,int b)
 *
 * 练习2: 泛型方法
 * 编写一个泛型方法，接收一个任意引用类型的数组，并反转数组中的所有元素
 * public static <E> void method2( E[] e)
 * @Author pluinyiasnhg
 * @Create 2026/3/6 10:32
 * @Version 1.0
 */
public class Exer02 {
    public static <E> void method1(E[] e, int a, int b) {
        E temp = e[a];
        e[a] = e[b];
        e[b] = temp;
    }

    public static <E> void method2(E[] e) {
        for (int i = 0, j = e.length - 1; i < j; i++, j--) {
            Exer02.method1(e, i, j);
        }
    }

    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5};
        Exer02.method2(arr);
        System.out.println(Arrays.toString(arr));
    }
}
