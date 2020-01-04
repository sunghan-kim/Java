package oop.ch05.v01.inheritance;

public class VIPCustomer2 extends Customer2{

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
	
	/*
	public VIPCustomer() {
		
		//super(); // super() 는 상위 클래스의 메모리 위치를 나타낸다. 즉, 상위 클래스의 기본 생성자가 호출됨
			     // 이 super() 라는 코드를 직접 작성하지 않아도 pre-compile 단계에서 자동으로 생성된다.
		
		// 상위 클래스의 기본 생성자가 없는 경우에는 super() 를 통해 불러올 수 없으므로 아래와 같이 상위 클래스의 생성자를 호출해야 한다.
		//super(0, "");
		
		customerGrade = "VIP"; // 상속하는 Customer 클래스의 customerGrade 라는 맴버변수가 private 접근 제어자를 갖기 때문에 바로 사용할 수 없다.
							   // 부모 클래스에서 외부 클래스에서는 사용을 못하지만 자식 클래스에서는 사용이 가능하도록 지정하는 protected 접근 제어자를 사용해야 한다.
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
		System.out.println("VIPCustomer() 생성자 호출");
		
	}
	*/
	
	public VIPCustomer2(int customerID, String customerName) { // 기본 생성자가 없는 상위 클래스의 생성자를 호출할 때 이와 같은 방법으로 호출할 수도 있다.
		super(customerID, customerName);
		
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
		System.out.println("VIPCustomer(int, String) 생성자 호출");
		
	}
	
	
	
}
