package week10;

public class SmartPhone extends Phone{//Phone가 SmartPhone을 상속받음
	private boolean wifi;

	public SmartPhone(String model,String color) {
		//기본생성자
		//this.model = model;
		//this.color = color;
		//부모생성자 명시적 호출 
		super(model, color);
		System.out.println("SmartPhone() 생성자 호출");
	}
	
	
	
	
	public boolean isWifi() {
		return wifi;
	}

	public void setWifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("wifi 상태변경");
	}
	
	public void internet() {
		System.out.println("인터넷 연결");
	}
	
}
