package Java0521;

public class StaticMethod {

	// 인스턴스 멤버 변수
	int memVar;
	// 스태틱 멤버 변수
	static int staticVar;
	// 인스턴스 메소드

	void memMethod1() {
		int local = memVar; //멤버변수
		int local1 = staticVar; //static 변수 
		staticMethod1(); //static 메소드
		memMethod2(); //메소드
		System.out.println("memMethod1");
	}

	void memMethod2() {
		System.out.println("memMethod2");
	}
	// static method
	static void staticMethod1() {
		int local1 = staticVar; //static 변수
		staticMethod1(); //static 메소드
		// int local = memVar;
		// memMethod1()
		
		// 그냥변수랑 그냥 메소드를 사용하려면 아래와 같이 "StaticMethod st = new StaticMethod" 처럼 객체 생성하면
		// 그냥변수와 메소드를 사용가능하다. 
		StaticMethod st = new StaticMethod();
		int local = st.memVar;
		st.memMethod2();
		staticMethod2();
		System.out.println("staticMethod1");

	}

	static void staticMethod2() {
		System.out.println("staticMethod2");
	}
	// 메인메소드 (static)

	
	
	
	public static void main(String[] args) {
		// StaticMethod.memMethod1();
		StaticMethod st = new StaticMethod();
		
		//static메소드랑 
		
		st.memMethod1();
		StaticMethod.staticMethod2();
		staticMethod2();
		// 같은 클래스 안에서는 static메소드 만으로 호출 가능하다..
		int local = staticVar;
		// local = memVar
	}
	
	
	
	
}
