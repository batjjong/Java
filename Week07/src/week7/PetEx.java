package week7;

public class PetEx {

	public static void main(String[] args) {
		
		Pet pet = new Pet("바둑이","강아지",3);
		System.out.println("이름:"+pet.name);
		System.out.println("종류:"+pet.type);
		System.out.println("나이:"+pet.age+"살");
		System.out.println("색상:"+pet.color);
		System.out.println();
		
		Pet pet2 = new Pet("구름","강아지",2,"흰색");		
		System.out.println("이름:"+pet2.name);
		System.out.println("종류:"+pet2.type);
		System.out.println("나이:"+pet2.age+"살");
		System.out.println("색상:"+pet2.color);
		System.out.println();
		
	}
}
