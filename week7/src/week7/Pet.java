package week7;

public class Pet {
	
	String name;
	String type;
	int age;
	String color;
	
	Pet(String name,String type){
		this.name = name;
		this.type = type;
		this.age = 0;
		this.color = "미정";
	}
	
	Pet(String name,String type,int age,String color){
		this.name = name;
		this.type = type;
		this.age = age;
		this.color = color;
	}
}
