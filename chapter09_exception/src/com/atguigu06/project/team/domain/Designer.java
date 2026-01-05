package com.atguigu06.project.team.domain;

import com.atguigu06.project.team.service.Status;

/**
 * ClassName: Designer
 * Package: com.atguigu06.project.team.domain
 * Description:
 *
 * @Author pluinyiasnhg
 * @Create 2026/1/5 09:31
 * @Version 1.0
 */
public class Designer extends Programmer {
    private double bonus; // 奖金

    public Designer() {
    }

    public Designer(int id, String name, int age, double salary, Equipment equipment, double bonus) {
        super(id, name, age, salary, equipment);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return getDescription() + "设计师\t" + getStatus() + "\t" + getBonus() + "\t\t\t" +
                getEquipment().getDescription();
    }

    @Override
    public String getDetailForTeam() {
        return getDescription() + "设计师\t" + getBonus();
    }
}
