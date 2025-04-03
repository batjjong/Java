package week5;

import java.util.Scanner;

public class ForScanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 : ");
		int num = sc.nextInt();
		
		for(int i=1; i<=9; i++) {
			System.out.println(num + " X " + i + " = " + num*i);
		}
		sc.close();
	}
}
