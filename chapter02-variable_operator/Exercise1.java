/**
   4.2.2 应用举例
   案例 1：定义圆周率并赋值为 3.14，现有 3 个圆的半径分别为 1.2、2.5、6，求
它们的面积。
*/
public class Exercise1 {

    public static void main(String[] args) {
	double radius1 = 1.2;
	double radius2 = 2.5;
	int radius3 = 6;
	double PI = 3.14;

	double area1 = PI * radius1 * radius1;
	double area2 = PI * radius2 * radius2;
	double area3 = PI * radius3 * radius3;
	
	System.out.println("第一个圆的半径为" + radius1 + "，面积为" + area1);
	System.out.println("第二个圆的半径为" + radius2 + "，面积为" + area2);
	System.out.println("第三个圆的半径为" + radius3 + "，面积为" + area3);
    }
}
