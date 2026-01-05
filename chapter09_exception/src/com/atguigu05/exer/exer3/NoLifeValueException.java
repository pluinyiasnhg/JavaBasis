package com.atguigu05.exer.exer3;

/**
 * ClassName: NoLifeValueException
 * Package: com.atguigu05.exer.exer3
 * Description:
 * （1）自定义异常类NoLifeValueException继承RuntimeException
 * ①提供空参和有参构造
 * ②在有参构造中，需要调用父类的有参构造，把异常信息传入
 * @Author pluinyiasnhg
 * @Create 2026/1/5 08:25
 * @Version 1.0
 */
public class NoLifeValueException extends RuntimeException {
    static final long serialVersionUID = -70348971907457669L;

    public NoLifeValueException() {
    }

    public NoLifeValueException(String message) {
        super(message);
    }
}
