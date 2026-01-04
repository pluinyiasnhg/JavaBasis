package com.atguigu08._interface.exer3;

/**
 * ClassName: Developer
 * Package: com.atguigu08._interface.exer3
 * Description:
 * 阿里的一个工程师Developer,结构见图   。
 * 其中，有一个乘坐交通工具的方法takingVehicle()，在此方法中调用交通工具的run()。
 * @Author pluinyiasnhg
 * @Create 2026/1/3 09:41
 * @Version 1.0
 */
public class Developer {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void takingVehicle(Vehicle vehicle) {
        vehicle.run();
    }
}
