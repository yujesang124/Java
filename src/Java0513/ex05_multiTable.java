/*
  Date : 20.05.13
  Author : JasonYu
  Description : multiTable
  Version : 1.0
 */

package Java0513;

import java.util.Scanner;

public class ex05_multiTable {
	public static void main(String args) {
		// 중첩for문을 이용해서 2단부터 9단까지의 구구단을 작성해라
		
		
		int startNum;
		int i;
		int j;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단수를 입력하세요 : ");
		startNum = sc.nextInt();
		
		
		
		for(i =startNum; i<=9; i++) {
			for(j=1; j<=9; j++) {
				System.out.println(startNum+"*"+j + "=" + startNum*i);
			}
			System.out.println("========================");
		}
		sc.close();

	}
}
