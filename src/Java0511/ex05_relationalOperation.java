/*
 	Date : 20.05.11
 	Author : JasonYu
 	Description : relationalOperation
 	Version : 1.0
 */
package Java0511;

public class ex05_relationalOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 정수형 변수 두개 선언
		int num1 = 7;
		int num2 = 2;
		
		// > , <, >=, <=, ==, != 연산 수행
		boolean rsl;
		rsl = num1 > num2;
		System.out.println("num1 > num2 결과는 " + rsl);
		
		rsl = num1 < num2;
		System.out.println("num1 < num2 결과는 " + rsl);
		
		rsl = num1 >= num2;
		System.out.println("num1 >= num2 결과는 " + rsl);
		
		rsl = num1 <= num2;
		System.out.println("num1 <= num2 결과는 " + rsl);
		
		rsl = num1 == num2;
		System.out.println("num1 == num2 결과는 " + rsl);
		
		rsl = num1 != num2;
		System.out.println("num1 != num2 결과는 " + rsl);
	}

}
