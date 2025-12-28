package com.atguigu05.method_more._02args.exer;

/**
 * ClassName: StringConcatTest
 * Package: com.atguigu05.method_more._02args.exer
 * Description:
 * 练习：可变形参的方法
 * n个字符串进行拼接，每一个字符串之间使用某字符进行分割，如果没有传入字符串，那么返回空字符串""
 * @Author pluinyiasnhg
 * @Create 2025/12/25 12:07
 * @Version 1.0
 */
public class StringConcatTest {
    public static void main(String[] args) {
        StringConcatTest test = new StringConcatTest();
        System.out.println(test.concat(' ', "Hello", "World"));
        System.out.println(test.concat('/', "Hello"));
        System.out.println(test.concat('/'));
    }

    public String concat(char c, String ... strs) {
//        if (strs == null)
//            return "";

        String result = "";
        for (int i = 0; i < strs.length; i++) {
            if (i == 0)
                result += strs[i];
            else
                result += (c + strs[i]);
        }

        return  result;
    }
}
