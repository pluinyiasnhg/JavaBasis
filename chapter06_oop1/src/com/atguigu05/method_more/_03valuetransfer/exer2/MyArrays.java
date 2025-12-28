package com.atguigu05.method_more._03valuetransfer.exer2;

/**
 * ClassName: MyArrays
 * Package: com.atguigu05.method_more._03valuetransfer.exer2
 * Description:
 * 针对atguigui04.example.exer4中MyArrays类的如下方法进行改进：
 * 数组排序，可以指明排序的方式（从小到大、从大到小）
 * @Author pluinyiasnhg
 * @Create 2025/12/25 12:38
 * @Version 1.0
 */
public class MyArrays {
    /**
     * 求int[]数组的最大值
     * @param arr int[]数组
     * @return 最大值
     */
    public int getMax(int[] arr) {
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
    public int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i])
                min = arr[i];
        }
        return min;
    }

    public int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public int getAvg(int[] arr) {
        return getSum(arr) / arr.length;
    }

    public void printArr(int[] arr) { // [1, 2, 3]
        System.out.print("[");

        for (int i = 0; i < arr.length; i++) {
            if (i == 0)
                System.out.print(arr[i]);
            else
                System.out.print(", " + arr[i]);
        }

        System.out.println("]");
    }

    public int[] copyArr(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }

        return newArr;
    }

    public void reverseArr(int[] arr) {
        int left = 0, right = arr.length - 1;
        for (; left < right; left++, right--) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
    }

    public void bubbleSort(int[] arr, String sortMethod) {
        if ("asc".equals(sortMethod)) {
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
        else if ("desc".equals(sortMethod)) {
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length - 1 - i; j++) {
                    if (arr[j] < arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }
        else
            System.out.println("输入的排序方式有误");
    }

    /**
     * 使用线性查找算法，查找指定的元素首次出现的位置
     * @param arr 待查找的数组
     * @param target 指定元素
     * @return 若找到，元素首次出现的索引位置；若没找到，返回-1
     */
    public int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i])
                return i;
        }

        return -1;
    }
}
