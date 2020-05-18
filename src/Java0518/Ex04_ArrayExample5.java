package Java0518;

import java.util.Scanner;

public class Ex04_ArrayExample5 {
	public static void main(String args[]) {
		// 스캐너를 이용해서 고등학교 3학년간의 학기별 점수를 입력하고
		// 총점을 출력하세요. 고등학교 성적의 평균을 출력하세요.
		
		double scores[][] = new double[3][2];
		
		Scanner sc =new Scanner(System.in);
				
		double sum = 0;
		for(int i=0; i<scores.length; i++) { //학년을 나타내기 위한 반복문
			// score.length => 학년
			for(int j=0; j<scores[i].length; j++) { //학기를 나타내기 위한 반복문
			// score[i].length => 학기
				System.out.println((i+1) + "학년" + (j+1) + "학기 >>");
				scores[i][j] = sc.nextDouble();
				sum += scores[i][j];
			}
		}
		double avg=sum/ (scores.length*scores[0].length);
		System.out.println("고등학교성적 총점" + sum);
		System.out.println("고등학교성적 평균" + avg);
	}
}
