package week6;

public class ArrayEx2 {
	public static void main(String[] args) {
		//길이가 10인 정수타입의 배열을 선언
		int[] score = new int[10];
		int sum = 0;
		System.out.println("랜덤 생성 된 점수 배열");
		//각 배열 값에 랜덤하게 생성된 점수(0~99)
		for(int i=0; i<score.length; i++) {
			score[i] = (int)(Math.random()*100);
			System.out.printf("score[%d] = %d\n",i,score[i]);
			sum+=score[i];
		}
		System.out.println(sum);
		double ave = (double)sum/score.length;
		System.out.println(ave);
	}
}
