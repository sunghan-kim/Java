package oop.ch01.question.q2;

public class OrderTest {

	public static void main(String[] args) {
		
		Order order = new Order();
		
		order.orderNo = "201907210001";
		order.orderId = "abc123";
		order.orderDate = "2019�� 7�� 21��";
		order.orderName = "ȫ���";
		order.productNo = "PD0345-12";
		order.orderAddress = "����� �������� ���ǵ��� 20����";
		
		order.showOrderInfo();
		
	}
	
}
