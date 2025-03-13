package week2;

public class ProductPrice {
	public static void main(String[] args) {
		
		
		int count = 7;
		int totalprice = 5700;
		
		double aprice = (double)totalprice / count;
		
		System.out.printf("구매수량 : %d개\n", count);
		System.out.printf("총 구매 금액 : %d개\n", totalprice);
		System.out.printf("상품 단가 : %.1f원", aprice);
	}
}
