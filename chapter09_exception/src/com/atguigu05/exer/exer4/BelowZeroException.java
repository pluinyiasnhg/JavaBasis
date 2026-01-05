package com.atguigu05.exer.exer4;

/**
 * ClassName: BelowZeroException
 * Package: com.atguigu05.exer.exer4
 * Description:
 *
 * @Author pluinyiasnhg
 * @Create 2026/1/5 08:41
 * @Version 1.0
 */
public class BelowZeroException extends RuntimeException {
    static final long serialVersionUID = -70348971907457939L;

    public BelowZeroException() {
    }

    public BelowZeroException(String message) {
        super(message);
    }
}
