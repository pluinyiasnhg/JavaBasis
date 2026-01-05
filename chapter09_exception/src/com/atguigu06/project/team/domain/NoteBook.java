package com.atguigu06.project.team.domain;

import java.util.concurrent.locks.ReentrantLock;

/**
 * ClassName: NoteBook
 * Package: com.atguigu06.project.team.domain
 * Description:
 *
 * @Author pluinyiasnhg
 * @Create 2026/1/5 09:32
 * @Version 1.0
 */
public class NoteBook implements Equipment {
    private String model; // 机器的型号
    private double price;

    public NoteBook() {
    }

    public NoteBook(String model, double price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * 在菜单的“领用设备”一列，显示notebook的信息
     * @return 返回notebook的信息，形如 联想T4(6000.0)
     */
    @Override
    public String getDescription() {
        return model + "(" + price + ")";
    }
}
