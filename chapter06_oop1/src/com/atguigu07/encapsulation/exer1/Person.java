package com.atguigu07.encapsulation.exer1;

/**
 * ClassName: Person
 * Package: com.atguigu07.encapsulation.exer1
 * Description:
 * 案例：
 * 创建程序,在其中定义两个类：Person和PersonTest类。定义如下：
 * 用setAge()设置人的合法年龄(0~130)，用getAge()返回人的年龄。
 * 在PersonTest类中实例化Person类的对象b，调用setAge()和getAge()方法，体会Java的封装性。
 * @Author pluinyiasnhg
 * @Create 2025/12/25 16:14
 * @Version 1.0
 */
public class Person {
    private int age;

    public void setAge(int age) {
        if (age < 0 || age > 130)
            System.out.println("输入年龄有误");
        else
            this.age = age;
    }

    public int getAge() {
        return age;
    }
}
