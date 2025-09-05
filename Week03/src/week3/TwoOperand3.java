package week3;

public class TwoOperand3 {

	public static void main(String[] args) {
		// 비트연산자 : &(AND), |(OR), ^
		//2진수 연산
		byte num1 = 45;
		byte num2 = 25; 
		int result = num1 & num2;
		
		System.out.println("num1 = "+num1);
		System.out.println("num2 = "+num2);
		System.out.println("result = " + result);
		System.out.println();
		
		// &(and)
		System.out.printf("num1   = %6s\n", Integer.toBinaryString(num1));
		System.out.printf("num2   = %6s\n", Integer.toBinaryString(num2));
		System.out.printf("result = %6s\n", Integer.toBinaryString(result));
		System.out.println();
		
		// |(or)
		result = num1 | num2;
		System.out.printf("num1   = %6s\n", Integer.toBinaryString(num1));
		System.out.printf("num2   = %6s\n", Integer.toBinaryString(num2));
		System.out.printf("result = %6s\n", Integer.toBinaryString(result));
		System.out.println();
		
		//^
		result = num1 ^ num2;
		System.out.printf("num1   = %6s\n", Integer.toBinaryString(num1));
		System.out.printf("num2   = %6s\n", Integer.toBinaryString(num2));
		System.out.printf("result = %6s\n", Integer.toBinaryString(result));
		System.out.println();
	}

}
