package com.atguigu04.other.annotation;

import java.lang.annotation.*;

/**
 * ClassName: Column
 * Package: com.atguigu04.other.annotation
 * Description:
 *
 * @Author pluinyiasnhg
 * @Create 2026/3/13 22:48
 * @Version 1.0
 */
@Inherited
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Column {
    String columnName();
    String columnType();
}