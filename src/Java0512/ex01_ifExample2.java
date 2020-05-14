/*
 	Date : 20.05.12
 	Author : JasonYu
 	Description : ifExample2 
 	Version : 1.0
 */
package Java0512;

import java.util.Scanner;

public class ex01_ifExample2 {

	public static void main(String[] args) {
		// 스캐너를 사용해서 국어, 영어, 수학점수를 입력받아 총점, 평균을 구하시오.
		// 평균점수를 이용하여 A+,A,B+,B,C+,C,D+,D
		// 총점과 평균은 실수형으로(double)
		Scanner sc = new Scanner(System.in);
		int scoreKor;
		int scoreEng;
		int scoreMath;
		double rslSum;
		double rslAvr;
		String grade;
		
		System.out.print("국어점수를 입력하세요. : ");
		scoreKor = sc.nextInt();
		System.out.print("영어점수를 입력하세요. : ");
		scoreEng = sc.nextInt();
		System.out.print("수학점수를 입력하세요. : ");
		scoreMath = sc.nextInt();
		rslSum = scoreKor + scoreEng + scoreMath;
		
		rslAvr = (double)(rslSum/3);
		
		
		if(rslAvr<100){ // 0~100
			if(rslAvr>=90){ // 90~100
				if(rslAvr>=95){ // 95~100
					grade = "A+";
				}else{
					grade = "A";
				}
			}else if(rslAvr>=80){ //80~90
				if(rslAvr>=85){ //85~90
					grade = "B+";
				}else{
					grade = "B";
				}
			}else if(rslAvr>=70){ //70~80
				if(rslAvr>=75){
					grade = "C+";
				}else{
					grade = "C";
				}
			}else if(rslAvr>=60){
				if(rslAvr>=65){
					grade = "D+";
				}else{
					grade = "D";
				}
			}else{
				grade = "F";
			}
			System.out.println("당신의 학점은" + grade +"입니다.");
			System.out.println("당신의 총점은" + rslSum + "입니다.");
			System.out.println("당신의 평균은" + rslAvr + "입니다.");
			System.out.println("당신의 평균(소수점)은" + Math.round(rslAvr*100)/100.0 + "입니다.");
		}else{
			System.out.println("입력범위를 초과하였습니다.");
		}
	}
}
