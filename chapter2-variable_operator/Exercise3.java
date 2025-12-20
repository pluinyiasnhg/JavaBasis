/**
   5.3.3 案例与练习
案例：公安局身份登记
要求填写自己的姓名、年龄、性别、体重、婚姻状况（已婚用 true 表示，单身
用 false 表示）、联系方式等等。
*/
public class Exercise3 {

    public static void main(String[] args) {
	String name = "yonglu";
	int age = 10;
	char gender = '男';
	double weight = 130;
	boolean isMarried = false;
	String phoneNumber = "12345678901";

	System.out.println("姓名：" + name + "，年龄：" + age + "，性别：" + gender
			   + "，体重：" + weight + "，婚姻状况：" + isMarried + "，联系方式：" + phoneNumber);

	// 练习1
	// String str1 = 4;            // 判断对错：❌
	String str2 = 3.5f + "";    // 判断对错：✅
	System.out.println(str2);             // Output: 3.5
	System.out.println(3+4+"Hello!");     // Output: 7Hello!
	System.out.println("Hello!"+3+4);     // Output: Hello!34
	System.out.println('a'+1+"Hello!");   // Output: 98Hello!  其中 a = 97，A = 65，0 = 48
	System.out.println("Hello"+'a'+1);    // Output: Helloa1

	// 练习2
	System.out.println("*    *");          // Output: *    *
	System.out.println("*\t*");            // Output: *		*
	System.out.println("*" + "\t" + "*");  // Output: *		*
	System.out.println('*' + "\t" + "*");  // Output: *  	*
	System.out.println('*' + '\t' + "*");  // Output: 51*
	System.out.println('*' + "\t" + '*');  // Output: *		*
	System.out.println("*" + '\t' + '*');  // Output: *   	*
	System.out.println('*' + '\t' + '*');  // Output: 93

    }
}
