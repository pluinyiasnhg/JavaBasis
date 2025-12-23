package com.atguigu3.common_algorithm.exer4;

/**
 * ClassName: ArrayExer04
 * Package: com.atguigu3.common_algorithm.exer4
 * Description:
 * 案例：复制、赋值
 *
 * 使用简单数组
 * (1)创建一个名为ArrayTest的类，在main()方法中声明array1和array2两个变量，他们是int[]类型的数组。
 * (2)使用大括号{}，把array1初始化为8个素数：2,3,5,7,11,13,17,19。
 * (3)显示array1的内容。
 * (4)赋值array2变量等于array1，修改array2中的偶索引元素，使其等于索引值(如array[0]=0,array[2]=2)。
 * (5)打印出array1。
 *
 * 思考：array1和array2是什么关系？
 * 【answer】array1和array2是两个变量，共同指向了堆空间中的同一个数组结构。即二者的地址值相同。
 *
 * 拓展：修改题目，实现array2对array1数组的复制
 * @Author pluinyiasnhg
 * @Create 2025/12/23 09:51
 * @Version 1.0
 */
public class ArrayExer04 {
    public static void main(String[] args) {
        int[] array1 = new int[]{2,3,5,7,11,13,17,19};
        System.out.println("array1: ");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();

//        int[] array2 = array1;  // 赋值
        int[] array2 = new int[array1.length];  // 复制
        for (int i = 0; i < array2.length; i++) {
            array2[i] = array1[i];
        }

        // 修改array2中的偶索引元素
        for (int i = 0; i < array2.length; i += 2) {
            array2[i] = i;
        }
        System.out.println("array1: ");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();

        // 打印array1, array2 地址
        System.out.println("array1: " + array1);
        System.out.println("array2: " + array2);
    }
}
