/**
 * 4.2 应用举例
 */
class BreakContinueTest1 {
    public static void main(String[] args) {
        //嵌套循环中的使用
        for(int i = 1;i <= 4;i++){

            for(int j = 1;j <= 10;j++){
                if(j % 4 == 0){
                    // break; //结束的是包裹break关键字的最近的一层循环！
                    continue;//结束的是包裹break关键字的最近的一层循环的当次！
                }
                System.out.print(j);
            }
            System.out.println();
        }

    }
}

/**
 * 4.4 经典案例
 * 题目：找出 100 以内所有的素数（质数）？100000 以内的呢？
 * 目的：不同的代码的实现方式，可以效率差别很大。分析：素数（质数）：只能被 1 和它本身整除的自然数。 ---> 从 2 开始，到
 * 这个数-1 为止，此范围内没有这个数的约数。则此数是一个质数。
 * 比如：2、3、5、7、11、13、17、19、23、...
 */
class PrimeNumberTest {
    public static void main(String[] args) {
        // 方法一：直接用素数定义
        // 优化：将循环条件中的 i 改为 Math.sqrt(i)
        long start = System.currentTimeMillis();  // 单位：毫秒
        int count = 0;
        for (int i = 2; i <= 100000; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
                count++;
        }

        long end = System.currentTimeMillis();
        System.out.println("总共有" + count + "个质数");  // 9592
        System.out.println("用时" + (end - start) + "ms"); // 663ms -> 7ms
    }
}

/**
 * 练习 1：生成 1-100 之间的随机数，直到生成了 97 这个数，看看一共用了几次？
 * 提示：使用 (int)(Math.random() * 100) + 1
 */
class BreakContinueExec1 {
    public static void main(String[] args) {
        int num = (int)(Math.random() * 100) + 1;
        int count = 1;
        do {
            System.out.println(num);
            if (num == 97)
                break;
            num = (int)(Math.random() * 100) + 1;
            count++;
        } while (true);

        System.out.println("总共用了" + count + "次");
    }
}
