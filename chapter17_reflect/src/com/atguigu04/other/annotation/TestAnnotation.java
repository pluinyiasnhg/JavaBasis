package com.atguigu04.other.annotation;

import java.lang.reflect.Field;

/**
 * ClassName: TestAnnotation
 * Package: com.atguigu04.other.annotation
 * Description:
 *
 * @Author pluinyiasnhg
 * @Create 2026/3/13 22:52
 * @Version 1.0
 */
public class TestAnnotation {
    public static void main(String[] args) {
        Class studentClass = Student.class;

        Table tableAnnotation = (Table) studentClass.getAnnotation(Table.class);

        String tableName = "";
        if(tableAnnotation != null){
            tableName = tableAnnotation.value();
        }

        Field[] declaredFields = studentClass.getDeclaredFields();
        String[] columns = new String[declaredFields.length];
        int index = 0;
        for (Field declaredField : declaredFields) {
            Column column = declaredField.getAnnotation(Column.class);
            if(column!= null) {
                columns[index++] = column.columnName();
            }
        }

        String sql = "select ";
        for (int i=0; i<index; i++) {
            sql += columns[i];
            if(i<index-1){
                sql += ",";
            }
        }
        sql += " from " + tableName;
        System.out.println("sql = " + sql);
    }


}