package oop.ch05.v03.overriding;

public class OverridingTest {

	public static void main(String[] args) {
		
		Customer customerLee = new Customer(10010, "�̼���");
		customerLee.bonusPoint = 1000;
		
		VIPCustomer customerKim = new VIPCustomer(10020, "������");
		customerKim.bonusPoint = 10000;
		
		int priceLee = customerLee.calcPrice(10000);
		int priceKim = customerKim.calcPrice(10000);
		
		System.out.println(customerLee.showCustomerInfo() + " ���� �ݾ��� " + priceLee + "�� �Դϴ�.");
		System.out.println(customerKim.showCustomerInfo() + " ���� �ݾ��� " + priceKim + "�� �Դϴ�.");
		
		// ��ĳ������ ���� �ν��Ͻ� ����
		Customer customerNo = new VIPCustomer(10030, "������");
		customerNo.bonusPoint = 10000;
		
		System.out.println(customerNo.showCustomerInfo() + " ���� �ݾ��� " + customerNo.calcPrice(10000) + "�� �Դϴ�."); 
		// ��ĳ������ ���� ������ ��ü�� calcPrice() �޼���� VIPCustomer Ŭ����(�ν��Ͻ�)�� �޼��尡 ����Ǿ���.
		// �̸� "���� �Լ�(�޼���)" ��� �Ѵ�.
		
	}
	
}
