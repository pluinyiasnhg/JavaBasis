package com.atguigu04.other.annotation;

import java.lang.annotation.*;

/**
 * ClassName: Table
 * Package: com.atguigu04.other.annotation
 * Description:
 *
 * @Author pluinyiasnhg
 * @Create 2026/3/13 22:47
 * @Version 1.0
 */
@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Table {
    String value();
}