package week5;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("메세지 입력하세요");
		System.out.println("q를 누르면 종료");
		String Str;
		
		do {
			System.out.print(">> ");
			Str = sc.nextLine();	 //
			System.out.println(Str);
		}while(!Str.equals("q"));    //숫자값은 ==으로 문자열은 equals로 비교
	System.out.println("종료되었습니다");
		
	sc.close();
	}
	
}
