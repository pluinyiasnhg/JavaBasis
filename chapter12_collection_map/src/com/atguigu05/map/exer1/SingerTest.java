package com.atguigu05.map.exer1;

import java.util.*;

/**
 * ClassName: SingerTest
 * Package: com.atguigu05.map.exer1
 * Description:
 * 添加你喜欢的歌手以及你喜欢他唱过的歌曲,并遍历
 * @Author pluinyiasnhg
 * @Create 2026/2/19 00:20
 * @Version 1.0
 */
public class SingerTest {
    public static void main(String[] args) {
        HashMap map = new HashMap();

        String singer1 = "周杰伦";
        ArrayList songs1 = new ArrayList();
        songs1.add("双节棍");
        songs1.add("本草纲目");
        songs1.add("夜曲");
        songs1.add("稻香");
        map.put(singer1, songs1);

        String singer2 = "陈奕迅";
        ArrayList songs2 = new ArrayList();
        songs2.add("浮夸");
        songs2.add("十年");
        songs2.add("红玫瑰");
        songs2.add("好久不见");
        songs2.add("孤勇者");
        map.put(singer2, songs2);

        Set entrySet = map.entrySet();
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println("歌手：" + entry.getKey());
            System.out.println("歌曲有：" + entry.getValue());
        }

    }
}
