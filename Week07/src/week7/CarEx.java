package week7;

public class CarEx {
	public static void main(String[] args) {
		//객체 기본 생성
		Car mycar = new Car();
		
		
		//필드 
		System.out.println("------mycar------");
		System.out.println("제작회사:"+mycar.company);
		System.out.println("모 델:" +mycar.model);
		System.out.println("색 상:"+mycar.color);
		System.out.println("최고속도:"+mycar.maxSpeed);
		System.out.println("현재속도:"+mycar.speed);
		System.out.println();
		
		//객체 기본 생성자 
		Car yourcar = new Car();
		//필드값 변경
		//외부 클래스에서는 반드시 필드값을 객체 변수명으로 접근
		yourcar.speed = 100;
		
		System.out.println("-----yourcar-----");
		System.out.println("제작회사:"+yourcar.company);
		System.out.println("모 델:" +yourcar.model);
		System.out.println("색 상:"+yourcar.color);
		System.out.println("최고속도:"+yourcar.maxSpeed);
		System.out.println("현재속도:"+yourcar.speed);
		System.out.println();
		
		//매개변수를 이용해서 초기화하는 생성자를 이용
		Car mycar2 = new Car("그랜져", "white", 300);
				
		System.out.println("------mycar2------");
		System.out.println("제작회사:"+mycar2.company);
		System.out.println("모 델:" +mycar2.model);
		System.out.println("색 상:"+mycar2.color);
		System.out.println("최고속도:"+mycar2.maxSpeed);
		System.out.println("현재속도:"+mycar2.speed);
		System.out.println();
		
		Car yourcar2 = new Car("소나타", "black", 200);
		System.out.println("-----yourcar2-----");
		System.out.println("제작회사:"+yourcar2.company);
		System.out.println("모 델:" +yourcar2.model);
		System.out.println("색 상:"+yourcar2.color);
		System.out.println("최고속도:"+yourcar2.maxSpeed);
		System.out.println("현재속도:"+yourcar2.speed);
		System.out.println();
	}

}
