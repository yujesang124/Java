/*
	Date : 20.05.11
	Author : JasonYu
	Description : 중첩if문(nestedIf)
	Version : 1.0
 */
package Java0511;

import java.util.Scanner;

public class ex13_nestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. 100점을 초과하면 "입력범위를 초과했습니다."출력
		// 2. 학점처리
		// A+ : 95~100, A : 90~94, B+ : 85~89, B : 80~84, C+ : 75~79,
		// C : 70~74, D+ : 65~69, D : 60~64, F : 60미만.
		// 3. print문은 1번만 사용
		
		Scanner sc = new Scanner(System.in);
		int score;
		String grade;
		
		System.out.print("점수를 입력하세요 : ");
		score = sc.nextInt();
		
		if(score <=100) { // 0~100
			if(score >=90) { // 90~100
				if(score>=95) { // 95~100
					grade = "A+";
				} else { // 90~94
					grade = "A";
				}
				// 위에 까지 score >=90 일때 랑 score >=95
			}else if(score >=80) { // 80~90
				if(score>=85) { //85 ~89
					grade ="B+";
				} else { // 80~84
					grade = "B";
				}
			}else if(score >=70) { // 70~80
				if(score>75) { // 75~80
					grade = "C+"; 
				} else { // 70~74
					grade = "C";
				}
			}else if(score >=60) { // 60~70
				if(score>75) { // 65~70
					grade = "D+";
				} else { // 60~64
					grade = "D";
				}
			}else { // 60점 미만
				grade = "F";
			}
			
			System.out.println("당신의 학점은" + grade + "입니다.");
			
		} else {
			System.out.println("입력 범위를 초과하였습니다.");
		}
	}
}
