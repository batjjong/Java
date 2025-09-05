package week4;

public class RandomDice {
	public static void main(String[] args) {
		//랜덤 함수 : Math.random() 이용 -> 0.0~0.99999 사이 실수 반환
		double num = Math.random();
		System.out.println("랜덤숫자"+num);
		
		int number = (int)(num * 6 + 1);
		System.out.println(number);
	}
}
