package com.atguigu3.common_algorithm;

import java.util.Scanner;

/**
 * ClassName: RectangleTest
 * Package: com.atguigu3.common_algorithm
 * Description:
 * 举例6：回形数
 *
 * 从键盘输入一个整数（1~20） ，则以该数字为矩阵的大小，把1,2,3…n*n 的数字按照顺时针螺旋的形式填入其中。
 *
 * 例如： 输入数字2，则程序输出：
 * 1 2
 * 4 3
 *
 * 输入数字3，则程序输出：
 * 1 2 3
 * 8 9 4
 * 7 6 5
 * 输入数字4， 则程序输出：
 * 1   2   3   4
 * 12  13  14  5
 * 11  16  15  6
 * 10  9   8   7
 * @Author pluinyiasnhg
 * @Create 2025/12/23 12:29
 * @Version 1.0
 */ public class RectangleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入数字：");
        int len = scanner.nextInt();

        /*
        k = 1 右移
        k = 2 下移
        k = 3 左移
        k = 4 上移
         */
        int[][] matrix = new int[len][len];
        int k = 1;   // k 控制方向
        int i = 0, j = 0;  // i 行号，j 列号
        int s = len * len; // s 矩阵大小
        for (int m = 1; m <= s; m++) {
            // 右移
            if (k == 1) {
                if (j < len && matrix[i][j] == 0) {
                    matrix[i][j++] = m;
                }
                else {
                    k = 2;
                    i++;
                    j--;
                    m--;
                }
            }
            // 下移
            else if (k == 2) {
                if (i < len && matrix[i][j] == 0) {
                    matrix[i++][j] = m;
                }
                else {
                    k = 3;
                    i--;
                    j--;
                    m--;
                }
            }
            // 左移
            else if (k == 3) {
                if (j >= 0 && matrix[i][j] == 0) {
                    matrix[i][j--] = m;
                }
                else {
                    k = 4;
                    i--;
                    j++;
                    m--;
                }
            }
            // 上移
            else if (k == 4) {
                if (i >= 0 && matrix[i][j] == 0) {
                    matrix[i--][j] = m;
                }
                else {
                    k = 1;
                    i++;
                    j++;
                    m--;
                }
            }
        }

        for (i = 0; i < len; i++) {
            for (j = 0; j < len; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        scanner.close();
    }
}
