package com.atguigu06.otherstream;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * ClassName: TestPrintStream
 * Package: com.atguigu06.otherstream
 * Description:
 *
 * @Author pluinyiasnhg
 * @Create 2026/3/9 18:19
 * @Version 1.0
 */
public class TestPrintStream {
    @Test
    public void test01() throws FileNotFoundException {
        PrintStream ps = new PrintStream("io.txt");

        ps.println("hello");
        ps.println(1);
        ps.println(1.5);

        ps.close();

        System.out.println("执行完毕");
    }

}
