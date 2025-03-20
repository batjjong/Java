package week3;

public class TwoOperand1 {
	public static void main(String[] args) {
		//이항연산자 : 문자열의 +연산자=> 문자열의 연결
		String str1 ="JDK"+6.0;
		String str2 = str1 + "특징";
		System.out.println(str2);
		//문자열이 먼저오면 뒤에 연산이 문자열 연산이 됨
		String str3 = "JDK" + 3 + 3.0;
		System.out.println(str3);
		//숫자가 먼저오면 연산 후 문자열 연산됨
		String str4 = 3 + 3.0 + "JDK";
		System.out.println(str4);
	}
}