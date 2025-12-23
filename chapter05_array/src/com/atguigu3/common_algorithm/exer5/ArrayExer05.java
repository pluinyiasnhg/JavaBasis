package com.atguigu3.common_algorithm.exer5;

/**
 * ClassName: ArrayExer05
 * Package: com.atguigu3.common_algorithm.exer5
 * Description:
 * 案例：
 * 定义数组：int[] arr = new int[]{34,54,3,2,65,7,34,5,76,34,67};
 * 如何实现数组元素的反转存储？你有几种方法。
 * @Author pluinyiasnhg
 * @Create 2025/12/23 10:11
 * @Version 1.0
 */
public class ArrayExer05 {
    public static void main(String[] args) {
        int[] arr = new int[]{34,54,3,2,65,7,34,5,76,34,67};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

//        // 方法一：开辟一个数组
//        int[] temp = new int[arr.length];
//        for (int i = 0; i < temp.length; i++) {
//            temp[i] = arr[arr.length - 1 - i];
//        }
//
//        arr = temp;
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }

//        // 方法二：交换首尾元素
//        for (int i = 0; i < arr.length / 2; i++) {
//            int temp = arr[i];
//            arr[i] = arr[arr.length-1-i];
//            arr[arr.length-1-i] = temp;
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }

        // 方法三：双指针，交换首尾元素
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
