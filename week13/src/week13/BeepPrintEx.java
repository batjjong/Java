package week13;

public class BeepPrintEx {
	public static void main(String[] args) throws InterruptedException {
		//삐소리
		for(int i = 0; i < 5; i++) {
			System.out.println("삐~");
			Thread.sleep(1000);//1초
		}
			
		//***출력
		for(int i = 0; i < 5; i++) {
			System.out.println("***");
			Thread.sleep(1000);
		}
	}

}
