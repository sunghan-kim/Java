package oop.ch05.v02.inheritanceCasting;


public class CustomerTest2 {
	
	public static void main(String[] args) {
		
		Customer customerLee = new Customer(10010, "�̼���"); 
		customerLee.bonusPoint = 1000;
		
		System.out.println(customerLee.showCustomerInfo());
		
		// ������ ����ȯ�� �̿��� �ν��Ͻ� ����
		Customer customerKim = new VIPCustomer(10020, "������"); // customerKim�� Ÿ���� Customer �̹Ƿ�, ���� Ŭ����(Customer)�� ���� �� �޼��常 ��� �����ϴ�
		customerKim.bonusPoint = 10000;
		
		System.out.println(customerKim.showCustomerInfo());
		
		customerLee = customerKim; // ���� Ŭ������ Ÿ���� ���� Ŭ���� Ÿ������ �ڵ� ����ȯ(��ĳ����) �ȴ�.
		
	}
	
}
