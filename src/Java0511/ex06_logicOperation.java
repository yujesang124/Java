/*
 	Date : 20.05.11
 	Author : JasonYu
 	Description : 논리연산자(logicOperation)
 	version : 1.0
 */
package Java0511;

public class ex06_logicOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 논리연산자에는 And 연산, OR연산, Not연산 으로 구성되어 있다.
		System.out.println("And연산, && : A&&B일 때 A,B 모두 true여야 함 / "
				+ "둘 중 하나라도 Flase면 결과는 False" );
		System.out.println("OR연산, || : A||B 일 때 A,B 중에 하나라도 true가 있으면 true/"
				+ " A 와 B 둘다 False 여야만 Flase, 이말은 A나 B가 False여도 true가 나온다.");
		System.out.println("Not연산, ! : boolean 변수 앞에 사용하면 true가 false로 바뀐다.");
		
		boolean rsl;
		// AND
		rsl = true && true;
		System.out.println("true && true : " + rsl);
		rsl = true && false;
		System.out.println("true && false : " + rsl);
		rsl = false && false;
		System.out.println("false && false : " + rsl);
		
		rsl = (5>3) && (3>1);
		System.out.println("(5>3) && (3>1) : " + rsl);
		
		rsl = (5>3) && (3<1);
		System.out.println("(5>3) && (3<1) : " + rsl);
		
		rsl = (5<3) && (3<1);
		System.out.println("(5<3) && (3<1) : " + rsl);
		
		// OR
		
		rsl = true || true;
		System.out.println("true || ture : " + rsl);
		rsl = true || false;
		System.out.println("true || false : " + rsl);
		rsl = false || false;
		System.out.println("false || false : " + rsl);
		
		rsl = (5>3) || (3>1);
		System.out.println("5>3 || 3>1 : " + rsl );
		rsl = (5<3) || (3>1);
		System.out.println("5<3 || 3>1 : " + rsl);
		rsl = (5<3) || (3<1);
		System.out.println("5<3 || 3<1 : " + rsl);
		// Not
		rsl = true;
		rsl = !rsl;
		System.out.println("!rsl = " + rsl);
		
		rsl = !rsl; // !rsl 된 값에 다시한번 !rsl 값을 하면 True -> False -> True 
		System.out.println("!rsl = " + rsl);
		
		rsl = !false;
		System.out.println("!rsl = " + rsl);
		
	}
	
	
}
