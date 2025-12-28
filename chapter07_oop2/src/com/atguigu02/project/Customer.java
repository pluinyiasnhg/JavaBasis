package com.atguigu02.project;

/**
 * ClassName: Customer
 * Package: com.atguigu02.project
 * Description:
 * Customer为实体对象，用来封装客户信息
 *
 * 该类封装客户的以下信息：
 * String name ：客户姓名
 * char gender  ：性别
 * int age          ：年龄
 * String phone：电话号码
 * String email ：电子邮箱
 *  提供各属性的get/set方法
 *  提供所需的构造器（可自行确定）
 * @Author pluinyiasnhg
 * @Create 2025/12/27 08:23
 * @Version 1.0
 */
public class Customer {
    public static void main(String[] args) {
        Customer c1 = new Customer();
        c1.getInfo();
        Customer c2 = new Customer("张三", '男', 20, "123456789", "123@qq.com");
        c2.getInfo();
    }
    private String name;
    private char gender;
    private int age;
    private String phone;
    private String email;

    public Customer() {

    }

    public Customer(String name, char gender, int age, String phone, String email) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.phone = phone;
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getInfo() {
        return ("姓名：" + name + " 性别：" + gender + " 年龄：" + age + " 电话号码：" + phone +
                " 电子邮件：" + email);
    }
}
