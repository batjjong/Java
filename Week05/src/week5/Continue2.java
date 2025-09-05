package week5;

public class Continue2 {
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		for(int i = 1; i<=100;i++) {
			if(i%3==0) {
				num2 += i;
				continue;
			}
			num1+=i;
			System.out.println(i);
		}
		System.out.println(num1+" + "+num2+" = "+(int)(num1+num2));
	}
}
