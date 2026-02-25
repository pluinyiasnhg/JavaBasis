package com.atguigu06.collections.exer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * ClassName: PokerTest
 * Package: com.atguigu06.collections.exer
 * Description:
 * 模拟斗地主洗牌和发牌，牌没有排序
 * 提示：不要忘了大王、小王
 * String[] num = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
 * String[] color = {"方片♦","梅花♣","红桃♥","黑桃♠"};
 * ArrayList poker = new ArrayList();
 * @Author pluinyiasnhg
 * @Create 2026/2/25 10:48
 * @Version 1.0
 */
public class PokerTest {
    public static void main(String[] args) {
        String[] nums = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        String[] colors = {"方片","梅花","红桃","黑桃"};

        ArrayList<String> poker = new ArrayList<>();
        for (String color : colors)
            for (String num : nums)
                poker.add(color.concat(num));
        poker.add("小王");
        poker.add("大王");
//        System.out.println(poker);

        // 洗牌
        Collections.shuffle(poker);

        // 发牌
        ArrayList<String> tomPoker = new ArrayList<>();
        ArrayList<String> jerryPoker = new ArrayList<>();
        ArrayList<String> mePoker = new ArrayList<>();
        ArrayList<String> lastPoker = new ArrayList<>();
        for (int i = 0; i < poker.size(); i++) {
            if (i >= poker.size() - 3)
                lastPoker.add(poker.get(i));
            else if (i % 3 == 0)
                tomPoker.add(poker.get(i));
            else if (i % 3 == 1)
                jerryPoker.add(poker.get(i));
            else
                mePoker.add(poker.get(i));
        }

        System.out.println("Tom:\n" + tomPoker);
        System.out.println("Jerry:\n" + jerryPoker);
        System.out.println("me:\n" + mePoker);
        System.out.println("底牌:\n" + lastPoker);
    }
}
