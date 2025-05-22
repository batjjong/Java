package week12;

public class TV implements RemoteControl{
	//인터페이스 기능을 사용하(구현)는 클래스
	//구현클레스에서 인터페이스의 메소드를 반드시 재정의
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("티비켭니다");
	}

	@Override
	public void turnOff() {
		
		
		System.out.println("티비끕니다");
		
	}

	@Override
	public void setVolume(int volume) {
		if(volume > MAX_VALUE)
			volume = MAX_VALUE;
		else if(volume < MIN_VALUE)
			volume = MIN_VALUE;
		this.volume = volume;
		System.out.println("현재 tv볼륨 : "+ volume);
		
	}
}
