package oop.ch07.v01.interfaceBasic;

public abstract class Calculator implements Calc { // 인터페이스를 상속받는 경우, extends 키워드 대신 implements 키워드를 사용한다.

	// Calc 인터페이스를 "구현"한 클래스 (Calc.interface <- - - - - Calculator.java, 점선으로 표현)
		
	// Calc 인터페이스의 추상 메서드 중 일부를 구현한 클래스로서, 추상 클래스이다.
	
	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int substract(int num1, int num2) {
		return num1 - num2;
	}

	// Calc 인터페이스의 4개의 추상 메서드 중에 2개만 해당 클래스에서 구현하였으므로, 해당 클래스는 추상 클래스로 지정되어야 한다.
	
	
}
