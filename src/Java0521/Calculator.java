package Java0521;

public class Calculator {

	// 메소드
	
	
	double avr(int x, int y) {
		double sum = add(x, y);
		double rsl = sum/2;
		return rsl;
	}
	
	int add(int x, int y) {
		// x + y
		int rsl = x + y;
		return rsl;
		
	}
	//순서에 상관없이 add라는 함수값을 double 타입 avr 함수 안에서도 아래에 있는 add를 찾아서 호출해준다.
	
	
	void excute(int x, int y) {
		double rsl = avr(x,y);
		System.out.println("실행결과 : " + rsl);
		
		// 모든 함수에서 return값을 넣으면 이후의 문장은 무효가 되면서 오류가 난다 sytemout 포함.
	}
	
	
}
