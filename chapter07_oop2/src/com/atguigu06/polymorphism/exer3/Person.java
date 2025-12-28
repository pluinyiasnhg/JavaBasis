package com.atguigu06.polymorphism.exer3;

/**
 * ClassName: Person
 * Package: com.atguigu06.polymorphism.exer3
 * Description:
 *
 * @Author pluinyiasnhg
 * @Create 2025/12/28 10:38
 * @Version 1.0
 */
public class Person {
    protected String name = "person";
    protected int age = 50;

    public String getInfo() {
        return "Name: "+ name + "\n" +
                "age: "+ age;
    }
}
