package week3;

public class ProductPrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int milk = 4500;
		milk*=1;
		int carrot = 1000;
		carrot*=3;
		int cookie = 1500;
		cookie*=2;
		double total = milk+carrot+cookie;
		double sale = total/10;
		double result = total-sale;
		
		System.out.println("할인 전 상품가격: "+total+"원");
		
		System.out.println("할인 가격: "+sale+"원");
		
		System.out.println("최종 결제 금액: "+result+"원");
		
	}

}
