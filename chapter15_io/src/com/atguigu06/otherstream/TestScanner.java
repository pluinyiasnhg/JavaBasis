package com.atguigu06.otherstream;

import org.junit.Test;

import java.io.*;
import java.util.Scanner;

/**
 * ClassName: TestScanner
 * Package: com.atguigu06.otherstream
 * Description:
 *
 * @Author pluinyiasnhg
 * @Create 2026/3/9 18:30
 * @Version 1.0
 */
public class TestScanner {
    @Test
    public void test01() throws IOException {
        Scanner input = new Scanner(System.in);
        PrintStream ps = new PrintStream("1.txt");

        while(true){
            System.out.print("请输入一个单词：");
            String str = input.nextLine();
            if("stop".equals(str)){
                break;
            }
            ps.println(str);
        }

        input.close();
        ps.close();
    }

    @Test
    public void test2() throws IOException {
        Scanner input = new Scanner(new FileInputStream("1.txt"));
        while(input.hasNextLine()){
            String str = input.nextLine();
            System.out.println(str);
        }
        input.close();
    }
}