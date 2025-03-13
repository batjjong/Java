package week2;

public class PersonInfo {
	public static void main(String[] args) {
		String name = "윤종현";
		int age = 23;
		double height = 171.0;
		char gender = 'M';
		boolean stu = true;
		
		System.out.println("이름: " + name);
		System.out.println("나이: " + age + "세");
		System.out.printf("키: %.1fcm\n", height);
		System.out.printf("성별: %c\n", gender);
		System.out.printf("학생 여부: %b", stu);
	}
}
