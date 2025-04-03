package week5;

import java.util.Scanner;

public class ScoreGrade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		while(true) {
			String grade;
			System.out.print("점수 입력 >> ");
			int score = sc.nextInt();
			if(score>=90) {
				grade = "A"; 
			}
			else if(score>=80) {
				grade = "B"; 
			}
			else if(score>=70) {
				grade = "C"; 
			}
			else if(score>=60) {
				grade = "D"; 
			}
			else {
				grade = "F";
			}
			System.out.println("Score      Grade");
			System.out.println("================");
			System.out.println(" "+score+"          "+grade);
		}
	}
}
