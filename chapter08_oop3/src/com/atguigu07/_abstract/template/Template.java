package com.atguigu07._abstract.template;

/**
 * ClassName: Template
 * Package: com.atguigu07._abstract.template
 * Description:
 * 模板方法设计模式——举例1
 * @Author pluinyiasnhg
 * @Create 2026/1/2 16:38
 * @Version 1.0
 */
public abstract class Template {
    public static void main(String[] args) {
        SubTemplate test = new SubTemplate();
        test.getTime();
    }

    public final void getTime() {
        long start = System.currentTimeMillis();
        code();
        long end = System.currentTimeMillis();
        System.out.println("执行时间是：" + (end - start) + "ms");
    }

    public abstract void code();
}

class SubTemplate extends Template {
    public void code() {
        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
        }
    }
}