package Java0521;

public class Factoraial {
	
	
	
	
	//메소드
	// 1. int getFactorial (int num)
	// 매개변수로 전송된 숫자의 팩토리얼 값을 구해서 리턴하시오
	// int num= 5인경우 5*4*3*2*1
	
	// 2. int getPower(int num)
	// 매개변수로 전송된 값까지의 제곱의 합을 구해서 리턴
	// int num = 3인 경우 1*1 + 2*2 + 3*3
	
	int getFactorial(int num) {
		int fact =1;
		
		for(int i=num; i>0; i--) {
			fact = fact * i;
			System.out.println("fact : " + fact);
			System.out.println("i : " + i);
			System.out.println("num : " + num);
		}
		return fact;
	};
	
	int getPower(int num) {
		int rsl = 0;
		for(int i=1; i<=num; i++) {
			rsl += i * i;
			System.out.println(" i : " + i);
			System.out.println("i*i : " + i*i);
			System.out.println("rsl : " + rsl);
		}
		return rsl;
	}
	
}
