/**
 * 7.4.2 案例与练习
 * 1. 定义类 CompareLogicExer
 * 2. 定义 main方法
 * 3. 定义一个int类型变量a,变量b,都赋值为20
 * 4. 定义boolean类型变量bo1 , 判断++a 是否被3整除,并且a++ 是否被7整除,将结果赋值给bo1
 * 5. 输出a的值,bo1的值
 * 6. 定义boolean类型变量bo2 , 判断b++ 是否被3整除,并且++b 是否被7整除,将结果赋值给bo2
 * 7. 输出b的值,bo2的值
 */
class CompareLogicExer {
    public static void main(String[] args) {
        int a = 20;
        int b = 20;
        boolean bo1 = (++a % 3 == 0) && (a++ % 7 == 0);
        System.out.println("a = " + a + ", bo1 = " + bo1);  // a = 22, bo1 = true

        boolean bo2 = (b++ % 3 == 0) && (++b % 7 == 0);
        System.out.println("b = " + b + ", bo2 = " + bo2);  // b = 21, bo2 = false

        // 练习1：区分 & 和 &&
        int x = 1;
        int y = 1;

        if(x++ == 2 & ++y == 2){
            x = 7;
        }
        System.out.println("x=" + x + ",y=" + y); // x=2,y=2

        x = 1;
        y = 1;

        if(x++ == 2 && ++y == 2){
            x =7;
        }
        System.out.println("x="+x+",y="+y); // x=2,y=1

        // 练习2:区分 | 和 ||
        x = 1;
        y = 1;

        if(x++==1 | ++y==1){
            x =7;
        }
        System.out.println("x="+x+",y="+y); // x=7,y=2

        x = 1;
        y = 1;

        if(x++==1 || ++y==1){
            x =7;
        }
        System.out.println("x="+x+",y="+y); // x=7,y=1
    }
}



