package oop.ch05.v03.overriding;

public class OverridingTest {

	public static void main(String[] args) {
		
		Customer customerLee = new Customer(10010, "이순신");
		customerLee.bonusPoint = 1000;
		
		VIPCustomer customerKim = new VIPCustomer(10020, "김유신");
		customerKim.bonusPoint = 10000;
		
		int priceLee = customerLee.calcPrice(10000);
		int priceKim = customerKim.calcPrice(10000);
		
		System.out.println(customerLee.showCustomerInfo() + " 지불 금액은 " + priceLee + "원 입니다.");
		System.out.println(customerKim.showCustomerInfo() + " 지불 금액은 " + priceKim + "원 입니다.");
		
		// 업캐스팅을 통한 인스턴스 생성
		Customer customerNo = new VIPCustomer(10030, "나몰라");
		customerNo.bonusPoint = 10000;
		
		System.out.println(customerNo.showCustomerInfo() + " 지불 금액은 " + customerNo.calcPrice(10000) + "원 입니다."); 
		// 업캐스팅을 통해 생성된 객체의 calcPrice() 메서드는 VIPCustomer 클래스(인스턴스)의 메서드가 실행되었다.
		// 이를 "가상 함수(메서드)" 라고 한다.
		
	}
	
}
