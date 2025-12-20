/**
 * 2.1.2 应用举例
 * 案例 1：成年人心率的正常范围是每分钟 60-100 次。体检时，如果心率不在此
 * 范围内，则提示需要做进一步的检查。
 */
class IfElseTest1 {
    public static void main(String[] args) {
        int heartRate = 89;
        if (heartRate >= 60 && heartRate <= 100) {
            System.out.println("心率正常");
        }
        else {
            System.out.println("心率不正常，请进一步检查");
        }
    }
}

/**
 * 案例 2：定义一个整数，判定是偶数还是奇数
 */
class IfElseTest2 {
    public static void main(String[] args) {
        int num = 2;
        if (num % 2 == 0)
            System.out.println(num + "是偶数");
        else
            System.out.println(num + "是奇数");
    }
}

/**
 * 案例 3：
 * 岳小鹏参加 Java 考试，他和父亲岳不群达成承诺：
 * 如果：
 * 成绩为 100 分时，奖励一辆跑车；
 * 成绩为(80，99]时，奖励一辆山地自行车；
 * 当成绩为[60,80]时，奖励环球影城一日游；
 * 其它时，胖揍一顿。
 * 说明：默认成绩是在[0,100]范围内
 */
class IfElseTest3 {
    public static void main(String[] args) {
        int score = 90;
        if (score == 100)
            System.out.println("奖励一辆跑车");
        else if (score > 80) {
            System.out.println("奖励一辆山地自行车");
        } else if (score >= 60) {
            System.out.println("奖励环球影城一日游");
        }
        else {
            System.out.println("胖揍一顿");
        }
    }
}

/**
 * 案例 4：由键盘输入三个整数分别存入变量 num1、num2、num3，对它们进行
 * 排序(使用 if-else if-else)，并且从小到大输出。
 *
 * 思路是：先判断 num1和num2谁大，假设 num1 < num2，那么 num3 只有三个位置可以插入
 * 如果比两个数都小，则插入左边；如果比两个数都大，则插入右边；否则，插入中间位置。
 * num1 > num2 的情况，同理可得
 */
class IfElseTest4 {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 3;
        int num3 = 2;

        if (num1 < num2) {
            if (num3 < num1)
                System.out.println("num3 < num1 < num2");
            else if (num3 > num2)
                System.out.println("num1 < num2 < num3");
            else
                System.out.println("num1 < num3 < num2");
        }
        else {
            if (num3 < num2)
                System.out.println("num3 < num2 < num1");
            else if (num3 > num1)
                System.out.println("num2 < num1 < num3");
            else
                System.out.println("num2 < num3 < num1");
        }
    }
}

class IfElseExer {
    public static void main(String[] args) {
        // 练习1
        //1)对下列代码，若有输出，指出输出结果。
        // 输出：atguigu
        int x = 4;
        int y = 1;
        if (x > 2) {
            if (y > 2)
                System.out.println(x + y);
                System.out.println("atguigu");
        } else
            System.out.println("x is " + x);

        // 练习 2：
        boolean b = true;
        //如果写成 if(b=false)能编译通过吗？如果能，结果是？c
        if(b == false)
        //建议：if(!b)
            System.out.println("a");
        else if(b)
            System.out.println("b");
        else if(!b)
            System.out.println("c");
        else
            System.out.println("d");

        /*
        练习3:
        定义两个整数，分别为 small 和 big，如果第一个整数 small 大于第二个整数
big，就交换。输出显示 small 和 big 变量的值。
         */
        int small = 2;
        int big = 1;
        if (small > big) {
            int temp = small;
            small = big;
            big = temp;
        }
        System.out.println("small = " + small + ", big = " + big);

        /*
        练习 4：小明参加期末 Java 考试，通过考试成绩，判断其 Java 等级，成绩范围
        [0,100]
        •90-100 优秀
        •80-89 好
        •70-79 良
        •60-69 及格
        •60 以下 不及格
         */
        int score = 95;
        if (score < 0 || score > 100)
            // 临界条件判断
            System.out.println("Java 成绩出错");
        else if (score >= 90)
            System.out.println("Java 成绩优秀");
        else if (score >= 80)
            System.out.println("Java 成绩好");
        else if (score >= 70)
            System.out.println("Java 成绩良");
        else if (score >= 60)
            System.out.println("Java 成绩及格");
        else
            System.out.println("Java 成绩不及格");

        /*
        练习 5：
        编写程序，声明 2 个 int 型变量并赋值。判断两数之和，如果大于等于 50，打印“hel
        lo world!”
         */
        int num1 = 25;
        int num2 = 25;
        if (num1 + num2 >= 50)
            System.out.println("hello world!");

        /*
        练习 6：
        编写程序，声明 2 个 double 型变量并赋值。判断第一个数大于 10.0，且第 2 个数小
        于 20.0，打印两数之和。否则，打印两数的乘积。
         */
        // 自动类型提升: int -> double
        double d1 = 30;
        double d2 = 10;
        if (d1 > 10.0 && d2 < 20.0)
            System.out.println("两数之和为：" + (d1 + d2));
        else
            System.out.println("两数乘积为：" + (d1 * d2));

        /*
        练习 7：判断水的温度
        如果大于 95℃，则打印“开水”；
        如果大于 70℃且小于等于 95℃，则打印“热水”；
        如果大于 40℃且小于等于 70℃，则打印“温水”；
        如果小于等于 40℃，则打印“凉水”。
         */
        double tempature = 100;
        if (tempature > 95)
            System.out.println("开水");
        else if (tempature > 70)
            System.out.println("热水");
        else if (tempature > 40)
            System.out.println("温水");
        else
            System.out.println("凉水");
    }
}