package oop.ch05.v03.overriding;

public class VIPCustomer extends Customer {

	double salesRatio;
	private int agentID;
	
	public VIPCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
	}

	// VIPCustomer 클래스의 경우 Customer 클래스와 달리 calcPrice 메서드에서 가격에 할인율을 적용하는 로직이 필요하다. 
	// 상위 클래스의 메서드와 다른 내용의 메서드를 하위 클래스에서 정의하기 위해 오버라이딩(overriding)을 통해 구현할 수 있다.
	// "마우스 우클릭 -> Source -> Override/Implement Methods" 에서 메서드를 override 할 수 있다.
	
	@Override // Annotation : 컴파일러에게 이 메서드는 Override 된 메서드라는 것을 전해준다.
	public int calcPrice(int price) {
		// TODO Auto-generated method stub
		
		// override 된 메서드의 선언부를 상위 클래스의 메서드와 다르게 하면 에러가 발생한다. 
		
		//return super.calcPrice(price); // 상위 클래스(super)의 원형을 호출한다.
		
		bonusPoint += price * bonusRatio;
		return price -= (int)(price * salesRatio); // 상위 클래스의 calcPrice 메서드와 달리 VIPCustomer 클래스의 calcPrice는 할인율을 적용한 가격을 반환 
		
	}
	
}
