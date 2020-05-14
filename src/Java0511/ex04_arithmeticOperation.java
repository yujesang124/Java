/*
 	Date : 20.05.11
 	Author : jasonYu
 	Description : ex04_산술연산자
 	Version : 1.0
 */
package Java0511;

public class ex04_arithmeticOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 정수형 변수를 2개 선언
		// +,-,x, /, % 연산수행
		
		int num1 = 7;
		int num2 = 2;
		int rsl;
		System.out.println("num1 = 7, num2 = 2");
		//덧셈
		rsl = num1 + num2;
		System.out.println("num1 + num2 = rsl 덧셈/" + rsl);
		
		// 뺄셈(-)
		rsl = num1 - num2;
		System.out.println("num1 - num2 = rsl 뺄셈/" + rsl);
		// 곱셈(*)
		rsl = num1*num2;
		System.out.println("(num1 * num2) = rsl 곱셈/" + rsl);
		// 나눗셈(/)
		rsl = num1/num2;
		System.out.println("(num1 / num2) = rsl 나눗셈/" + rsl);
		// 나머지(%)
		rsl = num1%num2;
		System.out.println("(num1 % num2) = rsl 나머지값/" + rsl);
	}

}
