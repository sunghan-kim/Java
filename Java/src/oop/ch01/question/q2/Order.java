package oop.ch01.question.q2;

public class Order {

	String orderNo;
	String orderId;
	String orderDate;
	String orderName;
	String productNo;
	String orderAddress;
	
	public void showOrderInfo() {
		
		   System.out.println("�ֹ� ��ȣ : " +  orderNo);
		   System.out.println("�ֹ��� ���̵� : " +  orderId); 
		   System.out.println("�ֹ� ��¥ : " +  orderDate);
		   System.out.println("�ֹ��� �̸� : " +  orderName); 
		   System.out.println("�ֹ� ��ǰ ��ȣ : " +  productNo); 
		   System.out.println("��� �ּ� : " +  orderAddress); 
		
	}
	
}
