package com.atguigu03.reflectapply.apply3;

/**
 * ClassName: User
 * Package: com.atguigu03.reflectapply.apply3
 * Description:
 *
 * @Author pluinyiasnhg
 * @Create 2026/3/13 22:10
 * @Version 1.0
 */
public class User {
    private String name;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("我是一个脉脉平台的用户");
    }
}