package week6;

public class Reference1 {

	public static void main(String[] args) {
		//기본데이터 타입 변수는 스택 영역에 값과 같이 저장
		int iVal1 = 100;
		int iVal2 = 200;
		System.out.println("iVal1==iVal2 : "+ (iVal1 == iVal2 ? true : false));
		
		//참조타입  변수는 스택영역에 저장
		//해당 객페 값은 힙영역에 저장
		//객체 주소가 스책에 있는 변수에 저장
		//문자열 리터럴은 값이 동일하면 같은 주소를 공유
		//String:가장대표적인 클래스 타입
		String sVal1 = "Java";
		String sVal2 = "Java";
		System.out.println("sVal1==sVal2 : " + (sVal1 == sVal2 ? true : false));
		
		//주소값이 다름
		String sVal3 = new String("Java");
		String sVal4 = new String("Java");
		System.out.println("sVal3==sVal4 : " + (sVal3 == sVal4 ? true : false));
		
		//참조변수가 null 값을 가지면 해당 객체는 힙영역에 생성하지 않음
		String sVal5 = null; //NullPointerException주의
		//System.out.println("sVal5.Length = " + sVal5.length());
		sVal5 = "Java";
		System.out.println("sVal1==sVal5 : " + (sVal1 == sVal5 ? true : false));
		
		//String객체가 동일한 문자열을 가지고 있는지 비교할 경우에는 
		//반드시 equals() 메소드 사용
		if(sVal4.equals(sVal4))
			System.out.println("sVal3과 sVal4의 문자열은 같다.");
		else
			System.out.println("sVal3과 sVal4의 문자열은 다르다.");
		
	}

}
