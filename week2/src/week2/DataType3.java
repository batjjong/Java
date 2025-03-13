package week2;

public class DataType3 {
	public static void main(String[] args) {
		
		//char 데이터 타입
		//char 타입은 음수가 없다
		char cData1 = 'A';		//문자 리터럴을 직접 저장
		char cData2 = 65;		//10진수로 저장
		char cData3 = '\u0041';	//16진수로 저장
		System.out.println("cData1 = " + cData1);
		System.out.println("cData1 = " + cData2);
		System.out.println("cData1 = " + cData3);
		
		System.out.println();
		
		char cData4 = '가';
		char cData5 = 44032;
		char cData6 = '\uac00';
		System.out.println("cData1 = " + cData4);
		System.out.println("cData1 = " + cData5);
		System.out.println("cData1 = " + cData6);
		
		System.out.println();
		
		//char의 유니코드 값을 알고싶으면 int 변수에 저장해서 확인
		int iData1 = 'B';
		int iData2 = '하';
		int iData3 = '&';
		System.out.println("iData1 = " + iData1);
		System.out.println("iData2 = " + iData2);
		System.out.println("iData3 = " + iData3);
		
	}
}
