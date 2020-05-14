/*
 	Date : 20.05.14
 	Author : JasonYu
 	Description : summaryDay4
 	Version : 1.0
 */

package Java0513;

public class Ex00_day4_summary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 반복문 for문
		/*
		 	for(초기화식; 조건식; 증감식){
		 		
		 		실행할 반복문 내용 
		 	}
		 	
		 	1. 초기화식 int i =1;
		 	2. 조건식 i<= 10;
		 	3-1. (참일경우)수행할 반복문 내용
		 	3-2. (거짓일경우) 반복문 종료
		 	4. 증감식
		 	5. 조건식
		 	
		 */
		
		// 2. 중첩for문 ex) 구구단
		
		/*
		 	for(초기화식; 조건식; 증감식){
		 		for(초기화식; 조건식; 증감식){
		 			수행할 반복문 내용
		 			//(외부for문 x 내부for문)
		 			
		 		}
		 		// 내부 for문 횟수
		 	}
		 */
		
		
		// 3. continue 문
		// 반복문과 함께 사용
		// continue 가 실핼되면 이후 반복문 내용은 실행x
		// 다시 증감식으로 
		
		/*
		 
		 for(초기화식; 조건식; 증감식){ // 홀수구하기 짝수구하기
		 	수행할 반복문 내용1;
		 	continue;
		 	
		 	수행할 반복문 내용2;
		 	수행할 반복문 내용3;
		 
		// 4. 별찍기 예제
		// 한줄씩 이해하면서 주석달기!
		
		//5. wihle
		
		 //(1) for 비슷하게 사용
		  
		 	초기화식
		 	while(조건식){
		 		반복할 내용
		 		증감식
		 	}
		 }
		 
		 
		 */
		
		int number = 0; //초기화식
		while(number<=10) { // 조건식
			System.out.println(number + " "); // 반복내용
			number++; //증감식
		}
		System.out.println();
		System.out.println("while문 이후 number 값 : " + number);
		
		
		// (2) 반복횟수를 정하지 않고 사용하는 방법
		
		/*
		 * boolean 타입의 조건변수 사용 boolean 조견변수 == true;
		 
		 	while(조건변수){
		 		반복할내용
		 	 종료하기 위해서
		 	1)조건변수를 False로 만들기
		 	2)break;
		 	{
		 */
		
		
	}

}
