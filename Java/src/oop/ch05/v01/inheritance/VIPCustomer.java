package oop.ch05.v01.inheritance;

public class VIPCustomer extends Customer{

	/*
	 * 
	 * VIPCustomer 클래스
	 * 
	 *   - Customer 를 상속받아 구현하는 클래스
	 *   
	 *   - 기능
	 *   
	 *     - 단골고객으로 혜택이 더 다양해짐
	 *     - 제품 구매 시 10% 할인 (salesRatio)
	 *     - 보너스 포인트 5% 적립
	 *     - 담당 상담원 배정(agentID)
	 *     
	 *   - Customer 클래스와 유사하지만, 그보다 더 많은 속성과 기능이 필요 (salesRatio, agentID)
	 * 
	 */
	
	double salesRatio;
	private int agentID;
	
	public VIPCustomer() {
		
		customerGrade = "VIP"; // 상속하는 Customer 클래스의 customerGrade 라는 맴버변수가 private 접근 제어자를 갖기 때문에 바로 사용할 수 없다.
							   // 부모 클래스에서 외부 클래스에서는 사용을 못하지만 자식 클래스에서는 사용이 가능하도록 지정하는 protected 접근 제어자를 사용해야 한다.
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
	}
	
}
