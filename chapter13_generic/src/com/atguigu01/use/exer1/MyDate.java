package com.atguigu01.use.exer1;

/**
 * ClassName: MyDate
 * Package: com.atguigu01.use.exer1
 * Description:
 * 2. MyDate类包含:
 *    private成员变量year,month,day；并为每一个属性定义 getter, setter 方法；
 * @Author pluinyiasnhg
 * @Create 2026/2/27 10:17
 * @Version 1.0
 */
public class MyDate implements Comparable<MyDate> {
    private int year;
    private int month;
    private int day;

    public MyDate() {
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return year + "/" + month + "/" + day;
    }

    @Override
    public int compareTo(MyDate o) {
        int result = year - o.getYear();
        if (result != 0)
            return result;

        result = month - o.getMonth();
        return result != 0 ? result : day - o.getDay();
    }
}
