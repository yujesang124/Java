package Java0522;

public class B {

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
		
		// private은 자기 클래스 내에서만 실행 됨.
		// 
		
		
	}

}
