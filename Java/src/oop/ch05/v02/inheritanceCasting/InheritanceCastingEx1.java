package oop.ch05.v02.inheritanceCasting;

public class InheritanceCastingEx1 {

	/*
	 * 
	 * Ex1. 상속에서 클래스 생성 과정에서 형 변환
	 * 
	 *   1.1 하위 클래스가 생성되는 과정
	 *   
	 *     - 하위 클래스가 생성될 때 상위 클래스가 먼저 생성 됨
	 *     
	 *     - 상위 클래스의 생성자가 호출되고 하위 클래스의 생성자가 호출됨
	 *     - 하위 클래스의 생성자에서는 무조건 상위 클래스의 생성자가 호출되어야 함
	 *     
	 *     - 하위 클래스에서 상위 클래스의 생성자를 호출하는 코드가 없는 경우 컴파일러는 상위 클래스 기본 생성자를
	 *       호출하기 위한 super() 를 추가함
	 *       
	 *     - super() 로 호출되는 생성자는 상위 클래스의 기본 생성자임
	 *     
	 *     - 만약 상위 클래스의 기본 생성자가 없는 경우(매개변수가 있는 생성자만 존재하는 경우)
	 *       하위 클래스는 명시적으로 상위 클래스의 생성자를 호출해야 함
	 *       
	 *       
	 *   1.2 상속에서의 메모리 상태
	 *   
	 *     - 상위 클래스의 인스턴스가 먼저 생성됨
	 *     
	 *       - Customer() 생성자 호출
	 *         -> Customer 클래스의 맴버 변수가 힙 메모리에 생성됨
 	 *       
	 *     - 하위 클래스의 인스턴스가 생성 됨
	 *     
	 *       - VIPCustomer() 생성자 호출
	 *         -> VIPCustomer 클래스의 맴버 변수가 힙 메모리에 생성됨
	 *         
	 *         
	 *   1.3 상위 클래스로의 묵시적 형 변환 (업캐스팅)
	 *   
	 *     - 상위 클래스 형으로 변수를 선언하고 하위 클래스 인스턴스를 생성할 수 있음
	 *     - 하위 클래스는 상위 클래스의 타입을 내포하고 있으므로 상위 클래스로 묵시적 형변환이 가능함
	 *     - 상속 관계에서 모든 하위 클래스는 상위 클래스로 묵시적 형변환이 됨
	 *     - 그 역은 성립하지 않음
	 *     
	 *       Customer vc = new VIPCustomer();
	 *       
	 *          ^					^
	 *          |					|
	 *          
	 *      선언된 클래스형		생성된 인스턴스의 클래스형
	 *      (상위 클래스형)		(하위 클래스형)
	 * 
	 * 
	 *   1.4 형 변환에서의 메모리
	 *   
	 *     Customer vc = new VIPCustomer(); 에서 vc 가 가리키는 것은?
	 *     
	 *       - VIPCustomer() 생성자의 호출로 인스턴스는 모두 생성 되었지만
	 *         타입이 Customer 이므로 접근할 수 있는 변수나 메서드는 Customer의 변수와 메서드로 제한된다.
	 *         
	 *         
	 *   1.5 클래스 계층 구조가 여러 단계인 경우
	 *   
	 *     				포유류(Mammal)
	 *     					  ^
	 *     					  |
	 *     	    -----------------------------
	 *     		|							|
	 *     호랑이(Tiger)			영장류(Primate)
	 *     									^
	 *     									|
	 *     								인간(Human)
	 *     
	 *       - Human은 내부적으로 Primate와 Mammal의 자료형을 모두 내포하고 있음
	 *       
	 *         Primate aHuman = new Human();
	 *         Mammal mHuman = new Human();
	 *     
	 *         
	 * 
	 */
	
}
