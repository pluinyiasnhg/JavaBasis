package com.atguigu06.otherstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ClassName: Logger
 * Package: com.atguigu06.otherstream
 * Description:
 * 代码举例3：
 * 自定义一个日志工具
 * @Author pluinyiasnhg
 * @Create 2026/3/9 18:25
 * @Version 1.0
 */
public class Logger {
    /*
    记录日志的方法。
     */
    public static void log(String msg) {
        try {
            // 指向一个日志文件
            PrintStream out = new PrintStream(new FileOutputStream("log.txt", true));
            // 改变输出方向
            System.setOut(out);

            // 日期当前时间
            Date nowTime = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
            String strTime = sdf.format(nowTime);

            System.out.println(strTime + ": " + msg);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}