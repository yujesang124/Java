/*
 	Date : 20.05.14
 	Author : JasonYu
 	Description : Do-While 예제(Up&Down게임)
 	Version : 1.0
 */
package Java0514;

import java.util.Scanner;

public class Ex03_DoWihleEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int answer = (int)(Math.random()*45 )+1;
		int input = 0;
		int count = 0; //몇번만에 맞추는지
		
		boolean run = true;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Up & Down Game 시작!!!");
		
		
		
		
		do {
			System.out.println("1부터 45까지 숫자를 입력하세요:"); //말해보세요.
			input = sc.nextInt(); //대답한다.
			count = count +1;
			
			if(answer > input) {
				System.out.println("Up! 더 큰수를 입력하세요."); //정답 > 내가 입력한것. 그래서 더 큰수를 입력하세요 라고 함.
			}else if(answer < input) {
				System.out.println("Down! 더 작은수를 입력하세요."); // 정답 < 내가 입력한것. 그래서 더 작은수를 입력하세요 라고 함
			}else {
				System.out.println("정답입니다. 정답은 = " + answer); // 정답 크지않거나 작지않으면 같은거니까 정답
				System.out.println("시도한 횟수는" + count + "입니다"); // 시도한 횟수는 count = count+1이니까 1번 시도할 때마다 걸림
				run = false;
			}
			
	
			
		}while(run);
		
		if(count <=3) {
			System.out.println("통과");
		}else {
			System.out.println("벌칙");
		}
		
	}

}
