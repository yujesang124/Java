package Java0528_04;

public class Constant {
	/*
	 * final : 마지막이라는 의미, 더이상 수정할 수 없음.
	 * 
	 * final 변수 : 상수를 의미 ex) PI = 3.14 변하지않는 수
	 * final 메소드 : final메소드는 하위클래스에서 재정의할 수 없다.
	 * final 클래스 : final클래스는 상속할 수 없다.
	 */
	
	int num = 10;
	final int NUM = 100;
	
	public static void main(String[] args) {
		Constant cons = new Constant();
		cons.num = 50;
		// cons.NUM = 200;
		// final로 지정됐기 때문에 값을 바꿀수없다.
		
		System.out.println("num : " + cons.num);
		System.out.println("NUM : " + cons.NUM);
	}
	
}
