package oop.ch05.v01.inheritance;

public class CustomerTest2 {
	
	public static void main(String[] args) {
		/*
		 * Customer customerLee = new Customer(); customerLee.setCustomerID(10010);
		 * customerLee.setCustomerName("이순신"); customerLee.bonusPoint = 1000;
		 * 
		 * System.out.println(customerLee.showCustomerInfo());
		 */
		
		/*
		VIPCustomer customerKim = new VIPCustomer();
		customerKim.setCustomerID(10020);
		customerKim.setCustomerName("김유신");
		customerKim.bonusPoint = 10000;
		
		System.out.println(customerKim.showCustomerInfo());
		*/
		
		/*
		 * 
		 * 상위 클래스인 Customer 를 생성하지 않고 하위 클래스인 VIPCustomer 만 생성했는데도 정상적으로 동작한다.
		 * 
		 *   - 하위 클래스의 인스턴스만 생성했음에도 불구하고, 상위 클래스의 생성자가 먼저 호출되는 것을 확인할 수 있다.
		 *   - 
		 * 
		 */
		
		// 상위 클래스의 기본 생성자가 아닌 생성자를 상속받은 하위 클래스의 인스턴스 생성
		VIPCustomer2 customerKim = new VIPCustomer2(10020, "김유신");
		customerKim.bonusPoint = 10000;
		
		System.out.println(customerKim.showCustomerInfo());
		
		
	}
	
}
