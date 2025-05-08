package week10;

public class Car {
	//클래스의 각 필드를 private으로 선언
	///외부에서 접근근을 제한한다
	private String company;
	private String model;
	private String color;
	private int    maxSpeed;
	
	//외부값이 필요한경우
	//값을 제공하기 위해 getter() 메소드를 선언
	//getter()메소드는 public
	public String getCompany() {
		return company;
	}
	//외부로부터 주어진 값을 필드값으로 적용하기위해
	//setter() 메소드 이용
	//public으로 선언
	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		if(maxSpeed > 350)
			this.maxSpeed = 350;
		else
			this.maxSpeed = maxSpeed;
	}

	
	
	
	
}
