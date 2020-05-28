package Java0528_05;
// 구현클래스
public class Television implements RemoteControl{
	//필드선언
	// int volume 을 확인하기 위해서
	private int volume;
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
			//MAX_VOLUME이 상수필드여서 객체를 지정하지않아도 불러올 수 있었음.
		}else if(volume < RemoteControl.MIN_VOLUME){
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨 : " + this.volume);
	}
	// default메소드 재정의
	@Override
	public void setMute(boolean mute) {
		if(mute) {
			System.out.println("TV 음소거 합니다.");
		}else {
			System.out.println("TV 음소거 해제");
		}
	}
	
	
}
