package com.atguigu06.project.team.domain;

/**
 * ClassName: PC
 * Package: com.atguigu06.project.team.domain
 * Description:
 *
 * @Author pluinyiasnhg
 * @Create 2026/1/5 09:32
 * @Version 1.0
 */
public class PC implements Equipment {
    private String model; // 机器的型号
    private String display; // 显示器的名称

    public PC() {
    }

    public PC(String model, String display) {
        this.model = model;
        this.display = display;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    /**
     * 在菜单的“领用设备”一列，显示PC的信息
     * @return 返回PC的信息，形如 戴尔(NEC17寸)
     */
    @Override
    public String getDescription() {
        return model + "(" + display + ")";
    }
}
