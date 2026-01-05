package com.atguigu06.project.team.domain;

/**
 * ClassName: Printer
 * Package: com.atguigu06.project.team.domain
 * Description:
 *
 * @Author pluinyiasnhg
 * @Create 2026/1/5 09:32
 * @Version 1.0
 */
public class Printer implements Equipment {
    private String name;
    private String type; // 机器的类型

    public Printer() {
    }

    public Printer(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**
     * 在菜单的“领用设备”一列，显示Printer的信息
     * @return 返回Printer的信息，形如 佳能 2900(激光)
     */
    @Override
    public String getDescription() {
        return name + "(" + type + ")";
    }
}
