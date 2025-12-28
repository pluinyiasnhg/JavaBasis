package com.atguigu03._extends.exer1;

/**
 * ClassName: ManKind
 * Package: com.atguigu03._extends.exer1
 * Description:
 * (1)定义一个ManKind类，包括
 *
 * - 成员变量int sex和int salary；
 * - 方法void manOrWoman()：根据sex的值显示“man”(sex==1)或者“woman”(sex==0)；
 * - 方法void employeed()：根据salary的值显示“no job”(salary==0)或者“ job”(salary!=0)。
 * @Author pluinyiasnhg
 * @Create 2025/12/27 15:12
 * @Version 1.0
 */
public class ManKind {
    private int sex;
    private int salary;

    public ManKind() {

    }

    public ManKind(int sex, int salary) {
        this.sex = sex;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public void manOrWoman() {
        if (sex == 1)
            System.out.println("man");
        else if (sex == 0)
            System.out.println("woman");
    }

    public void employeed() {
        if (salary == 0)
            System.out.println("no job");
        else
            System.out.println("job");
    }
}
