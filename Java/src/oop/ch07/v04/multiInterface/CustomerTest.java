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
		//buyer.sell(); Buy 타입이므로 sell() 메서드 사용 불가능
		buyer.order(); // 인스턴스(Customer)의 order() 메서드 호출됨
		//buyer.sayHello(); Customer에서 구현된 sayHello() 메서드 사용 불가능
		
		System.out.println("=====================");
		
		
		Sell seller = new Customer();
		
		//seller.buy(); Sell 타입이므로 buy() 메서드 사용 불가능
		seller.sell();
		seller.order(); // 인스턴스(Customer)의 order() 메서드 호출됨
		//seller.sayHello(); Customer에서 구현된 sayHello() 메서드 사용 불가능
		
	}
	
}
