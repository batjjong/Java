package week14;

public class ToyAgency implements Rentable{

	@Override
	public Object rent() {
		return new Toy();
	}

}
