package com.atguigu04.set.exer2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

/**
 * ClassName: Exer02
 * Package: com.atguigu04.set.exer2
 * Description:
 * 案例：
 * 编写一个程序，获取10个1至20的随机数，要求随机数不能重复。并把最终的随机数输出到控制台。
 * @Author pluinyiasnhg
 * @Create 2026/2/17 15:44
 * @Version 1.0
 */
public class Exer02 {
    public static void main(String[] args) {
        Random random = new Random();
        HashSet hashSet = new HashSet();

        while (hashSet.size() < 10) {
            int num = random.nextInt(20) + 1;
            hashSet.add(num);
        }

//        for (Object integer : hashSet) {
//            System.out.println(integer);
//        }

        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
