import java.util.Arrays;

/**
 * 7.3 常用代码模板
 */
class test {
    public static void main(String[] args) {
        int num = 0;

        // ifn: if null
//        if (num == null) {
//
//        }

        // inn: if not null
//        if (num != null) {
//
//        }

        // fori：for 循环
//        for (int i = 0; i < 10; i++) {
//
//        }

        // iter
//        for (String s : num) {
//
//        }

        // sout
        System.out.println();

        // soutm 打印当前类和方法名称
        System.out.println("test.main");

        // soutp 打印当前方法形参和值
        System.out.println("args = " + Arrays.toString(args));

        // soutv 打印方法中声明的最近的变量的值
        System.out.println("num = " + num);

    }
}