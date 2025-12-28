package com.atguigu05.method_more._04recursion.exer2;

/**
 * ClassName: RabbitExer
 * Package: com.atguigu05.method_more._04recursion.exer2
 * Description:
 * 案例：不死神兔
 * 用递归实现不死神兔：故事得从西元1202年说起，话说有一位意大利青年，名叫斐波那契(Fibonacci)。
 * 在他的一部著作中提出了一个有趣的问题：假设一对刚出生的小兔一个月后就能长成大兔，
 * 再过一个月就能生下一对小兔，并且此后每个月都生一对小兔，没有发生死亡，
 * 问：现有一对刚出生的兔子2年后(24个月)会有多少对兔子?
 *
 * 拓展：走台阶问题
 * 假如有10阶楼梯，小朋友每次只能向上走1阶或者2阶，请问一共有多少种不同的走法呢？
 * 假如有1阶楼梯，有1种走法；2阶楼梯，有2种走法；3阶楼梯，有f(1)+f(2)种走法
 * @Author pluinyiasnhg
 * @Create 2025/12/25 14:57
 * @Version 1.0
 */
public class RabbitExer {
    public static void main(String[] args) {
        RabbitExer test = new RabbitExer();
        System.out.println("24个月后兔子的对数为：" + test.getRabbitNumber(24));
    }
    public int getRabbitNumber(int month) {
        if (month == 1 || month == 2)
            return 1;
        else
            return getRabbitNumber(month - 1) + getRabbitNumber(month - 2);
    }
}
