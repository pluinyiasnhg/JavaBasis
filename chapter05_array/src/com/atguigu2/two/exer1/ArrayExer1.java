package com.atguigu2.two.exer1;

/**
 * ClassName: ArrayExer1
 * Package: com.atguigu2.two.exer1
 * Description:
 * 案例1：获取arr数组中所有元素的和。
 *
 * 提示：使用for的嵌套循环即可。
 * @Author pluinyiasnhg
 * @Create 2025/12/23 08:09
 * @Version 1.0
 */
public class ArrayExer1 {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{3, 5, 8}, {12, 9}, {7, 0, 6, 4}};

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("arr数组元素之和为：" + sum);
    }
}
