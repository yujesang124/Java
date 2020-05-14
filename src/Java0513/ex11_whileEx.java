package Java0513;

import java.util.Scanner;

public class ex11_whileEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//while문은 이용해서 주사위를 던졌을때 5가 나오면 종료하는 프로그램을 만드시오.	
		boolean run = true;
		int cnt = 0;
		// while(True) 일때 반복문 실행
		// while(false) 일때 반복문 종료.
		
		
		while(run) {
			int dice = (int)(Math.random()*6) +1;
			cnt++;
			System.out.println("주사위 값 : " + dice);
			
			if(dice ==5) {
				run = false;
			}
			//rim = false 가 되야 종료
		}
		
		System.out.println("\n던진 횟수 : " + cnt);
		System.out.println("프로그램을 종료합니다.");
		
	}

}
