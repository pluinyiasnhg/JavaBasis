package com.atguigu08._interface.exer3;

/**
 * ClassName: Car
 * Package: com.atguigu08._interface.exer3
 * Description:
 *
 * @Author pluinyiasnhg
 * @Create 2026/1/3 09:51
 * @Version 1.0
 */
public class Car extends Vehicle implements IPower {
    private String carNumber;

    public Car() {
    }

    public Car(String brand, String color, String carNumber) {
        super(brand, color);
        this.carNumber = carNumber;
    }

    @Override
    public void run() {
        System.out.println("轿车通过内燃机行驶");
    }

    @Override
    public void power() {
        System.out.println("轿车通过汽油提供动力");
    }
}
