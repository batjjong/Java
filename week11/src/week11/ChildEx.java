package week11;

public class ChildEx {
	public static void main(String[] args) {
		Child child = new Child();
		child.method1();
		
		//부모한테서 상속받은 메소드라도
		//자식클래스에서 재정의 되면
		//재정의된 메소드가 호출됨
		child.method2();
		child.method3();
		child.field1 = "aaa";
		child.filed2 = "bbb";
		
		System.out.println("---자동타입변환---");
		//클래스의 자동타입 변환
		//부모클래스 변수 <= 자식 객체를 대입
		Parent parent = child;
		
		parent.method1();
		
		//자동타입이 적용된 경우
		//부모클래스 변수라도 자식클래스에서 재정의된 메소드 호출
		parent.method2();
		
		//자식객체가 부모클래스 변수에 자동ㅇ타입변환이 되어도
		//부모클래스 변수는 자식클래스에만 정의된 메소드는 호출 불가
		//자식 클래스 변수는 부모 클래스에 정의돈것만 접근 가능
		//parent.method3();
	
		parent.field1 = "aaa";
		//parent.field2 = "bbb";
		
		//강제타입변환(casting)
		//다시 자식클래스에만 정의된 필드나 메소드를 접근하려면
		//강제타입변환이 필요
		Child child2 = (Child)parent;
		child2.filed2 = "bbb";
		child2.method3();
		
		//순수 부모객체를 casting해보자
		Parent parent2 = new Parent();
		Child child3 = (Child)parent2;
		child3.method3();
		
		
	}
}
