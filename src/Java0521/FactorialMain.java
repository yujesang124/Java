package Java0521;

import java.util.Scanner;

public class FactorialMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 숫자를 입력받아서 
		// getFactoraila 함수 호출
		// getPower함수 호출
		
		Factoraial pr = new Factoraial();
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력 : ");
		int number = sc.nextInt();
		
		int getPower = pr.getPower(number);
		System.out.println("getPower : " + getPower);
		
//		Factoraial ft = new Factoraial();
//		Scanner sc = new Scanner(System.in);
//		int number =sc.nextInt();
//		
//		int factorial = ft.getFactorial(number);
//		System.out.println("factorial :" + factorial);
		
	}

}
