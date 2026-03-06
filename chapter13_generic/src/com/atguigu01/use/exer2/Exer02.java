package com.atguigu01.use.exer2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Predicate;

/**
 * ClassName: Exer02
 * Package: com.atguigu01.use.exer2
 * Description:
 * （1）创建一个ArrayList集合对象，并指定泛型为<Integer>
 * （2）添加5个[0,100)以内的随机整数到集合中
 * （3）使用foreach遍历输出5个整数
 * （4）使用集合的removeIf方法删除偶数，为Predicate接口指定泛型<Ineteger>
 * （5）再使用Iterator迭代器输出剩下的元素，为Iterator接口指定泛型<Integer>
 * @Author pluinyiasnhg
 * @Create 2026/2/28 17:24
 * @Version 1.0
 */
public class Exer02 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int randomNum = (int) (Math.random() * 100);
            list.add(randomNum);
        }

        for (Integer num : list) {
            System.out.println(num);
        }

        //（4）使用集合的removeIf方法删除偶数，为Predicate接口指定泛型<Ineteger>
        list.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer num) {
                return num % 2 == 0;
            }
        });

        //（5）再使用Iterator迭代器输出剩下的元素，为Iterator接口指定泛型<Integer>
        System.out.println("筛选后：");
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
