package oop.ch01.question.q2;

public class Order {

	String orderNo;
	String orderId;
	String orderDate;
	String orderName;
	String productNo;
	String orderAddress;
	
	public void showOrderInfo() {
		
		   System.out.println("주문 번호 : " +  orderNo);
		   System.out.println("주문자 아이디 : " +  orderId); 
		   System.out.println("주문 날짜 : " +  orderDate);
		   System.out.println("주문자 이름 : " +  orderName); 
		   System.out.println("주문 상품 번호 : " +  productNo); 
		   System.out.println("배송 주소 : " +  orderAddress); 
		
	}
	
}
