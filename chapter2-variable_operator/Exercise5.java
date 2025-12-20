/**
 * 案例 2：为抵抗洪水，战士连续作战 89 小时，编程计算共多少天零多少小时？
 */
class Exercise5 {
    public static void main(String[] args) {
        int hour = 89;
        int HOUR_PER_DAY = 24;
        int day = hour / HOUR_PER_DAY;
        hour %= 24;

        System.out.println("共" + day + "天" + hour + "小时");
    }
}

/**
 * 练习 1：算术运算符：自加、自减
 */
class ArithmeticExer3 {
    public static void main(String[] args) {
        int i1 = 10;
        int i2 = 20;
        int i = i1++;
        System.out.print("i=" + i);     // 10
        System.out.println("i1=" + i1); // 11
        i = ++i1;
        System.out.print("i=" + i);     // 12
        System.out.println("i1=" + i1); // 12
        i = i2--;
        System.out.print("i=" + i);     // 20
        System.out.println("i2=" + i2); // 19
        i = --i2;
        System.out.print("i=" + i);     // 18
        System.out.println("i2=" + i2); // 18

        System.out.println("5+5=" + 5 + 5); // 5+5=55

        byte bb1 = 127;
        bb1++;
        System.out.println("bb1 = " + bb1); //-128

        i = 1;
        int j = i++ + ++i * i++;
        System.out.println("j = " + j); // 10

        int m = 2;
        m = m++; //(1)先取 b 的值“2”放操作数栈 (2)m 再自增,m=3 (3)再把操作数栈中的"2"赋值给 m,m=2
        System.out.println(m); // 2

    }
}