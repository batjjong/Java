package week7;

public class StudentEx {
	public static void main(String[] args) {// 메인이 있으면 실행 클레스
		Student st1 = new Student();//객체 
		System.out.println("st1 변수는 Student 객체를 참조한다");
		
		//설계도에 해당하는 클래스를 이용하면
		//인스턴스를 여러 개 생성 가능
		Student st2 = new Student();//객체
		System.out.println("st2 변수는 또다른 객체를 참조한다.");
		
	}
}
