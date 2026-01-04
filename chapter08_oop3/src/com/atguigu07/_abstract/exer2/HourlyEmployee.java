package com.atguigu07._abstract.exer2;

/**
 * ClassName: HourlyEmployee
 * Package: com.atguigu07._abstract.exer2
 * Description:
 * （4）参照SalariedEmployee类定义HourlyEmployee类，实现按小时计算工资的员工处理。该类包括：
 * private成员变量wage和hour；
 * 提供必要的构造器；
 * 实现父类的抽象方法earnings(),该方法返回wage*hour值；
 * toString()方法输出员工类型信息及员工的name，number,birthday。
 * @Author pluinyiasnhg
 * @Create 2026/1/2 18:20
 * @Version 1.0
 */
public class HourlyEmployee extends Employee {
    private double wage;
    private double hour;

    public HourlyEmployee() {
    }

    public HourlyEmployee(String name, int number, MyDate birthday, double wage, double hour) {
        super(name, number, birthday);
        this.wage = wage;
        this.hour = hour;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    @Override
    public double earnings() {
        return wage * hour;
    }

    @Override
    public String toString() {
//        return "HourlyEmployee[name = '" + getName() + "',number = " + getNumber() +
//                ",birthday=" + getBirthday().toDateString() + "]";
        return "HourlyEmployee" + super.toString();
    }
}
