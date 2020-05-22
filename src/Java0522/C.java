package Java0522;

public class C extends A{
	// 오늘 클래스 만든 순서 B -> C-> D-> A 행.
	// C라는 클래스가 A라는 클래스를 상속받음 A가 부모, C가 자식
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a = new A();
		
		//필드 불러옴
		a.public1 = 10;
		a.protected1 = 10;
		a.default1 = 10;
		// a.private1 = 10; -> 빨간 줄 떴음.
		
		//메소드 불러옴
		
		a.public2();
		a.protected2();
		a.default2();
		// a.private2(); -> 빨간 줄 떴음.

		
	}

}
