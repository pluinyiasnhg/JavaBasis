import java.util.Scanner;

/**
 * 案例 2：格式的多样性
 * 题目：写出输出的结果
 */
class ForTest2 {
    public static void main(String[] args) {
        int num = 1;
        for(System.out.print("a"); num < 3; System.out.print("c"), num++) {
            System.out.print("b");
        }
        // 结果为：abcbc
    }
}

/**
 * 案例 3：累加的思想
 * 题目：遍历 1-100 以内的偶数，并获取偶数的个数，获取所有的偶数的和
 */
class ForTest3 {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                count++;
                sum += i;
            }
        }
        System.out.println("偶数个数为" + count + "，偶数之和为" + sum);
    }
}

/**
 * 案例 4：结合分支结构使用
 * 题目：输出所有的水仙花数，所谓水仙花数是指一个 3 位数，其各个位上数字
 * 立方和等于其本身。例如： 153 = 1*1*1 + 3*3*3 + 5*5*5
 */
class ForTest4 {
    public static void main(String[] args) {
        System.out.println("所有三位数的水仙花数：");

        for (int num = 100; num < 1000; num++) {
            int ge = num % 10;
            int shi = num / 10 % 10;
            int bai = num / 100;

            if (num == bai*bai*bai + shi*shi*shi + ge*ge*ge) {
                System.out.println(num);
            }
        }
    }
}

/**
 * 案例4拓展：
 * 打印出四位数字中“个位+百位”等于“十位+千位”并且个位数为偶数，千位数为奇数的数字，
 * 并打印符合条件的数字的个数。
 */
class ForTest4_1 {
    public static void main(String[] args) {
        System.out.println("符合条件的四位数有：");

        int count = 0;
        for (int num = 1000; num < 10000; num++) {
            int ge = num % 10;
            int shi = num / 10 % 10;
            int bai = num / 100 % 10;
            int qian = num / 1000;

            if (ge + bai == shi + qian && ge % 2 == 0 && qian % 2 != 0) {
                count++;
                System.out.println(num);
            }
        }
        System.out.println("符合条件的数字个数有：" + count); // 165个
    }
}

/**
 * 案例 5：结合 break 的使用
 * 说明：输入两个正整数 m 和 n，求其最大公约数和最小公倍数。
 * 比如：12 和 20 的最大公约数是 4，最小公倍数是 60。
 */
class ForTest5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("输入正整数m：");
        int m = scanner.nextInt();
        System.out.print("输入正整数n：");
        int n = scanner.nextInt();

        scanner.close();

        /*
        求最大公约数，选其中较小（或任意选一个）的数，从大到小递减
         */
        int min = (m > n)? n : m;
        for (int i = min; i >= 1; i--) {
            if (m % i == 0 && n % i == 0) {
                System.out.println(m + "和" + n + "的最大公约数是" + i);
                break;
            }
        }

        /*
        求最小公倍数
         */
        int max = m + n - min;
        for (int i = max; i <= m * n; i += max) {
            if (i % min == 0) {
                System.out.println(m + "和" + n + "的最小公倍数是" + i);
                break;
            }
        }
    }
}

/**
 * 练习 1：打印 1~100 之间所有奇数的和
 */
class ForExer1 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i += 2) {
            sum += i;
        }
        System.out.println("1~100之间奇数之和为：" + sum);
    }
}

/**
 * 练习 2：打印 1~100 之间所有是 7 的倍数的整数的个数及总和（体会设置计数
 * 器的思想）
 */
class ForExer2 {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) {
                count++;
                sum += i;
            }
        }
        System.out.println("个数为：" + count + "，总和为：" + sum);
    }
}

/**
 * 编写程序从 1 循环到 150，并在每行打印一个值，另外在每个 3 的倍数行上打印出“foo”,
 * 在每个 5 的倍数行上打印“biz”,在每个 7 的倍数行上打印输出“baz”。
 */
class ForExer3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 150; i++) {
            System.out.print(i);
            if (i % 3 == 0)
                System.out.print(" foo");
            if (i % 5 == 0)
                System.out.print(" biz");
            if (i % 7 == 0)
                System.out.print(" baz");
            System.out.println();
        }
    }
}
