package week4;

public class Switch2 {

	public static void main(String[] args) {
		char grade = 'B';
		
		switch(grade) {
		case'B':case'b':
			System.out.println("B등급");
		case'A':case'a':
			System.out.println("A등급");
		}
		
		//switch 표현식
		switch(grade) {
		case'a','A'->{
			System.out.println("A등급");
			System.out.println("우수 회원");
		}
		case'b','B'->{
			System.out.println("B등급");
			System.out.println("일반 회원");
		}
		default->{
			System.out.println("손님");
			System.out.println("우수 회원");
		}
		
	}
		System.out.println();
		switch(grade) {
		case'a','A' -> System.out.println("우수회원");
		case'b','B' -> System.out.println("일반회원");
		default -> System.out.println("손님");
		}
		
	}
}
