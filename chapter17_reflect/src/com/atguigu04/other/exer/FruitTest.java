package com.atguigu04.other.exer;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * ClassName: FruitTest
 * Package: com.atguigu04.other.exer
 * Description:
 * 5、在FruitTest测试类中，
 * （1）读取配置文件，获取水果类名，并用反射创建水果对象，
 * （2）创建榨汁机对象，并调用run()方法
 * @Author pluinyiasnhg
 * @Create 2026/3/14 08:27
 * @Version 1.0
 */
public class FruitTest {
    @Test
    public void test1() throws Exception {
        //1. 读取配置文件中的信息，获取全类名
        Properties pro = new Properties();

        FileInputStream fis = new FileInputStream("src/config.properties");
        pro.load(fis);

        //2. 通过反射，创建指定全类名对应的类的实例
        String fruitName = pro.getProperty("fruitName");
        Class clazz = Class.forName(fruitName);

        Constructor con = clazz.getDeclaredConstructor();
        con.setAccessible(true);
        Object fruit = con.newInstance();

        //3. 通过反射，获取方法
        Method method = clazz.getDeclaredMethod("squeeze");
        Object invoke = method.invoke(fruit);

        fis.close();
    }

}
