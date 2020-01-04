package oop.ch05.question.q1;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customerLee = new Customer(10010, "�̼���");
		customerLee.bonusPoint = 1000;
		
		VIPCustomer customerKim = new VIPCustomer(10020, "������");
		customerKim.bonusPoint = 10000;

		GoldCustomer customerGang = new GoldCustomer(10030, "������");
		customerGang.bonusPoint = 5000;
		
		// 10,000�� ¥�� ��ǰ ����
		customerLee.calcPrice(10000);
		customerKim.calcPrice(10000);
		customerGang.calcPrice(10000);
		
		System.out.println(customerLee.showCustomerInfo());
		System.out.println(customerKim.showCustomerInfo());
		System.out.println(customerGang.showCustomerInfo());
		
	}
	
}
