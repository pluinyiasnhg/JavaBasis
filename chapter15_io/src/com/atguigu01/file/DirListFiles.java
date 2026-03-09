package com.atguigu01.file;

import org.junit.Test;

import java.io.File;

/**
 * ClassName: DirListFiles
 * Package: com.atguigu01.file
 * Description:
 *
 * @Author pluinyiasnhg
 * @Create 2026/3/8 16:22
 * @Version 1.0
 */

public class DirListFiles {
    @Test
    public void test01() {
        File dir = new File("/home/liyang/Documents");
        String[] subs = dir.list();
        for (String sub : subs) {
            System.out.println(sub);
        }
    }

}