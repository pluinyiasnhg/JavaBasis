/**
   案例 2：小明要到美国旅游，可是那里的温度是以华氏度为单位记录的。 它需
要一个程序将华氏温度（80 度）转换为摄氏度，并以华氏度和摄氏度为单位分
别显示该温度。
℃ = (℉ - 32) / 1.8
*/
public class Exercise2 {

    public static void main(String[] args) {
	double hua = 80;
	double she = (hua - 32) / 1.8;

	System.out.println(hua + "°F = " + she + "°C");

    }
}
