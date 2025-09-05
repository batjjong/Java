package week4;

import java.util.Scanner;

public class DiscountCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("가격:");
		int price = sc.nextInt();
		int sale=0;
		int salePrice=0;
		if(price >=100000) {
			salePrice = price * 9 / 10;
			sale = 10;
		}
		else if(price >=50000) {
			salePrice = price * 95 / 100;
			sale = 5;
		}
		System.out.println("원가 "+price+"원");
		System.out.println("할인율 "+sale+"%");
		System.out.println("최종 "+salePrice+"원");
	}

}
