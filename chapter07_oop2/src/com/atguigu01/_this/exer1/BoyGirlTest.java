package com.atguigu01._this.exer1;

/**
 * ClassName: BoyGirlTest
 * Package: com.atguigu01._this.exer1
 * Description:
 *
 * @Author pluinyiasnhg
 * @Create 2025/12/26 20:06
 * @Version 1.0
 */
public class BoyGirlTest {
    public static void main(String[] args) {
        Boy boy = new Boy("小明", 23);
        Girl girl1 = new Girl("小红", 20);
        Girl girl2 = new Girl("小兰", 21);

        boy.marry(girl1);
        boy.shout();

        girl1.marry(boy);
        int compare = girl1.compare(girl2);
        if (compare > 0)
            System.out.println(girl1.getName() + "年龄大");
        else if (compare < 0)
            System.out.println(girl2.getName() + "年龄大");
        else
            System.out.println("一样大");
    }
}
