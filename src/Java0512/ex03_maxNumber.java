package Java0512;

import java.util.Scanner;

public class ex03_maxNumber {

	public static void main(String args[]) {
		// 두수를 입력받아 큰수를 출력하기
		
		Scanner sc = new Scanner(System.in);
		
//		int num1, num2, max;
//		
//		System.out.print("첫번째 숫자 : ");
//		num1 = sc.nextInt();
//		System.out.print("두번째 숫자 : ");
//		num2 = sc.nextInt();
//		
//		if(num1 > num2) {
//			max = num1;
//		}else {
//			max = num2;
//		}
//		System.out.println("최댓값 : " + max);
		// 숫자 3개를 입력받아서 최댓값 구하기
		
		//1번째 예제
		int num1, num2, num3, max, mid, min = 0;
		System.out.print("첫번째 숫자 : ");
		num1 = sc.nextInt();
		System.out.print("두번째 숫자 : ");
		num2 = sc.nextInt();
		System.out.print("세번째 숫자 : ");
		num3 = sc.nextInt();
		
		if(num1 > num2) {
			if(num1 > num3) {
				max = num1;
			}else {
				max = num3;
			}
		}else if(num2 > num3) {
			max = num2;
		}else {
			max = num3;
		}
		System.out.println("최댓값 : " + max);

		//2번째 예제
		if(num1 > num2 && num1>num3) {
			max = num1;
		}else if(num2 > num3) {
			max = num2;
		}else {
			max = num3;
		}
		
		// 최댓값 중간값 최솟값 
		
		
		
		
	}
}
