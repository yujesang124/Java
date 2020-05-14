/*
 	Date : 20.05.11
 	Author : JasonYu
 	Description : ex09_calculator 
 	Version : 1.0
 */
package Java0511;

import java.util.Scanner;

public class ex09_Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 두개의 정수를 입력받아서 결과를 출력해보자.
		
		int num1;
		int num2;
		double rsl;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 입력 : ");
		num1 = sc.nextInt();
		System.out.print("두번째 숫자를 입력 : ");
		num2 = sc.nextInt();
		rsl = num1 + num2;
		System.out.println("덧셈 결과 : " + rsl);
		
		rsl = num1 - num2;
		System.out.println("뺄셈 결과 : " + rsl);
		
		rsl = num1 * num2;
		System.out.println("곱셈 결과 : " + rsl);
		
		rsl = (double)num1 / num2; //double로 하면 num1 값이 10.0이 된다.
		System.out.println("나눗셈 결과 : " + rsl);
		
		rsl = num1 % num2;
		System.out.println("몫 결과 : " + rsl);
		
		
		
		
	}

}
