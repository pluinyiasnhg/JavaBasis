package com.atguigu05.objectstream;

import org.junit.Test;

import java.io.*;

/**
 * ClassName: ReadWriteObject
 * Package: com.atguigu05.objectstream
 * Description:
 *
 * @Author pluinyiasnhg
 * @Create 2026/3/9 15:24
 * @Version 1.0
 */

public class ReadWriteObject {
    @Test
    public void save() throws IOException {
        Employee.setCompany("尚硅谷");
        Employee e = new Employee("小谷姐姐", "宏福苑", 23);

        // 创建序列化流对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employee.dat"));
        // 写出对象
        oos.writeObject(e);
        // 释放资源
        oos.close();

        System.out.println("Serialized data is saved"); // 姓名，地址被序列化，年龄没有被序列化。
    }

    @Test
    public void reload() throws IOException, ClassNotFoundException {
        // 创建反序列化流
        FileInputStream fis = new FileInputStream("employee.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);

        // 读取一个对象
        Employee e = (Employee) ois.readObject();

        // 释放资源
        ois.close();
        fis.close();

        System.out.println(e);
    }
}