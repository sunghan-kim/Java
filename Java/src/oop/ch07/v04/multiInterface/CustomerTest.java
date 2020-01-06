package oop.ch07.v04.multiInterface;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		
		customer.buy();
		customer.sell();
		customer.order();
		customer.sayHello();
		
		System.out.println("=====================");
		
		
		Buy buyer = new Customer();
		
		buyer.buy();
		//buyer.sell(); Buy Ÿ���̹Ƿ� sell() �޼��� ��� �Ұ���
		buyer.order(); // �ν��Ͻ�(Customer)�� order() �޼��� ȣ���
		//buyer.sayHello(); Customer���� ������ sayHello() �޼��� ��� �Ұ���
		
		System.out.println("=====================");
		
		
		Sell seller = new Customer();
		
		//seller.buy(); Sell Ÿ���̹Ƿ� buy() �޼��� ��� �Ұ���
		seller.sell();
		seller.order(); // �ν��Ͻ�(Customer)�� order() �޼��� ȣ���
		//seller.sayHello(); Customer���� ������ sayHello() �޼��� ��� �Ұ���
		
	}
	
}
