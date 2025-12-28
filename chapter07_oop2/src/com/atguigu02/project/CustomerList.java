package com.atguigu02.project;

/**
 * ClassName: CustomerList
 * Package: com.atguigu02.project
 * Description:
 * CustomerList为Customer对象的管理模块，内部用数组管理一组Customer对象，
 * 并提供相应的添加、修改、删除和遍历方法，供CustomerView调用
 * @Author pluinyiasnhg
 * @Create 2025/12/27 08:24
 * @Version 1.0
 */
public class CustomerList {
    public static void main(String[] args) {
        CustomerList list = new CustomerList(5);
        list.addCustomer(new Customer("张三", '男', 20, "123456789", "123@qq.com"));
        list.addCustomer(new Customer("李四", '男', 22, "987654321", "456@qq.com"));
        System.out.println("总客户数：" + list.getTotal());
        list.getCustomer(0).getInfo();
        for (int i = 0; i < list.getAllCustomers().length; i++) {
            Customer[] tempCustomers = list.getAllCustomers();
            tempCustomers[i] = new Customer();
            tempCustomers[i].getInfo();
        }
        list.replaceCustomer(1, new Customer());
        list.deleteCustomer(1);

    }

    private Customer[] customers;
    private int total  = 0;

    /**
     * 构造器，用来初始化customers数组
     * @param totalCustomer 指定 customers数组的最大空间
     */
    public CustomerList(int totalCustomer) {
        customers = new Customer[totalCustomer];
    }

    /**
     * 将参数 customer添加组中最后一个客户对象记录之后
     * @param customer customer 指定要添加的客户对象
     * @return 添加成功返回true；false表示数组已满，无法添加
     */
    public boolean addCustomer(Customer customer) {
        if (total >= customers.length) return false;

        customers[total++] = customer;
        return true;
    }

    /**
     * 用参数 customer替换数组中由 index指定的对象
     * @param index 指定替换的新客户对象
     * @param cust 指定所替换对象在数组中的位置，从0开始
     * @return 替换成功返回true；false表示索引无效，无法替换
     */
    public boolean replaceCustomer(int index, Customer cust) {
        if (index < 0 || index >= total) return false;

        customers[index] = cust;
        return true;
    }

    /**
     * 从数组中删除参数 index指定索引位置的客户对象记录
     * @param index index指定所删除对象在数组中的索引位置，从0开始
     * @return 删除成功返回true；false表示索引无效，无法删除
     */
    public boolean deleteCustomer(int index) {
        if (index < 0 || index >= total) return false;

        for (int i = index; i < total - 1; i++) {
            customers[i] = customers[i + 1];
        }

        customers[--total] = null;

        return true;
    }

    /**
     * 返回数组中记录的所有客户对象
     * @return Customer[] 数组中包含了当前所有客户对象，该数组长度与对象个数相同
     */
    public Customer[] getAllCustomers() {
        Customer[] newCustomers = new Customer[total];
        for (int i = 0; i < newCustomers.length; i++) {
            newCustomers[i] = customers[i];
        }
        return newCustomers;
    }

    /**
     * 返回参数 index指定索引位置的客户对象记录
     * @param index index指定所要获取的客户在数组中的索引位置，从0开始
     * @return 封装了客户信息的 Customer对象
     */
    public Customer getCustomer(int index) {
        if (index < 0 || index >= total)
            return null;
        return customers[index];
    }

    public int getTotal() {
        return total;
    }
}
