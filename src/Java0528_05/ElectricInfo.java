package Java0528_05;

public class ElectricInfo {
	void ElectricInfo(RemoteControl remote, int volume, boolean mute) {
		remote.turnOn();
		remote.setVolume(volume);
		remote.setMute(mute);
		remote.turnOff();
	}
	
	public void ElectricInfo(Audio remote, int volume, boolean mute) {
		// TODO Auto-generated method stub
		remote.turnOn();
		remote.setVolume(volume);
		remote.setMute(mute);
		remote.turnOff();
	}
	
	//SmartTv에 대한 다형성 메소드
	
	public void ElectricInfo(SmartTV remote, int volume, boolean mute) {
		remote.turnOn();
		remote.setVolume(volume);
		remote.setMute(mute);
		remote.turnOff();
	}
	public void ElectricInfo(RemoteControl remote, InternetSearch is, String url, boolean mute, int volume) {
		// 매개변수 순서 중요!!!! url -> mute - > volume
		remote.turnOn();
		is.search(url);
		remote.setMute(mute);
		remote.setVolume(volume);
		remote.turnOff();
	}
}
