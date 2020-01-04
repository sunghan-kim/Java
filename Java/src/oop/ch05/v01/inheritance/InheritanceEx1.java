package oop.ch05.v01.inheritance;

public class InheritanceEx1 {

	/*
	 * 
	 * 클래스에서 상속의 의미
	 * 
	 *   - 상속 : 객체 지향 언어의 특징
	 *   - 새로운 클래스를 정의할 때 이미 구현된 클래스를 "상속(inheritance)" 받아서 속성이나 기능이 확장되는 클래스를 구현함
	 *   - 상속을 "코드의 재사용" 이라고 이해하는 것은 올바르지 않다.
	 *   
	 *   - 상속하는 클래스
	 *     : 상위 클래스, parent class, base class, super class
	 *   - 상속받는 클래스
	 *     : 하위 클래스, child class, derived class, sub class
	 *     
	 *   - 클래스 상속 문법
	 *   
	 *     class B extends A {
	 *     
	 *     }
	 *     
	 *     - extends 키워드 뒤에는 하나의 클래스만 올 수 있다. (다중 상속 불가,, C++ 언어와의 차이)
	 *     
	 *     -> A 클래스가 B 클래스에게 상속한다.
	 *      = B 클래스가 A 클래스를 상속받는다.
	 *      
	 *   - 클래스 상속 화살표 표현
	 *   
	 *     : 상속받는 클래스(B)에서 상속하는 클래스(A)를 향하게 실선 화살표를 나타내고, 화살표의 삼각형은 비어 있다.
	 * 
	 * 
	 * 상속을 사용하는 경우
	 * 
	 *   - 상위 클래스는 하위 클래스 보다 일반적인 개념과 기능을 가짐
	 *   - 하위 클래스는 상위 클래스 보다 구체적인 개념과 기능을 가짐
	 *   
	 *    ex) 상위 클래스 : 포유류
	 *    
	 *          class Mammal {
	 *         
	 *          }
	 *      
	 *        하위 클래스 : 사람
	 *        
	 *          class Human extends Mammal {
	 *          
	 *          }
	 *          
	 *   - extends 뒤에는 단 하나의 class만 사용할 수 있음 (자바는 single inheritance만을 지원함)
	 *   
	 * 
	 */
	
}
