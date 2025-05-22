package week12;

public interface RemoteControl {
	//인터페이스 선언
	//필드선언 - 상수필드(public static final)
	int MAX_VALUE= 10;
	int MIN_VALUE= 0;	
	
	//인터페이스 선언
	//모든 구현객체에서 사용하는 기능을 모아 놓은 것
	//인터페이스에서 선언된 메소드는 실행문이 없는 추
	//public adstract를 생략해도 컴파일 과정에서 자동 생성
	
	void turnOn();
	//기능추가 
	void turnOff();
	void setVolume(int volume);
	
	//새로운 기능 추가
	//default 메소드로 선언 -> 기존 구현 클래스엔 영향X
	//default 메소드는 반드시 실행문 포함해야함
	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("무음 처리합니다");
			setVolume(MIN_VALUE);
		}
		else {
			System.out.println("무음 해제합니다");
		}
	}
	
	//정적메소드 선언
	//구현 객체가 없어도 인터페이스 이르믕로 호출이 가능한 메소드
	
	static void changeBattery() {
		//실행문이 필요함
		System.out.println("리모컨 건전지를 교환합니다");
	}
	
}
