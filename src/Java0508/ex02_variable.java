package Java0508;

public class ex02_variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 변수 : 프로그램 실행에 필요한 데이터를 저장하기위해 메모리 공간을 할당, 이름을 부여
		
		// var num = 0;
		// [변수타입] [변수명] = [변수값];
		int age = 35; // 변수선언과 초기화를 동시에 함
		int age1; // 변수선언
		age1 = 35; // 변수초기화
		
		int age2 = 11, age3 = 12, age4 = 13;
		
		age1 = 10;
		System.out.println("age1 = " + age1 );
		//변수 여러개 선언 가능 그에 따른 값도 초기화 지정가능
		// 같은 변수를 초기화 계속하면 마지막으로 초기화된 값이 출력된다.
		
		
		// 변수타입 
		// 1. 정수형
		// 2. 실수형
		// 3. 문자형
		// 4. 논리형
		
		byte bNum1 = -128; 
		byte bNum2 = 127;
		int bNum3 = -129;
		int bNum = 128;
		
		// int 의 Max 는 2147483647 이다
		// int bNum4 = 2147483648;
		
		short sNum1 = -32768;
		short sNum2 = 32767;
		
		long bNum4 = 2147483648L;
		System.out.println(bNum3);
		System.out.println(bNum4);
		
		// long 을 변수타입으로 사용할 시 숫자 뒤에 'L'을 붙인다.
				// long bNum4 = 2147483648;
		// bNum4의 변수값 숫자 뒤에 L 을 썼지만 출력할 때에는 생략되서 나온다.
		
		// 실수형
		// float(4byte), double(8byte)
		// double > float
		float pi1 = 3.14f;
		double pi2 = 3.14;
		
		float pi3 = 3.1234567890123456789f;
		// long은 L  float는 f 추가해야한다.
		System.out.println(pi3);
		
		double pi4 = 3.1234567890123456789;
		double pi5 = 3.1234567890123456489;
			
		System.out.println(pi4);
		System.out.println(pi5);
		// 결과값 출력시 pi3 인 float는 소수점 7자리 숫자까지 그대로 출력된다.
		// 결과값 출력시 pi4 인 double은 소수점16자리 숫자까지 출력되며 17번째 자리수가
		// 올림되는 결과값을 가져온다.
		
	
		
		
	}

}
