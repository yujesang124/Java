/*
   Date : 20.05.12
   Author : JasonYu
   Description : swithCase
   Version : 1.0 	
 */
package Java0512;

import java.util.Scanner;

public class ex05_switchCase2 {

	public static void main(String args[]) {
		// switch-case 문을 사용해서 월별 날짜 계산하기.
		
		int month;
		int day;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월을 입력하세요 : ");
		
		month = sc.nextInt();
		
		switch(month){
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			day = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			day = 30;
			break;
		case 2:
			day = 28;
			break;
			default :
				day = 0; //그외의 달에 day값을 0으로 지정할 수 있음.
						 //또는 첫 선언에 day=0으로 값을 잡아줄 수 있음.
				System.out.println("값을 잘못입력하셨습니다.");
		}
		if(month>=1 && month<13)
		{
			System.out.println("입력하신 " + month + "월은" + day + "일까지입니다.");	
		}else {
			System.out.println("");
		}
		
	}
	
}
