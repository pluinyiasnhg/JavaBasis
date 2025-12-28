package com.atguigu05.method_more;

/**
 * ClassName: TransferTest3
 * Package: com.atguigu05.method_more
 * Description:
 * 来自文档。
 * @Author pluinyiasnhg
 * @Create 2025/12/25 15:42
 * @Version 1.0
 */
public class TransferTest3 {
    public static void main(String args[]) {
        TransferTest3 test = new TransferTest3();
        test.first();
    }
    public void first() {
        int i = 5;
        Value v = new Value();
        v.i = 25;
        second(v, i);
        System.out.println(v.i);
    }
    public void second(Value v, int i) {
        i = 0;
        v.i = 20;
        Value val = new Value();
        v = val;
        System.out.println(v.i + " " + i);
    }
}
class Value {
    int i = 15;
}