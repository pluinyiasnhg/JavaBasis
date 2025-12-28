package com.atguigu04.override.exer1;

/**
 * ClassName: Kids
 * Package: com.atguigu03._extends.exer1
 * Description:
 * 修改继承内容的练习1中定义的类Kids，在Kids中重新定义employeed()方法，
 * 覆盖父类ManKind中定义的employeed()方法，输出"Kids should study and no job."
 * @Author pluinyiasnhg
 * @Create 2025/12/27 15:15
 * @Version 1.0
 */
public class Kids extends ManKind {
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

    @Override
    public void employeed() {
        System.out.println("kids should study and no job.");
    }
}
