/**
 * 7.4 逻辑运算符
 * 代码举例
 */
public class LoginTest {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 5;

        // & 与，且；有false则false
        System.out.println((a > b) & (a > c)); // false
        System.out.println((a > b) & (a < c)); // false
        System.out.println((a < b) & (a > c)); // false
        System.out.println((a < b) & (a < c)); // true
        System.out.println("===============");
        // | 或；有true则true
        System.out.println((a > b) | (a > c)); // false
        System.out.println((a > b) | (a < c)); // true
        System.out.println((a < b) | (a > c)); // true
        System.out.println((a < b) | (a < c)); // true
        System.out.println("===============");
        // ^ 异或；相同为false，不同为true System.out.println((a > b) ^ (a > c));
        System.out.println((a > b) ^ (a < c)); // true
        System.out.println((a < b) ^ (a > c)); // true
        System.out.println((a < b) ^ (a < c)); // false
        System.out.println("===============");
        // ! 非；非false则true，非true则false
        System.out.println(!false);            // true
        System.out.println(!true);             // false

        //&和&&的区别
        System.out.println((a > b) & (a++ > c));  // false
        System.out.println("a = " + a);           // a = 4
        System.out.println((a > b) && (a++ > c)); // false
        System.out.println("a = " + a);           // a = 4
        System.out.println((a == b) && (a++ > c));// false
        System.out.println("a = " + a);           // a = 5

        //|和||的区别
        System.out.println((a > b) | (a++ > c));  // true
        System.out.println("a = " + a);           // a = 6
        System.out.println((a > b) || (a++ > c)); // true
        System.out.println("a = " + a);           // a = 6
        System.out.println((a == b) || (a++ > c));// true
        System.out.println("a = " + a);           // a = 7
    }
}