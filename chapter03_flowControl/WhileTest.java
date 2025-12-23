import java.util.Scanner;

/**
 * 案例 3：猜数字游戏
 * 随机生成一个 100 以内的数，猜这个随机数是多少？
 * 从键盘输入数，如果大了，提示大了；如果小了，提示小了；如果对了，就不再猜了，并统计一共猜了多少次。
 * 提示：生成一个[a,b] 范围的随机数的方式：(int)(Math.random() * (b - a + 1) + a)
 */
class WhileTest3 {
    public static void main(String[] args) {
        System.out.println("猜数字游戏，一个100以内的数：");
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int num = (int)(Math.random() * 100) + 1;

        boolean isRight = false;
        while (!isRight) {
            count++;
            int guess = scanner.nextInt();

            if (guess == num) {
                isRight = true;
                System.out.println("猜对了，数字是" + num);
                System.out.println("总共猜了" + count + "次");
            }
            else if (guess < num)
                System.out.println("猜小了");
            else
                System.out.println("猜大了");
        }

        scanner.close();
    }
}

/**
 * 案例 4：折纸珠穆朗玛峰
 * 世界最高山峰是珠穆朗玛峰，它的高度是 8848.86 米，假如我有一张足够大的纸，它的厚度是 0.1 毫米。
 * 请问，我折叠多少次，可以折成珠穆朗玛峰的高度?
 */
class WhileTest4 {
    public static void main(String[] args) {
        double mountain = 8848.86;  // 单位：米
        double paper = 0.1;  // 单位：毫米
        int count = 0;

        mountain *= 1000;  // 单位：毫米
        while (paper < mountain) {
            count++;
            paper *= 2;
        }

        System.out.println("折叠" + count + "次，可以折成珠穆朗玛峰的高度");  // 27次折叠
        System.out.println("此时纸张的厚度为：" + (paper / 1000) + "m");
    }
}

/**
 * 练习：从键盘输入整数，输入 0 结束，统计输入的正数、负数的个数。
 */
class WhileExer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positiveCount = 0;
        int negativeCount = 0;
        System.out.println("输入整数，整数为0时，停止：");

        int num = scanner.nextInt();
        while (num != 0) {
            if (num > 0)
                positiveCount++;
            else
                negativeCount++;
            num = scanner.nextInt();
        }

        System.out.println("正数个数为" + positiveCount);
        System.out.println("负数个数为" + negativeCount);

        scanner.close();
    }
}
