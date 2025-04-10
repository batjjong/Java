package week6;

import java.util.Scanner;

public class ArrayEx4 {
	public static void main(String[] args) {
		String[] student = {"홍길동","이순신","강감찬","고길동","김철수"};
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하시오 >> ");
		String name = sc.next();
		
		//학생 존재 여부 저장 변수
		boolean found = false;
		
		for(int i=0; i<student.length; i++) {
			if(student[i].equals(name)) {
				
				found = true;
				break;
			}
			
		}
		if (found)
			System.out.println(name +" 있습니다");
		else {
			System.out.println("없음");
		}
		
	}
}
