package Java0521;

public class carMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car jh_car = new Car("기름", "삼성");
		Car oh_car = new Car("하늘색", 250);
		Car yj_car = new Car("white", "kia");
		Car sj_car = new Car("gray", 300, "전기차", "SJ8", "테슬라");
		Car js_car = new Car(200, "검정");
		
		js_car.type = "전기차";
		js_car.model = "k5";
		js_car.company = "기아";
		
		System.out.print("jh's car : ");
		System.out.println(jh_car.gas);
		
		jh_car.setGas(10);
		System.out.println("jh's car charge : " + jh_car.gas);
		
		boolean gasChecking = jh_car.isLeftGas(); 
		
		if(gasChecking) {
			System.out.println("===============");
			System.out.println("출발");
			jh_car.run();
		}
		
		
		//제상 Car
		// 색상 : 검정
		// 속도 : 250
		// 타입 : 전기차
		// 모델 : k5
		// 제조사 : 기아
		
		// 재현 car 색 검정!
		// 제조사 : BMW
		// 최고속도 : 200
		jh_car.color = "Black";
		jh_car.company = "BMW";
		jh_car.speed = 200;
		System.out.println("jh_car.color : " + jh_car.color);
		System.out.println("jh_car.company : " + jh_car.company);
		System.out.println("jh_car.speed : " + jh_car.speed);
		System.out.println(jh_car.toString()); // toString 
		// 은희씨 car
		//색상 : 하늘색(매개변수)
		//최고속력  : 250(매개선수)
		
		
		
		oh_car.type = "수소차";
		oh_car.model = "R8";
		oh_car.company = "아우디";
		// 유진씨 car
		//색상 : 흰색(매개변수)
		//속도 : 210
		//타입 : 가솔린
		// 모델 : k5
		// 제조사 : 기아(매개변수)
		
		yj_car.speed = 210;
		yj_car.type = "가솔린";
		yj_car.model = "k5";
		
		
		// 성진씨 car
		// 색상 : 회색(매개변수)
		// 속도 : 300(매개변수)
		// 타입 : 전기차(매개변수)
		// 모델 : SJ8(매개변수)
		// 제조사 : 테슬라(매개변수)
		
		
		
	}

}

