package oop.ch05.v02.inheritanceCasting;


public class CustomerTest2 {
	
	public static void main(String[] args) {
		
		Customer customerLee = new Customer(10010, "이순신"); 
		customerLee.bonusPoint = 1000;
		
		System.out.println(customerLee.showCustomerInfo());
		
		// 묵시적 형변환을 이용한 인스턴스 생성
		Customer customerKim = new VIPCustomer(10020, "김유신"); // customerKim의 타입이 Customer 이므로, 상위 클래스(Customer)의 변수 및 메서드만 사용 가능하다
		customerKim.bonusPoint = 10000;
		
		System.out.println(customerKim.showCustomerInfo());
		
		customerLee = customerKim; // 하위 클래스의 타입은 상위 클래스 타입으로 자동 형변환(업캐스팅) 된다.
		
	}
	
}
