package com.atguigu04.set.exer1;

import sun.nio.cs.ext.IBM037;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * ClassName: Exer01
 * Package: com.atguigu04.set.exer1
 * Description:
 * 案例：
 * 定义方法如下：public static List duplicateList(List list)
 * 要求：① 参数List中只存放Integer的对象
 *      ② 在List内去除重复数字值，尽量简单
 * @Author pluinyiasnhg
 * @Create 2026/2/17 15:34
 * @Version 1.0
 */
public class Exer01 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Integer(1));
        list.add(new Integer(2));
        list.add(new Integer(2));
        list.add(new Integer(3));
        list.add(new Integer(3));

        List newList = duplicateList(list);
        for (Object integer : newList) {
            System.out.println(integer);
        }
    }

    public static List duplicateList(List list) {
        HashSet set = new HashSet(list);
        return new ArrayList(set);
    }
}
