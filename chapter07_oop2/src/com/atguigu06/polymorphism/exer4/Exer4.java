package com.atguigu06.polymorphism.exer4;

/**
 * ClassName: Exer4
 * Package: com.atguigu06.polymorphism.exer4
 * Description:
 * 2、在包中声明测试类Exer4
 *
 * 1）public static void meeting(Person...  ps)
 * 在该方法中，每一个人先吃饭，然后上洗手间，然后如果是男人，随后抽根烟；如果是女人，随后化个妆
 * 2）public static void main(String[] args)
 * 在主方法中，创建多个男人和女人对象，并调用meeting()方法进行测试
 * @Author pluinyiasnhg
 * @Create 2025/12/28 21:36
 * @Version 1.0
 */
public class Exer4 {
    public static void main(String[] args) {
//        Person[] people = new Person[4];
//        people[0] = new Man();
//        people[1] = new Man();
//        people[2] = new Woman();
//        people[3] = new Woman();

        meeting(new Man(), new Man(), new Woman(), new Woman());
    }

    public static void meeting(Person ... ps) {
        for (int i = 0; i < ps.length; i++) {
            ps[i].eat();
            ps[i].toilet();
            if (ps[i] instanceof Man)
                ((Man) ps[i]).smoke();
            if (ps[i] instanceof Woman)
                ((Woman) ps[i]).makeup();
        }
    }
}
