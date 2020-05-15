package Java0515;

import java.util.Scanner;

public class Ex05_ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = null;
		// 학생 수는 while문 안에서
		// 학생수는 int stuNum = sc.nextInt();
		// scores = new int[stuNum];
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int menu;
		int stuNum = 0;
		
		
		
		while(run){
			System.out.println("---------------------------------------------");
			System.out.println("1. 학생수| 2. 점수입력| 3. 점수리스트| 4. 분석 | 5. 종료");
			System.out.println("---------------------------------------------");
			System.out.println("1~5 중 선택하시오.");
			menu = sc.nextInt();
			switch(menu) {
			
			
			case 1 : // 학생 수를 입력
				
				System.out.print("학생 수 입력 : ");
				stuNum = sc.nextInt();
				break;
			case 2 : 
				scores = new int[stuNum]; 
				for(int i=0; i<scores.length; i++) {
					// stuNum == scores.length
					System.out.println( (i+1)+"번째 학생점수 입력   : ");
					scores[i] = sc.nextInt();
				}
				break;
			case 3 : //학생점수 출력
				for(int i=0; i<scores.length; i++) {
					// stuNum == scores.length
					System.out.println( (i+1)+"번째 학생점수 :" + scores[i]);
					
				}
				break;
			case 4 : 
				int sum = 0;
				int max = 0;
				double avg = 0;
				for(int i=0; i<scores.length; i++) {
					if (scores[i] > max) {
						max = scores[i];
					}
					sum += scores[i];
				}
				System.out.println("최고점수는 : " + max);
				avg = (double)sum / scores.length;
				System.out.println("평균 : " +avg);
				break;
			
			case 5 : 
			
				run = false;
				break;
			default:
				System.out.println("다시 입력해주세요.");
				break;
			} 
		}
		System.out.println("프로그램을 종료합니다.");
		sc.close();
	}
}
