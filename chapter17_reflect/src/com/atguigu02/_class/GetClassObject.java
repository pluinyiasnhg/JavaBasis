package com.atguigu02._class;

import org.junit.Test;

import java.lang.annotation.ElementType;

/**
 * ClassName: GetClassObject
 * Package: com.atguigu02._class
 * Description:
 *
 * @Author pluinyiasnhg
 * @Create 2026/3/13 10:29
 * @Version 1.0
 */
public class GetClassObject {
    @Test
    public void test01() throws ClassNotFoundException{
        // 方式1：要求编译期间已知类型
        Class c1 = GetClassObject.class;

        // 方式2：获取对象的运行时类型
        GetClassObject obj = new GetClassObject();
        Class c2 = obj.getClass();

        // 方式3：可以获取编译期间未知的类型
        Class c3 = Class.forName("com.atguigu02._class.GetClassObject");

        // 方式4：其他方式
        Class c4 = ClassLoader.getSystemClassLoader().loadClass("com.atguigu02._class.GetClassObject");

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);
        System.out.println("c4 = " + c4);

        System.out.println(c1 == c2);
        System.out.println(c1 == c3);
        System.out.println(c1 == c4);
    }

    @Test
    public void test2(){
        Class c1 = Object.class;
        Class c2 = Comparable.class;
        Class c3 = String[].class;
        Class c4 = int[][].class;
        Class c5 = ElementType.class;
        Class c6 = Override.class;
        Class c7 = int.class;
        Class c8 = void.class;
        Class c9 = Class.class;

        int[] a = new int[10];
        int[] b = new int[100];
        Class c10 = a.getClass();
        Class c11 = b.getClass();
        // 只要元素类型与维度一样，就是同一个Class
        System.out.println(c10 == c11);
    }
}