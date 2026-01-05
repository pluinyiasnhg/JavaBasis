package com.atguigu06.project.team.domain;

import com.atguigu06.project.team.service.Status;

/**
 * ClassName: Architect
 * Package: com.atguigu06.project.team.domain
 * Description:
 *
 * @Author pluinyiasnhg
 * @Create 2026/1/5 09:31
 * @Version 1.0
 */
public class Architect extends Designer {
    private int stock; // 公司奖励的股票数量

    public Architect() {
    }

    public Architect(int id, String name, int age, double salary, Equipment equipment, double bonus, int stock) {
        super(id, name, age, salary, equipment, bonus);
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return getDescription() + "架构师\t" + getStatus() + "\t" + getBonus() + "\t" + getStock() + "\t" +
                getEquipment().getDescription();
    }

    @Override
    public String getDetailForTeam() {
        return getDescription() + "架构师\t" + getBonus() + "\t" + getStock();
    }
}
