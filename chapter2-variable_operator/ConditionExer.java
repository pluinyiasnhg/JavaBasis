/**
 * 7.6.2 案例
 * 案例 1：获取两个数中的较大值
 */
class ConditionExer1 {
    public static void main(String[] args) {
        int m = 10;
        int n = 5;
        int max = (m > n) ? m : n;
        System.out.println("两数中的较大值为：" + max);
    }
}

/**
 * 案例 2：获取三个数中的最大值
 */
class ConditionExer2 {
    public static void main(String[] args) {
        int m = 10;
        int n = 5;
        int p = 1;
        int tmpMax = (m > n)? m : n;
        int finalMax = (tmpMax > p)? tmpMax : p;
        System.out.println("三数中的较大值为：" + finalMax);
    }
}

/**
 * 案例 3：今天是周 2，10 天以后是周几？
 * 要求：控制台输出"今天是周 2，10 天以后是周 x"。
 */
class ConditionExer3 {
    public static void main(String[] args) {
        int today = 2;
        int futureDay = (today + 10) % 7;
        System.out.println("今天是周" + today + "，10天以后是周" + ((futureDay == 0)? "日" : futureDay));
    }
}