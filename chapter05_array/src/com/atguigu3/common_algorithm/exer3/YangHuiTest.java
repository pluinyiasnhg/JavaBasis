package com.atguigu3.common_algorithm.exer3;

/**
 * ClassName: YangHuiTest
 * Package: com.atguigu3.common_algorithm.exer3
 * Description:
 * 案例：使用二维数组打印一个 10 行杨辉三角。
 *
 *    提示：
 *    1. 第一行有 1 个元素, 第 n 行有 n 个元素
 *    2. 每一行的第一个元素和最后一个元素都是 1
 *    3. 从第三行开始, 对于非第一个元素和最后一个元素的元素。即：
 *    yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j];
 * @Author pluinyiasnhg
 * @Create 2025/12/23 09:06
 * @Version 1.0
 */
public class YangHuiTest {
    public static void main(String[] args) {
        // 1. 数组雏形，元素皆为1
        int[][] yanghui = new int[10][];
        for (int i = 0; i < yanghui.length; i++) {
            yanghui[i] = new int[i + 1];
            // 2. 确定数组元素
            yanghui[i][0] = 1;
            yanghui[i][i] = 1;
            for (int j = 1; j < yanghui[i].length - 1; j++) {  // 遍历从第二个元素开始，倒数第二个元素结束
                yanghui[i][j] = yanghui[i-1][j] + yanghui[i-1][j-1];
            }
        }

//        // 2. 确定数组元素
//        for (int i = 0; i < yanghui.length; i++) {
//            for (int j = 1; j < yanghui[i].length - 1; j++) {  // 遍历从第二个元素开始，倒数第二个元素结束
//                yanghui[i][j] = yanghui[i-1][j] + yanghui[i-1][j-1];
//            }
//        }

        // 3. 打印数组
        for (int i = 0; i < yanghui.length; i++) {
            for (int j = 0; j < yanghui[i].length; j++) {
                System.out.print(yanghui[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
