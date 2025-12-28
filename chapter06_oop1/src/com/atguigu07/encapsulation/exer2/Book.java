package com.atguigu07.encapsulation.exer2;

/**
 * ClassName: Book
 * Package: com.atguigu07.encapsulation.exer2
 * Description:
 * 案例：自定义图书类
 *
 * 设定属性包括：
 * 书名bookName，
 * 作者author，
 * 价格price；
 *
 * 方法包括：
 * 相应属性的get/set方法，
 * 图书信息介绍等。
 * @Author pluinyiasnhg
 * @Create 2025/12/25 16:20
 * @Version 1.0
 */
public class Book {
    public static void main(String[] args) {
        Book book = new Book();
        book.setBookName("CSAPP");
        book.setAuthor("Randal Bryant和David O'Hallaron");
        book.setPrice(100.0);

        book.printInfo();
    }

    private String bookName;
    private String author;
    private double price;

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void printInfo() {
        System.out.println("书名：" + bookName + " 作者：" + author + " 价格：" + price);
    }
}
