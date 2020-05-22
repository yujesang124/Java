package Java0522_1;

import Java0522.A;

public class D {

	public static void main(String[] args) {
		A a = new A();
		
		//필드 불러옴
		 a.public1 = 10;
		// a.protected1 = 10; -> 빨간 줄 떴음.
		// a.default1 = 10; -> 빨간 줄 떴음.
		// a.private1 = 10; -> 빨간 줄 떴음.
		
		//메소드 불러옴
		
		 a.public2();
		// a.protected2(); -> 빨간 줄 떴음.
		// a.default2(); -> 빨간 줄 떴음.
		// a.private2(); -> 빨간 줄 떴음.
	}
}
