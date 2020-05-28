package Java0528_03;

public class PhoneInfo {
	 //1. 추상클래스
	//(1) 클래스 이름 : SmartPhone
	//(2) 추상 메소드 : String getPrice() / String getBrand() / String getName()
	
	//2. 구현클래스
	//(1) 클래스 이름 : Iphone, Galaxy
	
	//3. 유틸클래스
	//(1) 클래스 이름 : PhoneInfo
	//(2) 구현 메소드 : void phoneInfo(SmartPhone smtp)
	
	void phoneInfo(SmartPhone smtp) {
		
		System.out.println("가격 : " + smtp.getPrice());
		System.out.println("제조사 : " + smtp.getBrand());
		System.out.println("이름 : " + smtp.getName());

	}
	//4. 메인클래스
	//(1) 클래스 이름 : PhoneMain
	//(2) 기능 : 3가지 방법으로 출력하기 객채생성 , 타입변환, 유틸클래스
}
