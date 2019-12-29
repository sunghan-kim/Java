package oop.ch01.question.q2;

public class OrderTest {

	public static void main(String[] args) {
		
		Order order = new Order();
		
		order.orderNo = "201907210001";
		order.orderId = "abc123";
		order.orderDate = "2019년 7월 21일";
		order.orderName = "홍길순";
		order.productNo = "PD0345-12";
		order.orderAddress = "서울시 영등포구 여의도동 20번지";
		
		order.showOrderInfo();
		
	}
	
}
