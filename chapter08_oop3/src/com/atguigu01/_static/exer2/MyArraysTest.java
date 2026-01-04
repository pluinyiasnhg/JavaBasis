package com.atguigu01._static.exer2;

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
        int[] arr = new int[]{34,56,223,2,56,24,56,67,778,45};

        System.out.println("最大值：" + MyArrays.getMax(arr) + "，最小值：" + MyArrays.getMin(arr) +
                "，总和：" + MyArrays.getSum(arr) + "，平均数：" + MyArrays.getAvg(arr));

        MyArrays.printArr(arr);

        // 复制数组
        int[] newArr = MyArrays.copyArr(arr);
        MyArrays.printArr(newArr);

        // 反转数组
        MyArrays.reverseArr(arr);
        MyArrays.printArr(arr);

        // 数组排序
        MyArrays.bubbleSort(arr);
        MyArrays.printArr(arr);

        // 查找
//        int index = MyArrays.linearSearch(arr, 56);
        int index = MyArrays.linearSearch(arr, 100);
        if (index == -1)
            System.out.println("没找到");
        else
            System.out.println("找到了，索引位置：" + index);
    }
}
