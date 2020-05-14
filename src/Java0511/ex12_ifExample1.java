/*
	Date : 20.05.11
	Author : JasonYu
	Description : ifexample1 
	Version : 1.0
 */
package Java0511;

import java.util.Scanner;

public class ex12_ifExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제. 성적출력 예제
		// 점수 입력받아서 
		// 90점 이상이면 "A학점 입니다." 출력 
		// A : 90~100
		// B : 80~89
		// C : 70~79
		// D : 60~69
		// E : 60
		int score;
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		score = sc.nextInt();
		
		
		
		
		
		if(score>100) {
			System.out.println("입력오류입니다..");
		}else if(score>=90) {
			System.out.println("A학점입니다.");
		}else if(score>=80) {
			System.out.println("B학점입니다.");
		}else if(score>=70) {
			System.out.println("C학점입니다.");
		}else if(score>=60) {
			System.out.println("D학점입니다.");
		}else if(score<0) {
			System.out.println("입력오류입니다..");
		}else {
			System.out.println("F학점입니다.");
		}
	}
}
