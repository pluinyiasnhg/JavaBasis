/**
 * 7.5.3 案例
 * 案例 2：如何交换两个 int 型变量的值？String 呢？
 */
class BitExer {
    public static void main(String[] args) {
        int m = 10;
        int n = 5;

        // 方法一：适用于 int 和 String
//        int temp = m;
//        m = n;
//        n = temp;

        // 方法二：只适用于数值类型，且加法运算有溢出风险
//        m = m + n;
//        n = m - n;
//        m = m - n;

        // 方法三：只适用于数值类型，无方法二的溢出风险
        m = m ^ n;
        n = m ^ n;
        m = m ^ n;

        System.out.println("m = " + m + ", n = " + n);
    }
}