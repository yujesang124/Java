package Java0519;

public class Ex01_AirCon {
	// 변수정의
	// 필드(특성, 상태, 속성)

	String company;
	String color;
	int price;
	int size;
	int temp;
	// 메소드(기능, 동작. 행동)

	/*
	 * 리턴타입 메소드명(){ 실행내용 }
	 */ // int 타입의 데이터를 반환 -> int 메소드명(){ }

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
