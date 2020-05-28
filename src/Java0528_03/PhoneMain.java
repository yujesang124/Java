package Java0528_03;

public class PhoneMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Galaxy samsung = new Galaxy();
		Iphone apple = new Iphone();
		System.out.println();
		System.out.println("첫번째 : 객체생성");
		
		samsung.getBrand();
		samsung.getName();
		samsung.getPrice();
		System.out.println("이름 : " + samsung.getName());
		System.out.println("가격 : " + samsung.getPrice());
		System.out.println("브랜드 : " + samsung.getBrand());
		apple.getBrand();
		apple.getName();
		apple.getPrice();
		System.out.println("이름 : " + apple.getName());
		System.out.println("가격 : " + apple.getPrice());
		System.out.println("브랜드 : " + apple.getBrand());
		
		
		System.out.println();
		System.out.println("두번째 : 자동타입변환");
		
		SmartPhone smtp = null;
		
		smtp = new Galaxy();
		System.out.println("이름 :"+ smtp.getName());
		System.out.println("가격 :"+ smtp.getPrice());
		System.out.println("브랜드 :"+ smtp.getBrand());
		smtp = new Iphone();
		System.out.println("이름 :"+ smtp.getName());
		System.out.println("가격 :"+ smtp.getPrice());
		System.out.println("브랜드 :"+ smtp.getBrand());
		
		System.out.println();
		System.out.println("세번째 : 다형성(유틸클래스)");
		
		PhoneInfo phoneInfo = new PhoneInfo();
		
		phoneInfo.phoneInfo(samsung);
		phoneInfo.phoneInfo(apple);
		
		
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
		
		//추상클래스는 추상메소드랑 일반void메소드가 들어올 수있다.
		//추상메소드를 상속받으면 지정된 것을 재작업 overrind하는 작업을 해야한다
		
	}

}
