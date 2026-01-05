package com.atguigu05.exer.exer3;

/**
 * ClassName: Exer3
 * Package: com.atguigu05.exer.exer3
 * Description:
 * （3）定义测试类Exer3
 * ① 使用满参构造方法创建Person对象，生命值传入一个负数
 * 由于一旦遇到异常,后面的代码的将不在执行,所以需要注释掉上面的代码
 * ② 使用空参构造创建Person对象
 * 调用setLifeValue(int lifeValue)方法,传入一个正数,运行程序
 * 调用setLifeValue(int lifeValue)方法,传入一个负数,运行程序
 * ③ 分别对①和②处理异常和不处理异常进行运行看效果
 * @Author pluinyiasnhg
 * @Create 2026/1/5 08:31
 * @Version 1.0
 */
public class Exer3 {
    public static void main(String[] args) {
        try {
            Person zhangSan = new Person("张三", -3);
            System.out.println(zhangSan);
        }
        catch (NoLifeValueException e) {
            System.out.println(e.getMessage());
        }

        Person person = new Person();
        person.setLifeValue(10);
        System.out.println(person);
        person.setLifeValue(-1);
        System.out.println(person);
    }
}
