package com.atguigu02.filestream.exer1;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ClassName: Exer01
 * Package: com.atguigu02.filestream.exer1
 * Description:
 * 实现图片加密操作。
 * 提示：
 * int b = 0;
 * while((b = fis.read()) != -1){
 *     fos.write(b ^ 5);
 * }
 * @Author pluinyiasnhg
 * @Create 2026/3/8 20:13
 * @Version 1.0
 */
public class Exer01 {
    @Test
    public void test01() {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream("头像.jpg");
            fos = new FileOutputStream("头像1.jpg");

            int b = 0;
            while((b = fis.read()) != -1){
                fos.write(b ^ 5);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fos != null)
                    fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                if (fis != null)
                    fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}
