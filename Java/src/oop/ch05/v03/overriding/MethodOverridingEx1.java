 package oop.ch05.v03.overriding;

public class MethodOverridingEx1 {

	/*
	 * 
	 * Ex1. 메서드 오버라이딩 (overriding)
	 * 
	 *   1.1 하위 클래스에서 메서드 재정의 하기
	 *   
	 *     1.1.1 오버라이딩 (overriding)
	 *     
	 *       - 상위 클래스에 정의된 메서드의 구현 내용이 하위 클래스에서 구현할 내용과 맞지 않는 경우
	 *         하위 클래스에서 동일한 이름의 메서드를 재정의할 수 있음
	 *     
	 *         
	 *     - 예제의 Customer 클래스의 calcPrice() 와 VIPCustomer 의 calcPrice() 구현 내용은
	 *       할인율과 보너스 포인트 적립 내용 부분의 구현이 다름
	 *     
	 *     - 따라서 VIPCustomer 클래스는 calcPrice() 메서드를 재정의 해야 함
	 *     
	 *     
	 *   1.2 형 변환과 오버라이딩 메서드 호출
	 *   
	 *     Customer vc = new VIPCustomer();
	 *     vc.calcPrice(10000);
	 *     
	 *     - 위 코드에서 calcPrice() 메서드는 어느 메서드가 호출될 것인가?
	 *      
	 *       -> 자바에서는 항상 "인스턴스(여기서는 VIPCustomer)의 메서드"가 호출된다. (가상 함수)
	 *     
	 * 
	 */
	
}
