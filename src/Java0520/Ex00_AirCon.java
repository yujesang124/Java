/*
	Date : 20.05.20
	Author : JasonYu
	Description : AirCon class
	Version : 1.1
 */
package Java0520;

public class Ex00_AirCon {
	// 변수정의
	// 필드(특성, 상태, 속성)

	String company ;
	String color ;
	int price = 160000000;
	int size = 200;
	int temp = 16;
	
	Ex00_AirCon(int S){
		size = S;
	}
	Ex00_AirCon(String company){
		this.company = company;
	}
	
	
	// 생성자 
	/*
	 *  클래스명(매개변수){
	 * 	
	 * 	
	 * }
	 * 
	 * ※ 생성자는 메소드와 다르게 리턴아입을 받지않는다;
	 * 	ex) Ex00_AirCon(){
	 * 
	 * }
	 * 기본생성자 : Java 컴파일러가 기본적으로 생성자 메소드가 없으면 하나를 자동으로 만들어준다.
	 * 매개변수를 써도 되고 안써도 된다(기본생성자)
	 * 
	 * 
	 * 
	 */
	
	
	
	
	// 메소드(기능, 동작. 행동)

	/*
	 * 리턴타입 메소드명(){ 
	 * 실행내용
	 *  }
	 */// int 타입의 데이터를 반환 -> int 메소드명(){ }

	int addUser() {
		System.out.println("유저추가");
		return price;
		// void 가 아니면 return 값을 갖는다.
	}
	
	void onPower() {
		System.out.println("power on!");
	}

	void offPower() {
		System.out.println("power off!");
	}

	void upTemp() {
		temp++;
	}

	void downTemp() {
		temp--;
	}
	
	
	
}
// 데이터 타입이 void인 경우
// 리턴타입이 없을 때 void 사용
