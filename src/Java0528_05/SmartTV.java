package Java0528_05;

public class SmartTV implements RemoteControl, InternetSearch {
// class에서는 상속을 1개밖에못하지만 interface에서는 다중 상속이 가능하다.

	int volume;

	@Override
	public void search(String url) {
		// TODO Auto-generated method stub
		System.out.println(url + "을 검색합니다.");
	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("스마트TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("스마트tv를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
			// MAX_VOLUME이 상수필드여서 객체를 지정하지않아도 불러올 수 있었음.
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 스마트TV 볼륨 : " + this.volume);
	}

	@Override
	public void setMute(boolean mute) {
		if (mute) {
			System.out.println("스마트TV 음소거 합니다.");
		} else {
			System.out.println("스마트TV 음소거 해제");
		}
	}
}
