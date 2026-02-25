package com.atguigu03.list.exer2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

/**
 * ClassName: ListTest
 * Package: com.atguigu03.list.exer2
 * Description:
 * 案例：
 * 定义方法public static int listTest(Collection list,String s)统计集合中指定元素出现的次数
 * (1) 创建集合，集合存放随机生成的30个小写字母
 * (2) 用listTest统计，a、b、c、x元素的出现次数
 * @Author pluinyiasnhg
 * @Create 2026/2/17 14:21
 * @Version 1.0
 */
public class ListTest {
    public static void main(String[] args) {
        Collection coll = new ArrayList();
        Random random = new Random();

        for (int i = 0; i < 30; i++) {
            coll.add((char)(random.nextInt(26) + 97) + "");
        }

        System.out.println(coll);

        System.out.println("a:" + listTest(coll, "a"));
        System.out.println("b:" + listTest(coll, "b"));
        System.out.println("c:" + listTest(coll, "c"));
        System.out.println("x:" + listTest(coll, "x"));
    }

    public static int listTest(Collection list, String s) {
        int count = 0;
        for (Object obj : list) {
            if (s.equals(obj)) {
                count++;
            }
        }

        return count;
    }
}
