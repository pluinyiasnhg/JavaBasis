/**
 * Math 类的 random()的调用，会返回一个[0,1)范围的一个 double 型值
 * 如何获取[a,b]范围内的随机整数呢？
 * (int)(Math.random() * (b - a + 1))+a
 */
class MathRandomTest {
    public static void main(String[] args) {
        double value = Math.random();
        System.out.println(value);
        int number = (int)(Math.random() * 6) + 1; // [1,6]
        System.out.println(number);
    }
}
