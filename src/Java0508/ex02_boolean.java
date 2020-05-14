/*
 Date : 20.05.08
 Author : JasonYu
 Description : ex02_boolean
 Version : 1.0
 */
package Java0508;

public class ex02_boolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 논리형
		// boolean (yes or no)
		// 맞다 아니다 를 판단해준다.

		int num1, num2;
		num1 = 1;
		num2 = 2;

		boolean bool1 = true;
		// System.out.println(bool1);

		boolean bool2 = false;
		// System.out.println(bool2);

		boolean bool3;
		// num1 = 1 , num2 = 2
		if (num1 > num2) { // 만약 num1이 num2보다 크다면
			bool3 = false; // false를 출력해라
		} else { // 그렇지않다면(num1이 num2보다 작다면
			bool3 = true; // true를 출력해라
		}
		System.out.println(bool3);
	}

}
