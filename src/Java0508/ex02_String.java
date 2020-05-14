
/*
	Date : 20.05.08
	Author : JasonYu
	Description : ex2_String
	Version : 1.0
*/

package Java0508;

public class ex02_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "자바공부는 ";
		String str2 = "재미없어";
		String str3 = "너무 어려워";

		String rsl; // 변수선언
		rsl = str1 + str2; // 변수초기화
		System.out.println(rsl);// 변수출력

		rsl = str1 + str3;
		System.out.println(rsl);

		rsl = str1 + 8.0;
		System.out.println(rsl);
		System.out.println(str1 + str2);
		System.out.println(str1 + "너무" + str2);
	}

}
