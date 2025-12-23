package com.atguigu3.common_algorithm;

import java.util.Scanner;
/**
 * ClassName: RectangleTest1
 * Package: com.atguigu3.common_algorithm
 * Description:
 * 举例6：回形数
 *
 * 从键盘输入一个整数（1~20） ，则以该数字为矩阵的大小，把1,2,3…n*n 的数字按照顺时针螺旋的形式填入其中。
 *
 * 	01 02 03 04 05 06 07
 * 	24 25 26 27 28 29 08
 * 	23 40 41 42 43 30 09
 * 	22 39 48 49 44 31 10
 * 	21 38 47 46 45 32 11
 * 	20 37 36 35 34 33 12
 * 	19 18 17 16 15 14 13
 * @Author pluinyiasnhg
 * @Create 2025/12/23 14:50
 * @Version 1.0
 */
public class RectangleTest1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入数字：");
        int len = scanner.nextInt();

        /*
        有点像图形学里的内容，
        左上角坐标(minX, minY) = (0, 0)
        右下角坐标(maxX, maxY) = (len-1, len-1)
         */
        int minX = 0, minY = 0;
        int maxX = len - 1, maxY = len - 1;
        int[][] matrix = new int[len][len];
        int m = 1; // m 矩阵元素值
        while (minX <= maxX) {
            // 右移
            for (int i = minX; i <= maxX; i++) {  // i 表示在行上移动
                matrix[minY][i] = m++;
            }
            minY++;
            // 下移
            for (int j = minY; j <= maxY; j++) {  // j 表示在列上移动
                matrix[j][maxX] = m++;
            }
            maxX--;
            // 左移
            for (int i = maxX; i >= minX; i--) {
                matrix[maxY][i] = m++;
            }
            maxY--;
            // 上移
            for (int j = maxY; j >= minY; j--) {
                matrix[j][minX] = m++;
            }
            minX++;
        }

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                String space = (matrix[i][j]+"").length() == 1? "0" : "";
                System.out.print(space + matrix[i][j] + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}
