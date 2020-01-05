package oop.ch07.v01.interfaceBasic;

public interface Calc {

	// 인터페이스에서 선언한 변수는 컴파일 과정에서 상수로 변환됨 (abstract 키워드를 지정하지 않아도 된다.)
	double PI = 3.14;
	int ERROR = -999999999;
	
	// 인터페이스에서 선언한 메서드는 컴파일 과정에서 추상 메서드로 변환됨 (abstract 키워드를 지정하지 않아도 된다.)
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	/*
	 * 
	 *   "메서드를 선언할 수 있다"는 말의 의미
	 *   
	 *     - 반환값(String), 함수(메서드)의 이름(stringAdd), 매개변수(s1, s2) 의 3가지 요소를 "함수의 signature" 라고 한다.
	 *     
	 *     - "메서드를 선언할 수 있다" 라는 것은 함수의 시그니처들을 이용하여 메서드가 어떻게 구현될 지에 대한 아이디어가 있다는 것을 의미한다.  
	 * 
	 */
	
}
