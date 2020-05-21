package Java0521;

public class Car {

	//필드
	// 색상(color), 최고속도(speed), 연료타입(type), 모델명(model)
	String color;
	int speed;
	String type;
	String model;
	String company = "테슬라";
	
	// 생성자
	// 기본생성자
	// 매개변수 : color, speed
	//	매개변수 : color, company
	//	매개변수 : color, speed, type, model, company
	
	Car(String color, int speed){
		this.color = color;
		this.speed = speed;
	}
	Car(String color, String company){
		this.color = color;
		this.company = company;
	}
	Car(String color, int speed, String type, String model, String company){
		this.color = color;
		this.speed = speed;
		this.type = type;
		this.model = model;
		this.company = company;
	}
	//메소드
	// 오버라이드 : 상속에서 사용
	// 부모기능 재정의
	@Override
	public String toString() {
		return "Car [color=" + color + ", speed=" + speed + ", type=" + type + ", model=" + model + ", company="
				+ company + "]";
	}
	
	Car(int speed, String color) {
		this.speed = speed;
		this.color = color;
	}
	
	
//	car(String company, int speed){
//		this.company = company;
//		this.speed = speed;
//	}
	
	// 필드추가 calculator 과 연결
	int gas;
	
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("gas가 없습니다.");
			return false;
		}else {
			System.out.println("gas가 남아있습니다.");
			return true;
		}
		// 조건문은 리턴값으로 받아도 이후에 else조건은 발동.
		
		//boolean 은 리턴값을 true or false로 ;
		// 데이터타입의 초기값을 return 값으로 적는것이좋다.
	}
	// 메소드 추가
	void run () {
		while(true) {
			if(gas > 0) {
				System.out.println("run!!! (gas 잔량 : " + gas + "입니다.)");
				gas--;
			}else {
				System.out.println("Stop!!! (gas 잔량 : " + gas  + " 이다.)");
				return; // 메소드 종료.
			}
		}
	}
	
	
	
	
	
}
