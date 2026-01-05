package com.atguigu04._throw;

/**
* ClassName: BelowZeroException
* Package: com.atguigu04._throw
* Description:
* @Author pluinyiasnhg
* @Create 2026/1/5 08:14
* @Version 1.0
*/
public class BelowZeroException extends RuntimeException {
    static final long serialVersionUID = -70348971907456939L;

    public BelowZeroException() {
    }

    public BelowZeroException(String message) {
        super(message);
    }

    public BelowZeroException(String message, Throwable cause) {
        super(message, cause);
    }
}
