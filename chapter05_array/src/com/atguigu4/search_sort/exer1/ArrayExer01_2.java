package com.atguigu4.search_sort.exer1;

/**
 * ClassName: ArrayExer01_2
 * Package: com.atguigu4.search_sort.exer1
 * Description:
 * 案例：数组的缩容：
 *
 * 现有数组 int[] arr={1,2,3,4,5,6,7}。现需删除数组中索引为4的元素。
 * @Author pluinyiasnhg
 * @Create 2025/12/23 15:37
 * @Version 1.0
 */
public class ArrayExer01_2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int deleteIndex = 4;
        for (int i = deleteIndex; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
