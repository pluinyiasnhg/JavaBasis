package com.atguigu02._class;

import org.junit.Test;

/**
 * ClassName: TestClassLoader
 * Package: com.atguigu02._class
 * Description:
 *
 * @Author pluinyiasnhg
 * @Create 2026/3/13 15:30
 * @Version 1.0
 */
public class TestClassLoader {
    @Test
    public void test01(){
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println("systemClassLoader = " + systemClassLoader);
    }

    @Test
    public void test02()throws Exception{
        /*
        Bootstrap ClassLoader是JVM内置的，用C++实现，不是Java对象
        它负责加载Java核心类库（java.*包下的类），如java.lang.String
         */
        ClassLoader c1 = String.class.getClassLoader();
        System.out.println("加载String类的类加载器：" + c1);

        /*
        ExtClassLoader（扩展类加载器）加载
        这个类属于sun.*包，是Java扩展库的一部分
        ExtClassLoader负责加载JAVA_HOME/jre/lib/ext目录下的jar包
        或者java.ext.dirs系统属性指定的目录
         */
        ClassLoader c2 = Class.forName("sun.util.resources.cldr.zh.TimeZoneNames_zh").getClassLoader();
        System.out.println("加载sun.util.resources.cldr.zh.TimeZoneNames_zh类的类加载器：" + c2);

        /*
        AppClassLoader（应用程序类加载器/系统类加载器）加载
        负责加载用户类路径（classpath）下的类
        这是最常见的类加载器，加载用户自定义的类
         */
        ClassLoader c3 = TestClassLoader.class.getClassLoader();
        System.out.println("加载当前类的类加载器：" + c3);
    }

    @Test
    public void test03(){
        ClassLoader c1 = TestClassLoader.class.getClassLoader();
        System.out.println("加载当前类的类加载器c1=" + c1);

        ClassLoader c2 = c1.getParent();
        System.out.println("c1.parent = " + c2);

        ClassLoader c3 = c2.getParent();
        System.out.println("c2.parent = " + c3);

    }
}