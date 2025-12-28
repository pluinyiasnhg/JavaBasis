package com.atguigu07.object.equals.exer1;

/**
 * ClassName: OrderTest
 * Package: com.atguigu07.object.equals.exer1
 * Description:
 *
 * @Author pluinyiasnhg
 * @Create 2025/12/28 22:36
 * @Version 1.0
 */
public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order(1, "订单1");

        boolean isEquals = order.equals(new Order(1, "订单1"));
        System.out.println("是否是同一个订单？" + isEquals);

        isEquals = order.equals(new Order(1, "订单2"));
        System.out.println("是否是同一个订单？" + isEquals);
    }
}
