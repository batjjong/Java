package week13;

public class BeepThreadEx {

	public static void main(String[] args) throws InterruptedException {
		//main메소드 ->main스레드
		
		//작업스레드 생성 및 실행
		BeepThread thread = new BeepThread();
		thread.start();
		
		//main에서 하는 작업
		for(int i = 0; i < 5; i++) {
			System.out.println("삐~");
			Thread.sleep(1000);//1초
		}
	}

}
