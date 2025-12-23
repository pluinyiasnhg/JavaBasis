package com.atguigu2.two;

/**
 * ClassName: Test25DifferentElementCount
 * Package: com.atguigu2.two
 * Description:
 *  1
 *  2 2
 *  3 3 3
 *  4 4 4 4
 *  5 5 5 5 5
 * @Author pluinyiasnhg
 * @Create 2025/12/23 07:47
 * @Version 1.0
 */
public class Test25DifferentElementCount {
    public static void main(String[] args) {
        // 1. 每列长度不一，采用动态初始化
        int[][] arr = new int[5][];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[i + 1];
            // 2. 二维数组arr赋值
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = i + 1;
            }
        }

//        // 2. 二维数组arr赋值
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = i + 1;
//            }
//        }

        // 3. 打印二维数组arr
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
