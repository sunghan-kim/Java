package oop.ch05.question.q1;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customerLee = new Customer(10010, "이순신");
		customerLee.bonusPoint = 1000;
		
		VIPCustomer customerKim = new VIPCustomer(10020, "김유신");
		customerKim.bonusPoint = 10000;

		GoldCustomer customerGang = new GoldCustomer(10030, "강감찬");
		customerGang.bonusPoint = 5000;
		
		// 10,000원 짜리 상품 구매
		customerLee.calcPrice(10000);
		customerKim.calcPrice(10000);
		customerGang.calcPrice(10000);
		
		System.out.println(customerLee.showCustomerInfo());
		System.out.println(customerKim.showCustomerInfo());
		System.out.println(customerGang.showCustomerInfo());
		
	}
	
}
