package com.atguigu08._interface.exer3;

/**
 * ClassName: ElectricVehicle
 * Package: com.atguigu08._interface.exer3
 * Description:
 *
 * @Author pluinyiasnhg
 * @Create 2026/1/3 09:55
 * @Version 1.0
 */
public class ElectricVehicle extends Vehicle implements IPower {
    public ElectricVehicle() {
    }

    public ElectricVehicle(String brand, String color) {
        super(brand, color);
    }

    @Override
    public void run() {
        System.out.println("电动车通过电动机行驶");
    }

    @Override
    public void power() {
        System.out.println("电动车通过电提供动力");
    }
}
