package com.atguigu01.file.exer2;

import org.junit.Test;

import java.io.File;
import java.io.FilenameFilter;

/**
 * ClassName: Exer02
 * Package: com.atguigu01.file.exer2
 * Description:
 * 练习：
 * 判断指定目录下是否有后缀名为.jpg的文件，如果有，就输出该文件名称
 * 提示：File类提供了文件过滤器方法(拓展)
 * public String[] list(FileFilter filter)
 * @Author pluinyiasnhg
 * @Create 2026/3/8 18:37
 * @Version 1.0
 */
public class Exer02 {
    @Test
    public void test1() {
        File dir = new File("/home/liyang/Pictures");

        for (String filename : dir.list()) {
            if (filename.endsWith(".jpg"))
                System.out.println(filename);
        }
    }

    @Test
    public void test2() {
        File dir = new File("/home/liyang/Pictures");
        String[] listFiles = dir.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".jpg");
            }
        });

        for (String filename : listFiles) {
            System.out.println(filename);
        }
    }


}
