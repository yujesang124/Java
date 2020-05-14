/*
	Date : 20.05.14
	Author : JasonYu
	Description : 배열예제 
	Version : 1.0
 */
package Java0514;

import java.util.Scanner;

public class EX05_ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		// 3열 1차열 배열 선언하고 3개의 값을 입력 받아서 입력받은 값의 총합, 평균을 구하시오  

		// (1) 몇개의 
		int sum = 0;
		int arr[] = new int[3];
		Scanner sc = new Scanner(System.in);
		System.out.println("정수" + arr.length +  "개를 입력하세요. : ");
		for(int i=0; i<arr.length; i++) {
			System.out.println(i + 1 + "번째 정수를입력하세요 :");
			arr[i] = sc.nextInt();
			// arr[0] <= scanner로 내가 친 숫자를 입력받을거야
			// arr[1] <= scanner로 내가 친 숫자를 입력받을거야
			// arr[2] <= scanner로 내가 친 숫자를 입력받을거야
			sum += arr[i];	
			// 그다음에 sum 이라는 변수에 내가 입력한 값을 더할거야.
			// arr[0] 일때 sum = 내가 첫번째로 입력한 값
			// arr[1] 일때 sum = 내가 첫번째로 입력한 값 + 내가 두번째로 입력한 값
			// arr[2] 일때 sum = 내가 첫번째로 입력한 값 + 내가 두번째로 입력한 값 + 내가 세번째로 입력한 값
		}
		System.out.println("배열의 총합은 " + sum);
		double avr = (double)sum/arr.length;
		// int 인 sum 을 숫자로 나누면 int값이 나오기 대문에 (double)을 해줌으로써 소수점으로 나오도록 만들었다.
		
		System.out.println("배열의 평균은" + avr);
	}
}
