package com.atguigu01.file.exer3;

import java.io.File;

/**
 * ClassName: Exer03
 * Package: com.atguigu01.file.exer3
 * Description:
 * 练习：
 * 遍历指定文件目录下的所有文件的名称，包括子文件目录中的文件。
 * public void printFileName(File file)  //file可能是文件，也可能是文件目录
 * @Author pluinyiasnhg
 * @Create 2026/3/8 18:48
 * @Version 1.0
 */
public class Exer03 {
    public void printFileName(File file) {
        if (file.isFile()) {
            System.out.println(file.getName());
        }
        else {
            for (File listFile : file.listFiles()) {
                printFileName(listFile);
            }

        }
    }

    public static void main(String[] args) {
        File file = new File("/home/liyang/Pictures");
        new Exer03().printFileName(file);
    }
}
