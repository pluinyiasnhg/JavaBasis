package com.atguigu01.file;

import java.io.File;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

/**
 * ClassName: FileInfoMethod
 * Package: com.atguigu01.file
 * Description:
 *
 * @Author pluinyiasnhg
 * @Create 2026/3/8 16:14
 * @Version 1.0
 */

public class FileInfoMethod {
    public static void main(String[] args) {
        File f = new File("/home/liyang/Documents/drawio/Skip-Gram.drawio");
        System.out.println("文件构造路径:"+f.getPath());
        System.out.println("文件名称:"+f.getName());
        System.out.println("文件长度:"+f.length()+"字节");
        System.out.println("文件最后修改时间：" + LocalDateTime.ofInstant(Instant.ofEpochMilli(f.lastModified()),ZoneId.of("Asia/Shanghai")));

        System.out.println();

        File f2 = new File("/home/liyang/Documents/drawio");
        System.out.println("目录构造路径:"+f2.getPath());
        System.out.println("目录名称:"+f2.getName());
        System.out.println("目录长度:"+f2.length()+"字节");
        System.out.println("文件最后修改时间：" + LocalDateTime.ofInstant(Instant.ofEpochMilli(f.lastModified()),ZoneId.of("Asia/Shanghai")));
    }
}