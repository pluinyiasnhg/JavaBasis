package com.atguigu04.block.exer;

/**
 * ClassName: User
 * Package: com.atguigu04.block.exer
 * Description:
 * （1）声明User类，
 * - 包含属性：userName（String类型），password（String类型），registrationTime（long类型），私有化
 * - 包含get/set方法，其中registrationTime没有set方法
 * - 包含无参构造，
 *   - 输出“新用户注册”，
 *   - registrationTime赋值为当前系统时间，
 *   - userName就默认为当前系统时间值，
 *   - password默认为“123456”
 * - 包含有参构造(String userName, String password)，
 *   - 输出“新用户注册”，
 *   - registrationTime赋值为当前系统时间，
 *   - username和password由参数赋值
 * - 包含public String getInfo()方法，返回：“用户名：xx，密码：xx，注册时间：xx”
 * @Author pluinyiasnhg
 * @Create 2026/1/1 15:44
 * @Version 1.0
 */
public class User {
    private String userName;
    private String password;
    private long registrationTime;

    {
        System.out.println("新用户注册");
        registrationTime = System.currentTimeMillis();
    }

    public User() {
        userName = System.currentTimeMillis() + "";
        password = "123456";
    }

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getRegistrationTime() {
        return registrationTime;
    }

    public String getInfo() {
        return "用户名：" + userName + "，密码：" + password + "，注册时间：" + registrationTime;
    }
}
