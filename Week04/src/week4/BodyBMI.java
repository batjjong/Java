package week4;

import java.util.Scanner;

public class BodyBMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		String name = sc.next();
		System.out.print("키를 입력하세요 : ");
		int height = sc.nextInt();
		System.out.print("몸무게를 입력하세요 : ");
		int weight = sc.nextInt();
		
		double mheight = height/100.0;
		System.out.println(mheight);
		double bmi = weight / (mheight*mheight);
		
		System.out.println(name+"님의 키는 "+height+"cm이고 몸무게는"+weight+"kg입니다.");
		System.out.println("BMI지수는 "+bmi+"입니다.");
		
		String result = "";
		
		if(bmi>=30.0) {
			System.out.println("고도비만");
		}
		else if(bmi>=25.0) {
			System.out.println("과체중");
		}
		else if(bmi>=23.0) {
			System.out.println("정상");
		}
		else {
			System.out.println("저체중");
		}
				
	}

}
