package com.atguigu02.selfdefine.exer3;

/**
 * ClassName: Student
 * Package: com.atguigu02.selfdefine.exer3
 * Description:
 * 声明一个学生类，该类包含姓名、成绩。而此时学生的成绩类型不确定
 * @Author pluinyiasnhg
 * @Create 2026/3/6 10:44
 * @Version 1.0
 */
public class Student<T> {
    private String name;
    private T score;

    public Student() {
    }

    public Student(String name, T score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getScore() {
        return score;
    }

    public void setScore(T score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name=" + name +
                ", score=" + score +
                '}';
    }
}
