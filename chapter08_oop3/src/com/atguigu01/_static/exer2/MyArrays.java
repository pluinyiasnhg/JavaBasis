package com.atguigu01._static.exer2;

/**
 * ClassName: MyArrays
 * Package: com.atguigu04.example.exer4
 * Description:
 * 案例：
 * 根据上一章数组中的常用算法操作，自定义一个操作int[]的工具类。
 * 涉及到的方法有：求最大值、最小值、总和、平均数、遍历数组、复制数组、
 *              数组反转、数组排序(默认从小到大排序)、查找等
 * @Author pluinyiasnhg
 * @Create 2025/12/25 09:04
 * @Version 1.0
 */
public class MyArrays {
    /**
     * 求int[]数组的最大值
     * @param arr int[]数组
     * @return 最大值
     */
     public static int getMax(int[] arr) {
         int max = arr[0];
         for (int i = 0; i < arr.length; i++) {
             if (max < arr[i])
                 max = arr[i];
         }
         return max;
     }

    /**
     * 求int[]数组的最小值
     * @param arr int[]数组
     * @return 最小值
     */
    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i])
                min = arr[i];
        }
        return min;
    }

    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int getAvg(int[] arr) {
        return getSum(arr) / arr.length;
    }

    public static void printArr(int[] arr) { // [1, 2, 3]
        System.out.print("[");

        for (int i = 0; i < arr.length; i++) {
            if (i == 0)
                System.out.print(arr[i]);
            else
                System.out.print(", " + arr[i]);
        }

        System.out.println("]");
    }

    public static int[] copyArr(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }

        return newArr;
    }

    public static void reverseArr(int[] arr) {
        int left = 0, right = arr.length - 1;
        for (; left < right; left++, right--) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
    }

    /**
     * 使用线性查找算法，查找指定的元素首次出现的位置
     * @param arr 待查找的数组
     * @param target 指定元素
     * @return 若找到，元素首次出现的索引位置；若没找到，返回-1
     */
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i])
                return i;
        }

        return -1;
    }
}
