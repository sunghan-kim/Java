package oop.ch05.v01.inheritance;

public class CustomerTest {

	/*
	 * 
	 * �׽�Ʈ �ó�����
	 * 
	 *   - �Ϲ� �� 1��� VIP �� 1���� ����
	 *   
	 *   - �Ϲ� �� ����
	 *   
	 *     - �̸� : �̼���
	 *     - ���̵� : 10010
	 *     - ���ʽ� ����Ʈ : 1000��
	 *     
	 *   - VIP �� ����
	 *   
	 *     - �̸� : ������
	 *     - ���̵� : 10020
	 *     - ���ʽ� ����Ʈ : 10000��
	 *     
	 *   - �� ���� �����ϰ� �̿� ���� �� ������ ���
	 * 
	 */
	
	public static void main(String[] args) {
		
		Customer customerLee = new Customer();
		customerLee.setCustomerID(10010);
		customerLee.setCustomerName("�̼���");
		customerLee.bonusPoint = 1000;
		
		System.out.println(customerLee.showCustomerInfo());
		
		VIPCustomer customerKim = new VIPCustomer();
		customerKim.setCustomerID(10020);
		customerKim.setCustomerName("������");
		customerKim.bonusPoint = 10000;
		
		System.out.println(customerKim.showCustomerInfo());
		
		System.out.println("========================================");
		
		
	}
	
}
