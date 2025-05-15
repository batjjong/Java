package week11;

public class Child extends Parent {
	String filed2;
	
	//Parent 클래스으; method2를 재정의
	@Override
	public void method2() {
		System.out.println("Child-method2()");
	}
	//메소드 추가 - Child 글래스에만 정의
	public void method3() {
		System.out.println("Child-method3()");
	}
}
