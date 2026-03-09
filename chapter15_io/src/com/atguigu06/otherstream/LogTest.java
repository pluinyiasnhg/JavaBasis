package com.atguigu06.otherstream;

import org.junit.Test;

/**
 * ClassName: LogTest
 * Package: com.atguigu06.otherstream
 * Description:
 *
 * @Author pluinyiasnhg
 * @Create 2026/3/9 18:26
 * @Version 1.0
 */
public class LogTest {
    @Test
    public void test01() {
        //测试工具类是否好用
        Logger.log("调用了System类的gc()方法，建议启动垃圾回收");
        Logger.log("调用了TeamView的addMember()方法");
        Logger.log("用户尝试进行登录，验证失败");
    }

}