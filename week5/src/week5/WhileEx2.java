package week5;

import java.util.Scanner;

public class WhileEx2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num1 ,num2;
		
		while(true) {
			System.out.print("첫번째 숫자 : ");
			num1 = sc.nextInt();
			System.out.print("두번째 숫자 : ");
			num2 = sc.nextInt();
			
			System.out.printf("%d + %d = %d\n",num1,num2,num1+num2);
		}
	}
}
