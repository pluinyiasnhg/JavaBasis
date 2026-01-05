package com.atguigu05.exer.exer1;

/**
 * ClassName: CompareObject
 * Package: com.atguigu08._interface.exer2
 * Description:
 *
 * @Author pluinyiasnhg
 * @Create 2026/1/3 09:27
 * @Version 1.0
 */
public interface CompareObject{
    //若返回值是 0 , 代表相等; 若为正数，代表当前对象大；负数代表当前对象小
    int compareTo(Object o);
}
