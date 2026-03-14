package com.atguigu04.other.annotation;

/**
 * ClassName: Student
 * Package: com.atguigu04.other.annotation
 * Description:
 *
 * @Author pluinyiasnhg
 * @Create 2026/3/13 22:51
 * @Version 1.0
 */
@Table("t_stu")
public class Student {
    @Column(columnName = "sid",columnType = "int")
    private int id;
    @Column(columnName = "sname",columnType = "varchar(20)")
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}