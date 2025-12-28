package com.atguigu07.encapsulation.exer3;

/**
 * ClassName: Employee
 * Package: com.atguigu07.encapsulation.exer3
 * Description:
 * 案例：普通员工类
 * （1）声明员工类Employee，
 * - 包含属性：姓名、性别、年龄、电话，属性私有化
 * - 提供get/set方法
 * - 提供String getInfo()方法
 * @Author pluinyiasnhg
 * @Create 2025/12/25 16:27
 * @Version 1.0
 */
public class Employee {
    private int id;
    private String name;
    private char gender;
    private int age;
    private String telephone;

    public String getInfo() {
        return id + "\t" + name + "\t" + gender + "\t" + age + "\t" + telephone;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public char getGender() {
        return gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getTelephone() {
        return telephone;
    }

}
