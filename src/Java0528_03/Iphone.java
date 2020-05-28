package Java0528_03;

public class Iphone extends SmartPhone{

	@Override
	String getPrice() {
		// TODO Auto-generated method stub
		String price = "100만원";
		return price;
	}

	@Override
	String getBrand() {
		// TODO Auto-generated method stub
		String brand = "애플";
		return brand;
	}

	@Override
	String getName() {
		// TODO Auto-generated method stub
		String name = "아이폰12";
		return name;
	}
	 //1. 추상클래스
	//(1) 클래스 이름 : SmartPhone
	//(2) 추상 메소드 : String getPrice() / String getBrand() / String getName()
	
	//2. 구현클래스
	//(1) 클래스 이름 : Iphone, Galaxy
	
	
	//3. 유틸클래스
	//(1) 클래스 이름 : PhoneInfo
	//(2) 구현 메소드 : void phoneInfo(SmartPhone smtp)
	
	//4. 메인클래스
	//(1) 클래스 이름 : PhoneMain
	//(2) 기능 : 3가지 방법으로 출력하기 객채생성 , 타입변환, 유틸클래스
}
