package oop.ch05.v02.inheritanceCasting;

public class CustomerTest {
	
	public static void main(String[] args) {
		/*
		 * Customer customerLee = new Customer(); customerLee.setCustomerID(10010);
		 * customerLee.setCustomerName("�̼���"); customerLee.bonusPoint = 1000;
		 * 
		 * System.out.println(customerLee.showCustomerInfo());
		 */
		
		/*
		VIPCustomer customerKim = new VIPCustomer();
		customerKim.setCustomerID(10020);
		customerKim.setCustomerName("������");
		customerKim.bonusPoint = 10000;
		
		System.out.println(customerKim.showCustomerInfo());
		*/
		
		/*
		 * 
		 * ���� Ŭ������ Customer �� �������� �ʰ� ���� Ŭ������ VIPCustomer �� �����ߴµ��� ���������� �����Ѵ�.
		 * 
		 *   - ���� Ŭ������ �ν��Ͻ��� ������������ �ұ��ϰ�, ���� Ŭ������ �����ڰ� ���� ȣ��Ǵ� ���� Ȯ���� �� �ִ�.
		 *   - 
		 * 
		 */
		
		// ���� Ŭ������ �⺻ �����ڰ� �ƴ� �����ڸ� ��ӹ��� ���� Ŭ������ �ν��Ͻ� ����
		VIPCustomer customerKim = new VIPCustomer(10020, "������");
		customerKim.bonusPoint = 10000;
		
		System.out.println(customerKim.showCustomerInfo());
		
		
	}
	
}
