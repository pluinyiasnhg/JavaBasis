package com.atguigu01._this.exer2;

/**
 * ClassName: Bank
 * Package: com.atguigu01._this.exer2
 * Description:
 * 3、按照UML类图，创建Bank类，提供必要的结构。
 * - addCustomer 方法必须依照参数（姓，名）构造一个新的 Customer对象，然后把它放到 customer 数组中。
 *   还必须把 numberOfCustomer 属性的值加 1。
 * - getNumOfCustomers 方法返回 numberofCustomers 属性值。
 * - getCustomer方法返回与给出的index参数相关的客户。
 * @Author pluinyiasnhg
 * @Create 2025/12/26 20:20
 * @Version 1.0
 */
public class Bank {
    private Customer[] customers;
    private int numberOfCustomer;

    public Bank() {
        customers = new Customer[10];
    }

    public void addCustomer(String f, String l) {
        customers[numberOfCustomer++] = new Customer(f, l);
    }

    public int getNumberOfCustomer() {
        return numberOfCustomer;
    }

    public Customer getCustomer(int index) {
        if (index <  0 || index >= numberOfCustomer)
            return null;
        return customers[index];
    }
}
