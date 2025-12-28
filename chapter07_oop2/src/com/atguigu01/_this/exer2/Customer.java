package com.atguigu01._this.exer2;

/**
 * ClassName: Customer
 * Package: com.atguigu01._this.exer2
 * Description:
 * 2、按照UML类图，创建Customer类，提供必要的结构。
 * @Author pluinyiasnhg
 * @Create 2025/12/26 20:24
 * @Version 1.0
 */
public class Customer {
    private String firstName;
    private String lastName;
    private Account account;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
