package com.atguigu08._interface.exer3;

/**
 * ClassName: VehicleTest
 * Package: com.atguigu08._interface.exer3
 * Description:
 * 为了出行方便，他买了一辆捷安特自行车、一辆雅迪电动车和一辆奔驰轿车。
 * 请编写相关代码，并测试。
 *
 * 提示：创建Vehicle[]数组，保存阿里工程师的三辆交通工具，并分别在工程师的takingVehicle()中调用。
 * @Author pluinyiasnhg
 * @Create 2026/1/3 09:58
 * @Version 1.0
 */
public class VehicleTest {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Bicycle("捷安特", "黑色");
        vehicles[1] = new Car("奔驰", "白色", "1234");
        vehicles[2] = new ElectricVehicle("雅迪", "红色");

        Developer developer = new Developer();
        for (int i = 0; i < vehicles.length; i++) {
            developer.takingVehicle(vehicles[i]);
            if (vehicles[i] instanceof IPower)
                ((IPower) vehicles[i]).power();
        }
    }
}
