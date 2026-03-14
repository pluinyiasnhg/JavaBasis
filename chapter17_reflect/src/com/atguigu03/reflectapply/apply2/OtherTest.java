package com.atguigu03.reflectapply.apply2;

import com.atguigu03.reflectapply.data.Person;
import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;

/**
 * @author shkstart
 * @create 14:45
 */
public class OtherTest {

    //（熟悉）获取运行时类的内部结构2：父类、接口们、包、带泛型的父类、父类的泛型等
    //1. 获取运行时类的父类
    @Test
    public void test1(){
        Class clazz = Person.class;
        Class superclass = clazz.getSuperclass();
        System.out.println(superclass);
    }
    //2. 获取运行时类实现的接口
    @Test
    public void test2(){
        Class clazz = Person.class;
        for (Class clazzInterface : clazz.getInterfaces()) {
            System.out.println(clazzInterface);
        }

    }
    //3. 获取运行时类所在的包
    @Test
    public void test3(){
        Class clazz = Person.class;
        Package aPackage = clazz.getPackage();
        System.out.println(aPackage);
    }
    //4. 获取运行时类的带泛型的父类
    @Test
    public void test4(){
        Class clazz = Person.class;
        Type genericSuperclass = clazz.getGenericSuperclass();
        System.out.println(genericSuperclass);
    }

    //5. 获取运行时类的父类的泛型 (难)
    @Test
    public void test5(){
        Class clazz = Person.class;
        Type genericSuperclass = clazz.getGenericSuperclass();
        System.out.println(genericSuperclass);

        ParameterizedType pt = (ParameterizedType) genericSuperclass;
        for (Type actualTypeArgument : pt.getActualTypeArguments()) {
            System.out.println(actualTypeArgument.getTypeName());
        }

    }

    //6. 获取内部类或外部类信息
    @Test
    public void test6(){
        /**
         * public Class<?>[] getDeclaredClasses()：
         * 返回 Class 对象的一个数组，这些对象反映声明为此 Class 对象所表示的类的成员的所有类和接口。
         * 包括该类所声明的公共、保护、默认（包）访问及私有类和接口，但不包括继承的类和接口。
         *
         * public Class<?> getDeclaringClass()：
         * 如果此 Class 对象所表示的类或接口是一个内部类或内部接口，
         * 则返回它的外部类或外部接口，否则返回null。
         */
        Class<?> clazz = Map.class;
        Class<?>[] inners = clazz.getDeclaredClasses();
        for (Class<?> inner : inners) {
            System.out.println(inner);
        }

        Class<?> ec = Map.Entry.class;
        Class<?> outer = ec.getDeclaringClass();
        System.out.println(outer);
    }

}
