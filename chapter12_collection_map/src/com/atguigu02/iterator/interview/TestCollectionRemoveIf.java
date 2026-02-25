package com.atguigu02.iterator.interview;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;
/**
 * ClassName: TestCollectionRemoveIf
 * Package: com.atguigu02.iterator.interview
 * Description:
 * 在JDK8.0时，Collection接口有了removeIf 方法，即可以根据条件删除。（第18章中再讲）
 * @Author pluinyiasnhg
 * @Create 2026/2/17 10:17
 * @Version 1.0
 */
public class TestCollectionRemoveIf {
    @Test
    public void test01(){
        Collection coll = new ArrayList();
        coll.add("小李广");
        coll.add("扫地僧");
        coll.add("石破天");
        coll.add("佛地魔");
        System.out.println("coll = " + coll);

        coll.removeIf(new Predicate() {
            @Override
            public boolean test(Object o) {
                String str = (String) o;
                return str.contains("地");
            }
        });
        System.out.println("删除包含\"地\"字的元素之后coll = " + coll);
    }
}
