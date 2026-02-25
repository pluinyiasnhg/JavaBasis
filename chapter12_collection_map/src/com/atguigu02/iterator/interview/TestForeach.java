package com.atguigu02.iterator.interview;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
/**
 * ClassName: TestForeach
 * Package: com.atguigu02.iterator.interview
 * Description:
 *
 * @Author pluinyiasnhg
 * @Create 2026/2/17 10:20
 * @Version 1.0
 */
public class TestForeach {
    @Test
    public void test01(){
        Collection coll = new ArrayList();
        coll.add("小李广");
        coll.add("扫地僧");
        coll.add("石破天");
        //foreach循环其实就是使用Iterator迭代器来完成元素的遍历的。
        for (Object o : coll) {
            System.out.println(o);
        }
    }

    @Test
    public void test02(){
        int[] nums = {1,2,3,4,5};
        for (int num : nums) {
            System.out.println(num);
        }
        System.out.println("-----------------");
        String[] names = {"张三","李四","王五"};
        for (String name : names) {
            System.out.println(name);
        }
    }

    /**
     * 练习：判断输出结果为何？
     */
    @Test
    public void test03() {
        String[] str = new String[5];
        for (String myStr : str) {
            myStr = "atguigu";
            System.out.println(myStr);
        }
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
    }

}
