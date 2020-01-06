package oop.ch07.v05.interfaceInheritance;

public class InterfaceInheritanceEx1 {

	/*
	 * 
	 *   1. 인터페이스 상속
	 *   
	 *     - 인터페이스 간에도 상속이 가능하다.
	 *     
	 *     - 구현이 없으므로 extends 뒤에 여러 인터페이스를 상속받을 수 있다.
	 *     
	 *     - 구현 내용이 없으므로 "타입 상속(type inheritance)" 라고 한다. 
	 *     
	 *     
	 *       	  X (interface)			     Y (interface)
	 *             x() (abstract method)	   y() (abstract method)
	 *       	  ^							 ^
	 *       	  |							 |
	 *       	  |							 |
	 *            ----------------------------
	 *            				|
	 *            				|
	 *            			MyInterface (interface)
	 *            			  myMethod()  (abstract method)
	 *            				^
	 *            				|
	 *            				| implements
	 *            				|     
	 *            			MyClass
	 *            
	 *           
	 *            
	 */
	
}
