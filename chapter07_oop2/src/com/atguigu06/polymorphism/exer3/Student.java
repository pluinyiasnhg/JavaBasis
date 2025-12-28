package com.atguigu06.polymorphism.exer3;

/**
 * ClassName: Student
 * Package: com.atguigu06.polymorphism.exer3
 * Description:
 *
 * @Author pluinyiasnhg
 * @Create 2025/12/28 10:39
 * @Version 1.0
 */
public class Student extends Person{
    protected String school = "pku";

    @Override
    public String getInfo() {
        return  "Name: "+ name + "\nage: "+ age
                + "\nschool: "+ school;
    }
}
