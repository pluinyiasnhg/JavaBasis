package com.atguigu3.common_algorithm.exer1;

/**
 * ClassName: ArrayExer01
 * Package: com.atguigu3.common_algorithm.exer1
 * Description:
 * 案例：定义一个int型的一维数组，包含10个元素，分别赋一些随机整数，然后求出所有元素的最大值，最小值，总和，平均值，
 * 并输出出来。
 *
 * 要求：所有随机数都是两位数：[10,99]
 * 提示：求[a,b]范围内的随机数： (int)(Math.random() * (b - a + 1)) + a;
 * @Author pluinyiasnhg
 * @Create 2025/12/23 09:09
 * @Version 1.0
 */
public class ArrayExer01 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        System.out.print("数组元素有：");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * (99 - 10 + 1) + 10);
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // 最大值、最小值、总和、平均值
        int max = arr[0];
        int min = arr[0];
        int sum = 0;
        double avg;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i])
                max = arr[i];
            if (min > arr[i])
                min = arr[i];
            sum += arr[i];
        }
        avg = (double)sum / arr.length;

        System.out.println("最大值：" + max + " 最小值：" + min + " 总和：" + sum + " 平均值：" + avg);
    }
}
