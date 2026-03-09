package com.atguigu01.file.exer1;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * ClassName: Exer01
 * Package: com.atguigu01.file.exer1
 * Description:
 * 练习：
 * 创建一个与hello.txt文件在相同文件目录下的另一个名为abc.txt文件
 * @Author pluinyiasnhg
 * @Create 2026/3/8 18:28
 * @Version 1.0
 */
public class Exer01 {
    @Test
    public void test1() throws IOException {
        File file = new File("hello.txt");
        File newFile = new File(file.getAbsoluteFile().getParent(), "abc.txt");

        newFile.createNewFile();
        System.out.println(newFile.getAbsolutePath());
    }
}
