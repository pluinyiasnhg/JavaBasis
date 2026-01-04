package com.atguigu02.singleton;

/**
 * ClassName: GirlFriendTest
 * Package: com.atguigu02.singleton
 * Description:
 * 懒汉式
 * @Author pluinyiasnhg
 * @Create 2026/1/1 08:40
 * @Version 1.0
 */
public class GirlFriendTest {
    public static void main(String[] args) {
        GirlFriend g1 = GirlFriend.getInstance();
        GirlFriend g2 = GirlFriend.getInstance();

        System.out.println(g1 == g2);
    }
}

class GirlFriend {
    // 1. 私有化构造器
    private GirlFriend() {

    }

    // 2. 内部提供一个当前类的实例
    // 4. 此实例也必须静态化
    private static GirlFriend instance = null;

    // 3. 提供公共的静态的方法，返回当前类的对象
    public static GirlFriend getInstance() {
        if (instance == null)
            instance = new GirlFriend();
        return instance;
    }
}