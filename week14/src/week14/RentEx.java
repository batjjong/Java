package week14;

public class RentEx {

	public static void main(String[] args) {
		HouseAgency houseA = new HouseAgency();
		House myhome = houseA.rent();
		myhome.turnOnLight();
		
		CarAgency carA = new CarAgency();
		Car mycar = carA.rent();
		mycar.run();
		
		ToyAgency toyA = new ToyAgency();
		Toy mytoy = new Toy();
		mytoy.play();
	}

}
