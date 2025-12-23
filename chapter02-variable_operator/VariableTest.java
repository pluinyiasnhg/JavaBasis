/*
测试整型和浮点型变量的使用
*/
class VariableTest1 {
    public static void main(String[] args) {
        //测试浮点型变量的精度
        //结论：通过测试发现浮点型变量的精度不高。如果在开发中，需要极高的精度，需要使用BigDecimal类替换浮点型变量。
        //测试1
        System.out.println(0.1 + 0.2);

        //测试2:
        float ff1 = 123123123f; // 0.30000000000000004
        float ff2 = ff1 + 1;
        System.out.println(ff1); // 1.2312312E8
        System.out.println(ff2); // 1.2312312E8
        System.out.println(ff1 == ff2); // true
    }
}