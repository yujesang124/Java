package Java0521;

import Java0521.StaticMethod;

public class StaticMethod {
	// 인스턴스 멤버 변수
	int memVar;
	
	// static 멤버 변수
	static int siaticVar;
	
	// 인스턴스 메소드
	void memMethod1() {
		int local = memVar;     // 멤버변수
//		int local1 = staticVar; // static 변수
//		staticMethod1();        // static 메소드
//		memMethod2();           // 메소드
		System.out.println("memMethod1");		
	}
	
	void memMethod2() {
		System.out.println("memMethod2");
	}
	
	// static 메소드
	static void stiaticMethod1() {
		StaticMethod st = new StaticMethod();
		// 맴버변수와 메소드를 사용하기 위한  객체 생성
		
		int local = st.memVar; // 멤버변수
		st.memMethod2();       // 메소드
		
		staticMethod2();
		System.out.println("staticMethod1");
	}
	
	static void staticMethod2() {
		System.out.println("staticMethod2");
	}
	
}
