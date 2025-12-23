package com.atguigu2.two.exer2;

/**
 * ClassName: ArrayExer2
 * Package: com.atguigu2.two.exer2
 * Description:
 * 案例：声明：int[] x,y[]; 在给x,y变量赋值以后，以下选项允许通过编译的是：
 *
 * 声明：int[] x,y[]; 在给x,y变量赋值以后，以下选项允许通过编译的是：
 * a)    x[0] = y;
 * b)    y[0] = x;
 * c)    y[0][0] = x;
 * d)    x[0][0] = y;
 * e)    y[0][0] = x[0];
 * f)    x = y;
 *
 * 提示：
 * 一维数组：int[] x  或者int x[]
 * 二维数组：int[][] y 或者  int[] y[]  或者 int  y[][]
 * @Author pluinyiasnhg
 * @Create 2025/12/23 08:26
 * @Version 1.0
 */
public class ArrayExer2 {
    public static void main(String[] args) {
        int[] x = new int[]{1,2};
        int[] y[] = new int[][]{{1,2},{3,4}};
        /*
        a. No
        x[0] int, y int[][]
         */
//        x[0] = y;

        /*
        b. Yes
        y[0] int[], x int[]
         */
        y[0] = x;

        /*
        c. No
        y[0][0] int, x int[]
         */
//        y[0][0] = x;

        /*
        d. No
        x 是一维数组
         */
//        x[0][0] = y;

        /*
        e. Yes
        y[0][0],x[0] int
         */
        y[0][0] = x[0];

        /*
        f. No
        x int[], y int[][]
         */
//        x = y;
    }
}
