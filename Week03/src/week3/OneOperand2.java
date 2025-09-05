package week3;

public class OneOperand2 {

	public static void main(String[] args) {
		// 단항연산자 : 증감 연산자(++,--)
		int x=10;
		int y=10;
		int z;
		
		//++연산자:피연산자의 기존값에 1을 더해준다.
		//++기호가 앞에 있는경우:먼저 1을 더하고 명령 실행
		System.out.println("++x="+ ++x); //x = 11
		System.out.println();
		//++기호가 뒤에 있는경우:먼저 실행하고 1을 더함
		System.out.println("x++="+ x++); //x = 11
		System.out.println("x++="+ x++); //x = 12
		System.out.println();
		
		z = x++;
		System.out.println("z="+ z); //z = 13
		System.out.println("x="+ x); //x = 14
		System.out.println();
		
		z = ++x + y--;
		System.out.println("x="+ x);	//15
		System.out.println("y="+ y);	//9
		System.out.println("z="+ z);	//25
	}

}
