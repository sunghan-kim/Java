package oop.ch05.v01.inheritance;

public class CustomerTest {

	/*
	 * 
	 * 테스트 시나리오
	 * 
	 *   - 일반 고객 1명과 VIP 고객 1명이 있음
	 *   
	 *   - 일반 고객 정보
	 *   
	 *     - 이름 : 이순신
	 *     - 아이디 : 10010
	 *     - 보너스 포인트 : 1000점
	 *     
	 *   - VIP 고객 정보
	 *   
	 *     - 이름 : 김유신
	 *     - 아이디 : 10020
	 *     - 보너스 포인트 : 10000점
	 *     
	 *   - 두 고객을 생성하고 이에 대한 고객 정보를 출력
	 * 
	 */
	
	public static void main(String[] args) {
		
		Customer customerLee = new Customer();
		customerLee.setCustomerID(10010);
		customerLee.setCustomerName("이순신");
		customerLee.bonusPoint = 1000;
		
		System.out.println(customerLee.showCustomerInfo());
		
		VIPCustomer customerKim = new VIPCustomer();
		customerKim.setCustomerID(10020);
		customerKim.setCustomerName("김유신");
		customerKim.bonusPoint = 10000;
		
		System.out.println(customerKim.showCustomerInfo());
		
		System.out.println("========================================");
		
		
	}
	
}
