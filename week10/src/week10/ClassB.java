package week10;

public class ClassB {
	//public : 모든 클래스에서 호출 가능
	ClassA c1 = new ClassA(true);
	
	//defualt : 같은 패키지에서 호출 가능
	ClassA c2 = new ClassA(10);
	
	//private : 자기클레스 내부에서만 사용
	//ClassA c3 = new ClassA("홍길동");
}
