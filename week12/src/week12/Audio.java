package week12;

public class Audio implements RemoteControl {
	private int volume;
	private int memoryVol;
	
	@Override
	public void turnOn() {
		System.out.println("오디오켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("오디오끕니다");
		
	}

	@Override
	public void setVolume(int volume) {
		this.volume = volume;
		System.out.println("현재 tv볼륨 : "+ volume);
	}
	
	//일반적으로 무음 처리 현재 볼륨 저장
	//무음 해제할 때 원래 볼륨 복원
	
	@Override
	public void setMute(boolean mute) {
		if(mute) {
			System.out.println("Audio 무음 처리합니다");
			this.memoryVol  = this.volume;
			setVolume(MIN_VALUE);
		}
		else {
			System.out.println("Audio 무음 해제합니다");
			setVolume(memoryVol);   
		}
	}
}
