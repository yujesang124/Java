package Java0528_05;

public class RemoteMain  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1번방법
		Television tv = new Television();
		tv.turnOn();
		tv.setVolume(5);
		tv.setMute(true); // tv볼륨 음소거
		tv.turnOff(); 
		
		//Audio객채를 인터페이스 타입에 대입
		RemoteControl rc = null;
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(-1);
		rc.setMute(false);
		rc.turnOff();
		
		
		SmartTV smartTv = new SmartTV();
		smartTv.turnOn();
		
		smartTv.setMute(false);
		smartTv.setVolume(10);
		
		smartTv.turnOff();
		
		//TV, Audio 
		// 다형성, 유틸클래스
		System.out.println("세번째 다형성");
		ElectricInfo ri = new ElectricInfo();
		ri.ElectricInfo(tv, 6, false);
		ri.ElectricInfo(new Audio(), -1, true);
		System.out.println("스마트TV정보!!");
		SmartTV smtv = new SmartTV();
		ri.ElectricInfo(smtv, smtv, "naver", false, 8);
		
		
	}

}
