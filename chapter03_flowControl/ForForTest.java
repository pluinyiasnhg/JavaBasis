/**
 * 案例 1：打印 5 行 6 个*
 */
class ForForTest1 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}

/**
 * 案例 2：打印 5 行直角三角形
 * *
 * **
 * ***
 * ****
 * *****
 */
class ForForTest2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}

/**
 * 案例 3：打印 5 行倒直角三角形
 * *****
 * ****
 * ***
 * **
 * *
 */
class ForForTest3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 6 - i; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}

/**
 * 案例 4：打印"菱形"形状的图案
 *         *
 *       * * *
 *     * * * * *
 *   * * * * * * *
 * * * * * * * * * *
 *   * * * * * * *
 *     * * * * *
 *       * * *
 *         *
 * 思路：将菱形分成上三角和下三角，
 * 上三角可以看成：
 * - - - - *
 * - - - * * *
 * - - * * * * *
 * - * * * * * * *
 * * * * * * * * * *
 */
class ForForTest4 {
    public static void main(String[] args) {
        // 上三角
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++)
//                System.out.print("- ");
                System.out.print("  ");
            for (int k = 1; k <= 2 * i - 1; k++)
                System.out.print("* ");
            System.out.println();
        }
        // 下三角
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++)
//                System.out.print("- ");
                System.out.print("  ");
            for (int k = 1; k <= 9 - 2 * i; k++)
                System.out.print("* ");
            System.out.println();
        }
    }
}

/**
 * 案例 5：九九乘法表
 * 1*1=1
 * 2*1=2   2*2=4
 * 3*1=3   3*2=6   3*3=9
 * 4*1=4   4*2=8   4*3=12  4*4=16
 * 5*1=5   5*2=10  5*3=15  5*4=20  5*5=25
 * 6*1=6   6*2=12  6*3=18  6*4=24  6*5=30  6*6=36
 * 7*1=7   7*2=14  7*3=21  7*4=28  7*5=35  7*6=42  7*7=49
 * 8*1=8   8*2=16  8*3=24  8*4=32  8*5=40  8*6=48  8*7=56  8*8=64
 * 9*1=9   9*2=18  9*3=27  9*4=36  9*5=45  9*6=54  9*7=63  9*8=72  9*9=81
 */
class ForForTest5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(i + "*" + j + "=" + (i * j) + "\t");
            System.out.println();
        }
    }
}
