/*
 	Date : 20.05.11
 	Author : JasonYu
 	Description : ex07 _ conditionalOperation
 	Version : 1.0
 */
package Java0511;

public class ex07_conditionalOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 삼항연산자
		
		// (조건식) ? 참일 때 값 : 거짓일때 값;
		
		int inAge = 35;
		int hoonAge = 50;
		
		char rslChar;
		int rslInt;
		String rslStr;
		
		rslChar = (inAge > hoonAge) ? 'O' : 'X';//(참/거짓일때 문자 1개만사용)
		rslInt = (inAge > hoonAge) ? 0 : 1;
		rslStr = (inAge > hoonAge) ? "참일경우" : "거짓일경우";
		
		System.out.println("rslchar = " + rslChar);
		System.out.println("rslInt = " + rslInt);
		System.out.println("rslStr = " + rslStr);
		
		rslChar = (inAge < hoonAge) ? 'O' : 'X';//(참/거짓일때 문자 1개만사용)
		rslInt = (inAge < hoonAge) ? 0 : 1;
		rslStr = (inAge < hoonAge) ? "참일경우" : "거짓일경우";
		
		System.out.println("rslchar = " + rslChar);
		System.out.println("rslInt = " + rslInt);
		System.out.println("rslStr = " + rslStr);
		
		// 문제
		// 조건연산자를 사용하여 10이 짝수인 경우에는 true, 홀수일 경우 false 출력하는 
		// 조건연산자를 작성하시오
		
		int num = 10;
		boolean isEven;
		isEven = (num % 2 == 0 ) ? true : false; 
		System.out.println(isEven);
		// (조건식) ? 참일때 값 : 거짓일때 값;
		//isEven = (조건식) ?
		
	}

}
