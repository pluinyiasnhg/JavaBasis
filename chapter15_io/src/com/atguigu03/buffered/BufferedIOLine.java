package com.atguigu03.buffered;

import org.junit.Test;

import java.io.*;

/**
 * ClassName: BufferedIOLine
 * Package: com.atguigu03.buffered
 * Description:
 *
 * @Author pluinyiasnhg
 * @Create 2026/3/9 13:26
 * @Version 1.0
 */
public class BufferedIOLine {
    @Test
    public void testReadLine() throws IOException {
        // 创建流对象
        BufferedReader br = new BufferedReader(new FileReader("hello.txt"));

        // 定义字符串,保存读取的一行文字
        String line;
        // 循环读取,读取到最后返回null
        while ((line = br.readLine())!=null) {
            System.out.println(line);
        }

        // 释放资源
        br.close();
    }

    @Test
    public void testNewLine()throws IOException{
        // 创建流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("out.txt"));

        // 写出数据
        bw.write("尚");
        // 写出换行
        bw.newLine();
        bw.write("硅");
        bw.newLine();
        bw.write("谷");
        bw.newLine();

        // 释放资源
        bw.close();
    }
}