package com.atguigu05.method_more._03valuetransfer.exer2;

/**
 * ClassName: MyArraysTest
 * Package: com.atguigu05.method_more._03valuetransfer.exer2
 * Description:
 *
 * @Author pluinyiasnhg
 * @Create 2025/12/25 12:42
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
        arrs.bubbleSort(arr, "asc");
        arrs.printArr(arr);
        arrs.bubbleSort(arr, "desc");
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
