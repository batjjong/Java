package week4;

public class IfNested {
	public static void main(String[] args) {
		int score = (int)(Math.random()*100+1);
		String grade;
		if (score >= 90) {
			if (score > 95) {
				grade = "A+";
			}
			else if(score > 93) {
				grade = "A0";
			}
			else {
				grade = "A-";
			}
		}
		
		else if (score >= 80) {
			if (score > 85) {
				grade = "B+";
			}
			else if(score > 83) {
				grade = "B0";
			}
			else {
				grade = "B-";
			}
		}
		
		else {
			grade = "C";
		}
		
		System.out.println("score = "+score);
		System.out.println("grade = "+grade);
	}
}
