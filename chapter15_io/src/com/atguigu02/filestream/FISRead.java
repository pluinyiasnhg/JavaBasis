package com.atguigu02.filestream;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * ClassName: FISRead
 * Package: com.atguigu02.filestream
 * Description:
 *
 * @Author pluinyiasnhg
 * @Create 2026/3/8 20:31
 * @Version 1.0
 */
public class FISRead {
    //注意：应该使用try-catch-finally处理异常。这里出于方便阅读代码，使用了throws的方式
    @Test
    public void test() throws IOException {
        // 使用文件名称创建流对象
        FileInputStream fis = new FileInputStream("hello.txt");

        // 读取数据，返回一个字节
        int read = fis.read();
        System.out.println((char) read);
        read = fis.read();
        System.out.println((char) read);
        read = fis.read();
        System.out.println((char) read);
        read = fis.read();
        System.out.println((char) read);
        read = fis.read();
        System.out.println((char) read);
        // 读取到末尾,返回-1
        read = fis.read();
        System.out.println(read);

        // 关闭资源
        fis.close();
    }

    @Test
    public void test02() throws IOException{
        // 使用文件名称创建流对象
        FileInputStream fis = new FileInputStream("hello.txt");

        // 定义变量，保存数据
        int b;
        // 循环读取
        while ((b = fis.read())!=-1) {
            System.out.println((char)b);
        }

        // 关闭资源
        fis.close();
    }

    @Test
    public void test03()throws IOException{
        // 使用文件名称创建流对象.
        FileInputStream fis = new FileInputStream("hello.txt");

        // 定义变量，作为有效个数
        int len;
        // 定义字节数组，作为装字节数据的容器
        byte[] b = new byte[2];
        // 循环读取
        while ((len = fis.read(b))!=-1) {
            // 每次读取后,把数组变成字符串打印
            System.out.println(new String(b));
        }

        // 关闭资源
        fis.close();
    }

    @Test
    public void test04() throws IOException{
        // 使用文件名称创建流对象.
        FileInputStream fis = new FileInputStream("hello.txt");

        // 定义变量，作为有效个数
        int len;
        // 定义字节数组，作为装字节数据的容器
        byte[] b = new byte[2];
        // 循环读取
        while ((len= fis.read(b))!=-1) {
            // 每次读取后,把数组的有效字节部分，变成字符串打印
            System.out.println(new String(b,0,len));//  len 每次读取的有效字节个数
        }

        // 关闭资源
        fis.close();
    }
}
