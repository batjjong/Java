package week7;

public class Car {
	//자동차를 만드릭기 위한 라이브러리용 클래스
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	int speed;
	
	//생성자를 선언하지 않으면 기본 생성자가 자동으로 생심 -> Car yourcar = new Car();
	//하지만 하나라도 생성자를 선언하면 안생김
	
	/*
	Car(){
		//기본생성자
		this.model = "아몰랑";
		this.color = "red";
		this.maxSpeed = 150;		
	}
	//생성자 오버로딩(4개(0,1,2,3))
	
	Car(String model){
		this.model = model;
		this.color = "black";
		this.maxSpeed = 300;
	}	
	Car(String model, String color){
		this.model = model;
		this.color = color;
		this.maxSpeed = 200;
	}
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}*/
	
	Car(){
		this("아반떼","black",300);
	}	
	Car(String model){
		this(model,"black",300);
	}
	Car(String model,String color){
		this(model,color,300);
	}
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
