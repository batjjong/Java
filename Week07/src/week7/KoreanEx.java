package week7;

public class KoreanEx {
	public static void main(String[] args) {
		Korean k1 = new Korean("홍길동","012345-1234567", "010-1234-5678");
		System.out.println(k1.nation);
		System.out.println(k1.name);
		System.out.println(k1.ssn);
		System.out.println(k1.phone);
		System.out.println();
		
		Korean k2 = new Korean("이순신","010101-0123456","010-0000-1111");
		System.out.println(k2.nation);
		System.out.println(k2.name);
		System.out.println(k2.ssn);
		System.out.println(k2.phone);
		System.out.println();
	}
}
