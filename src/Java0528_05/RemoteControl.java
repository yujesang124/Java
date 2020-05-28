package Java0528_05;

public interface RemoteControl {
	//class 와 다른점 : 위에 class 대신 interface가 들어간다.
	/*
	 	인터페이스(interface)
	 	
	 	public interface 인터페이스명{
	 		public static final 타입 상수명;
	 		public abstract 리턴타입 메서드명;
	 	}
	 	
	 	1. 인터페이스는 누구나 접근가능하도록 public 설정
	 	2. 객체의 다형성을 구현하는데 용이하다.
	 	3. 인터페이스의 구성요소
	 		(1) 상수필드 : 일반적인 필드로 선언해도 컴파일 과정에서 static final이 자동으로 붙음
	 		(2) 추상메소드
	 		(3) 디폴트메소드 : 기본으로 실행내용까지 가지고 있는 메소드
	 		(4) 정적(static) 메소드 : 인터페이스를 객체화 하지 않고도 직접 호출이 가능
	 	4. 부모클래스 변수 = new 자식클래스();
	 	       인터페이스 변수 = new 구현클래스();
	 	   
	 */
	// 상수필드
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	//인터페이스 필드 넣어주는 것은 우리가 선언해주지않아도 static final이 붙는다.
	
	// 추상메소드
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	//default 메소드
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("음소거 합니다.");
		}else {
			System.out.println("음소거 해제");
		}
	}
	
	// 정적(static) 메소드
	static void changeBattery() {
		System.out.println("건전지를 교체해주세요.");
	}
	
	
}
