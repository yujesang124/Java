/*
	Date : 20.05.18
	Author : JasonYu
	Description : ArrayExample3
	Version : 1.0
 */
package Java0518;

import java.util.Scanner;

public class Ex01_ArrayExample3 {
	public static void main(String args[]) {
		// String [][] words;
		// words[5][2];
		// 배열[행][열];
		// 크기를 넣을때는 갯수대로 5행 2열이면 word[5][2] 지만 num1[0][0] 처럼 변수선언시에는 0부터 셈을 한다.
		int[][] num1 = new int[2][3];
		int[][] num2 = new int[3][3];
		
		
		num1[0][0] = 1;
		num1[0][1] = 2;
		num1[0][2] = 3;
		num1[1][0] = 4;
		num1[1][1] = 5;
		num1[1][2] = 6;
		
		for(int i=0; i<num1.length; i++) {
			for(int j=0; j<num1[i].length; j++) {
				System.out.println("num[" +i +  "][" + j +"] = " + num1[i][j]);
			}
		}
		Scanner sc = new Scanner(System.in);
		
		String[][] words = {
				{"chair", "의자"},
				{"desk", "책상"},
				{"coffee", "커피"},
				{"pen", "볼펜"},
				{"computer", "컴퓨터"}
		};
		
		for(int i=0; i<words.length; i++) {
			for(int j=0; j<words[i].length;j++) {
				System.out.println("words[" +i +  "][" + j +"] = " + words[i][j]);System.out.println();
			}
		}
		for(int i=0; i<words.length; i++) {
			System.out.print("문제 " + (i+1) + "." + words[i][0] + "의 뜻은 무엇인가요?");
			                                       // [i][0] 의 의미는 영어단어
			String answer = sc.next(); //  'nextInt'가 아닌 이유는 String을 이라는 문자열을 입력받기 때문에
			
			if(answer.equals(words[i][1])) { // [i][1] 은 한글단어
				System.out.println("정답입니다.");
			}else {
				System.out.println("틀렸습니다.");
				System.out.println("정답은" + words[i][1] + "입니다.");
			}
			
		}
		
		System.out.println("총" + num1 + "개를 맞췄습니다.!");
		
		
		
		System.out.println(num1.length); //num1 안에 배열이 두개가 들어가 있다는 뜻.
		// num1 = { {1,2,3}  , {4,5,6} } 
		//        <- new int[2][3]; 이건 3개({1,2,3}) 과 같은  들어가 있는게 2개가 있다.  
		System.out.println(num1[0].length); //
		// 
		System.out.println(num1[1].length); //
		
		
	}
}
