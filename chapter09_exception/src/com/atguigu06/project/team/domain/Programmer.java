package com.atguigu06.project.team.domain;

import com.atguigu06.project.team.service.Status;

/**
 * ClassName: Programmer
 * Package: com.atguigu06.project.team.domain
 * Description:
 *
 * @Author pluinyiasnhg
 * @Create 2026/1/5 09:31
 * @Version 1.0
 */
public class Programmer extends Employee {
    private int memberId; // 成员加入团队后，在团队中的ID
    private Status status = Status.FREE;  // 成员的状态：FREE, BUSY, VOCATION
    private Equipment equipment; // 成员领用的设备

    public Programmer() {
    }

    public Programmer(int id, String name, int age, double salary, Equipment equipment) {
        super(id, name, age, salary);
        this.equipment = equipment;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    @Override
    public String toString() {
        return getDescription() + "程序员\t" + getStatus() + "\t\t\t\t\t" + equipment.getDescription();
    }

    public String getDetailForTeam() {
        return getDescription() + "程序员";
    }
}
