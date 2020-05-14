/*
  Date : 20.05.13
  Author : JasonYu
  Description : continue 
  Version : 1.0
 * 
 */
package Java0513;

public class ex03_continue {
	public static void main(String args[]) {
		// continue 문은 반복문과 함께 사용
		// 반복문 안에서 continue문을 만나면
		// 이후 문장은 수행하지 않고 for문의 증감식을 수행한다.
		
//		for(int i=1; i<=10; i++) {
//			if(i%2 == 0) {
//				continue;
//				//거름종이 = continue
//		 
//			}
//			System.out.println(i);
//		}
		
		
		
		/*
		 	for(초기화식;조건식;증감식){
		 		특정조건
		 		continue;
		 		반복문 수행;
		 	}
		 */
		
		// 1~100 숫자중에 짝수의 합
		int sum = 0;
		for(int i=1; i<=100; i++) {// int형 i변수 1로 초기화, i는 100이하, 증가식
				
			if(i%2==1) { // 조건 i를 2로 나누어 나머지는1(홀수) 
				continue; // 값이 거짓이 되면 continue밖으로 나와 <-짝수값이 나와 sum = sum+i로..
			}// 홀수값은 생성되지않는다.
			sum = sum+i;
		}
		System.out.println("1부터 10까지 짝수의 합 : " + sum);
		
	}
}
