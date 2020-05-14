/*
  Date : 20.05.11
  Author : JasonYu
  Description : ex_01
  Version : 1.0
 */
	
package Java0511;

public class ex03_assignmentOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 35;
		// 나이를 의미하느 변수 age 에 변수값 35를 대입한다.
		// 왼쪽변수 = 오른쪽변수(또는 변수, 식)
		int num = 1;
		age = num;
		age = 1+25;
		// 왼쪽변수는 무조건 변수로 사용해야 한다.
		// 1Value(항상 변수) = rValue(상수, 변수, 식)
		
		// 부호연산자 : (+), (-)
		int num1 = 10;
		System.out.println(+num1); //10
		System.out.println(-num1); //-10
		System.out.println(num1);  //10
		
		num1 = -num1;
		System.out.println(num1); //-10
		
		
	}

}
