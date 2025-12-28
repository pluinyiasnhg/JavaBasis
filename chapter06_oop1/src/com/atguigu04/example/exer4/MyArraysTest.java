package com.atguigu04.example.exer4;

import javax.swing.plaf.multi.MultiButtonUI;

/**
 * ClassName: MyArraysTest
 * Package: com.atguigu04.example.exer4
 * Description:
 *
 * 测试方法：求最大值、最小值、总和、平均数、遍历数组、复制数组、
 *          数组反转、数组排序(默认从小到大排序)、查找等
 * @Author pluinyiasnhg
 * @Create 2025/12/25 09:36
 * @Version 1.0
 */
public class MyArraysTest {
    public static void main(String[] args) {
        MyArrays arrs = new MyArrays();
        int[] arr = new int[]{34,56,223,2,56,24,56,67,778,45};

        System.out.println("最大值：" + arrs.getMax(arr) + "，最小值：" + arrs.getMin(arr) +
                "，总和：" + arrs.getSum(arr) + "，平均数：" + arrs.getAvg(arr));

        arrs.printArr(arr);

        // 复制数组
        int[] newArr = arrs.copyArr(arr);
        arrs.printArr(newArr);

        // 反转数组
        arrs.reverseArr(arr);
        arrs.printArr(arr);

        // 数组排序
        arrs.bubbleSort(arr);
        arrs.printArr(arr);

        // 查找
//        int index = arrs.linearSearch(arr, 56);
        int index = arrs.linearSearch(arr, 100);
        if (index == -1)
            System.out.println("没找到");
        else
            System.out.println("找到了，索引位置：" + index);
    }
}
