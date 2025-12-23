package com.atguigu3.common_algorithm;

/**
 * ClassName: Test4
 * Package: com.atguigu3.common_algorithm
 * Description:
 * 举例4：
 * 创建一个长度为6的int型数组，
 * 要求数组元素的值都在1-30之间，且是随机赋值。
 * 同时，要求元素的值各不相同。
 * @Author pluinyiasnhg
 * @Create 2025/12/23 12:02
 * @Version 1.0
 */
public class Test4 {
    public static void main(String[] args) {
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (30 - 1 + 1)) + 1;
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] == arr[i]) {
                    i--;
                    break;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
