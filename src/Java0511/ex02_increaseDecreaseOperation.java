/*
 Date : 20.05.11
 Author : JasonYu
 Description : ex02_증감연산자
 Version : 1.0
 */
package Java0511;

public class ex02_increaseDecreaseOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 증감연산자 는 단항연산자에 포함된다.
		// 증가와 감소를 담당하는 연산자( ++, --)
		// ++num : num이 가지고있는 값에 1을 증가한 뒤에 연산에 적용
		// num++ : num이 가지고 있는 값을 연산에 적용한 뒤 1을 증가
		
		int num = 5;
		System.out.println("num 값 : " + num);
		++num;
		System.out.println("++num 값 : " + num);
		num++;
		System.out.println("num++ 값 : " + num);
		
		int num1 = 5;
		int rsl1;
		
		rsl1 = ++num1;
		System.out.println("rsl1값은 " + rsl1);
		
		// rsl = ++num1;
		// -> num1 = num1 + 1;
		// -> rsl 에 num1을 대입한다.
		
		rsl1 = num1++;
		System.out.println("num1++ rsl1값은 " + rsl1);
		// rsl = num++;
		// rsl에 num1을 대입하고
		// num1 = num1 + 1;
		
		int num2 = 10;
		--num2;
		System.out.println(num2); // 예상숫자 9
		
		// num2 = num2 - 1;
		// num2 = 10 - 1 ;
		// num2 = 9;
		
		int rsl2;
		
		rsl2 = --num2;
		System.out.println(rsl2); // 예상숫자 8
		
		// rsl2 = --num2;
		// num2 = num2 -1;
		// num2 = 9 - 1;
		// rsl2 = num2;
		// rsl2 = 8;
		
		rsl2 = num2--; 
		System.out.println(rsl2); // 예상숫자 8
		
		// rsl2 = num2--;
		// rsl2 = num2;
		// rsl2 = 8;
		// num2 = num2 - 1;
		// num2 = 8 - 1;
		
		int rsl3;
		System.out.println("원래num1값 : " + num1 + "원래 num2값 : " + num2);
		// num1 = 7 , num2 = 7
		rsl3 = ++num1 + ++num2;
		System.out.println("num1 = " + num1); // 8이 나오고 결과값 8
		System.out.println("num2 = " + num2); // 8이 나오고 결과값 8
		System.out.println("rsl3 = " + rsl3); // 16
		
		rsl3 = num1++ + num2++;
		System.out.println("num1 = " + num1); // 8이 나오지만 결과값 9
		System.out.println("num2 = " + num2); // 8이 나오지만 결과값 9
		System.out.println("rsl3 = " + rsl3); // 16
		rsl3 = num1++ + ++num2;
		System.out.println("num1 = " + num1); // 9가 나오지만 결과값 10
		System.out.println("num2 = " + num2); // 10가 나오고 결과값 10
		System.out.println("rsl3 = " + rsl3); // 19
		rsl3 = ++num1 + num2++;
		System.out.println("num1 = " + num1); // 11이 나오고 결과값 11
		System.out.println("num2 = " + num2); // 10이 나오지만 결과값 11
		System.out.println("rsl3 = " + rsl3); // 21
		
		int num3 = 5;
		int num4 = 11;
		int rsl4;
		
		rsl4 = ++num3 + --num4;
		
		System.out.println("첫번째의 num3 값 = " + num3); // 6이 나오고 결과값 6
		System.out.println("첫번째의 num4 값 = " + num4); // 10이 나오고 결과값 10
		System.out.println("첫번째의 rsl4 값 = " + rsl4); // 16
		
		rsl4 = num4++ - num3--;
		System.out.println("두번째의 num3 값 = " + num3); // 6이 나오지만 결과값 5
		System.out.println("두번째의 num4 값 = " + num4); // 10이 나오지만 결과값 11
		System.out.println("두번째의 rsl4 값 = " + rsl4); // 4 
	
		
		rsl4 = num3++ - ++num4;
		System.out.println("세번째의 num3 값 = " + num3); // 5가 나오지만 결과값 6
		System.out.println("세번째의 num4 값 = " + num4); // 12이 나오고 결과값 12
		System.out.println("세번째의 rsl4 값 = " + rsl4); // -7
		
	}

}
