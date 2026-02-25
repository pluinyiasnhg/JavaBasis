package com.atguigu02.iterator.interview;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
/**
 * ClassName: TestIteratorRemove
 * Package: com.atguigu02.iterator.interview
 * Description:
 * 要删除以下集合元素中的偶数
 * @Author pluinyiasnhg
 * @Create 2026/2/17 10:14
 * @Version 1.0
 */
public class TestIteratorRemove {
    @Test
    public void test01(){
        Collection coll = new ArrayList();
        coll.add(1);
        coll.add(2);
        coll.add(3);
        coll.add(4);
        coll.add(5);
        coll.add(6);

        Iterator iterator = coll.iterator();
        while(iterator.hasNext()){
            Integer element = (Integer) iterator.next();
            if(element % 2 == 0){
                iterator.remove();
            }
        }
        System.out.println(coll);
    }
}
