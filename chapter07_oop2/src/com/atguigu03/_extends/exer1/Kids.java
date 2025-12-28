package com.atguigu03._extends.exer1;

import javax.imageio.plugins.tiff.GeoTIFFTagSet;

/**
 * ClassName: Kids
 * Package: com.atguigu03._extends.exer1
 * Description:
 * (2)定义类Kids继承ManKind，并包括
 *
 * - 成员变量int yearsOld；
 * - 方法printAge()打印yearsOld的值。
 * @Author pluinyiasnhg
 * @Create 2025/12/27 15:15
 * @Version 1.0
 */
public class Kids extends ManKind{
    private int yearsOld;

    public Kids() {

    }

    public Kids(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public Kids(int sex, int salary, int yearsOld) {
        setSex(sex);
        setSalary(salary);
        this.yearsOld = yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public int getYearsOld() {
        return yearsOld;
    }

    public void printAge() {
        System.out.println("I am " + yearsOld + " years old.");
    }
}
