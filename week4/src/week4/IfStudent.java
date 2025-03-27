package week4;

import java.util.Scanner;

public class IfStudent {
	public static void main(String[] args) {
		//외부로부터 데이터 입력 => Scanner 클래스 이용
		Scanner sc = new Scanner(System.in);
		System.out.printf("태어난 년도 입력 : ");
		int year = sc.nextInt();
		int age = 2025-year; 
		
		if (age <= 26 && age >= 20) {
			System.out.println("대학생");
		}
		else if(age >=17) {
			System.out.println("고등학생");
		}
		else if(age >=14) {
			System.out.println("중학생");
		}
		else if(age >=8) {
			System.out.println("초등학생");
		}
		else {//age<=7||age>=27
			System.out.println("학생이 아닙니다.");
		}
	}

}
