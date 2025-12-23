package com.atguigu4.search_sort.exer1;

/**
 * ClassName: ArrayExer01_1
 * Package: com.atguigu4.search_sort.exer1
 * Description:
 * 案例1：数组的扩容:
 *
 * 现有数组 int[] arr = new int[]{1,2,3,4,5};
 * 现将数组长度扩容1倍，并将10,20,30三个数据添加到arr数组中，如何操作？
 * @Author pluinyiasnhg
 * @Create 2025/12/23 15:33
 * @Version 1.0
 */
public class ArrayExer01_1 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};

        int[] temp = new int[arr.length << 1];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        temp[arr.length] = 10;
        temp[arr.length + 1] = 20;
        temp[arr.length + 2] = 30;
        arr = temp;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
