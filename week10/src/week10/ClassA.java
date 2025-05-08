package week10;

public class ClassA {
	//클래스 내부에서 생성
	//ClassA c1 = new Class(true);
	//ClassA c2 = new Class(10);
	//ClassA c3 = new Class("홍길동");
	
	//생성자 오버로딩
	ClassA(int data){
		//접근제한자 생략 => defualt접근제한자
		
	}
	public ClassA(boolean data) {
		//public접근제한자
	}
	private ClassA(String data) {
		//private접근제한자
	}
}
