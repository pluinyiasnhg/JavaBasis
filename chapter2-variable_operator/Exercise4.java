/**
 * 7.1.2 案例与练习
 * 随意给出一个整数，打印显示它的个位数，十位数，百位数的值。
 * 格式如下:
 * <p>
 * 数字 153 的情况如下：
 * 个位数：3
 * 十位数：5
 * 百位数：1
 */
class Exercise4 {
    public static void main(String[] args) {
        int num = 153;
        int ge = num % 10;
        int shi = num / 10 % 10;
        int bai = num / 100;

        System.out.println("个位数：" + ge);
        System.out.println("十位数：" + shi);
        System.out.println("百位数：" + bai);
    }
}

class Exercise4_1 {
    /**
     * 获取一个四位数的个位，十位，百位，千位
     */
    public static void main(String[] args) {
        int num = 1234;
        int ge = num % 10;
        int shi = num / 10 % 10;
        int bai = num / 100 % 10;
        int qian = num / 1000;

        System.out.println("个位数：" + ge);
        System.out.println("十位数：" + shi);
        System.out.println("百位数：" + bai);
        System.out.println("千位数：" + qian);
    }
}