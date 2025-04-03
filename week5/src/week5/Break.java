package week5;

public class Break {
	public static void main(String[] args) {
		
		while(true) {
			int ran = (int)(Math.random()*10);
			System.out.printf("랜덤숫자 : %d\n",ran);
			if(ran == 7) {
				System.out.println("프로그램 종료");
				break;
			}
		}
	}
}
