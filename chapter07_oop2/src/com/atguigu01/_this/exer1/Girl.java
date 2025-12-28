package com.atguigu01._this.exer1;

/**
 * ClassName: Girl
 * Package: com.atguigu01._this.exer1
 * Description:
 *
 * @Author pluinyiasnhg
 * @Create 2025/12/26 19:59
 * @Version 1.0
 */
public class Girl {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Girl() {}

    public Girl(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void marry(Boy boy) {
        System.out.println(name + "要嫁" + boy.getName());
        boy.marry(this);
    }

    public int compare(Girl girl) {
        if (this.age < girl.age) {
            return -1;
        }
        else if (this.age > girl.age) {
            return 1;
        }
        else
            return 0;
    }
}
