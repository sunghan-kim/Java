package oop.ch07.v01.interfaceBasic;

public class CompleteCalc extends Calculator { // Calc 인터페이스의 추상 메서드 중 일부가 구현된 Calcuator 추상 클래스를 상속 받는다.

	// Calc 인터페이스의 모든 추상 메서드를 구현한 클래스로서, 추상 클래스가 아니다.
	
	@Override
	public int times(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		if ( num2 == 0 ) {
			return ERROR; // ERROR : Calc 인터페이스에서 정의된 상수
		}
		return num1 / num2;
	}

	// Calc 인터페이스에서 선언된 4개의 추상 메서드 중 2개의 추상 메서드(add, substract)를 Calculator 추상 클래스에서 정의했으므로
	// CompleteCalc 클래스에서 Calculator 추상 클래스를 상속하게 되면, 아직 구현되지 않은 2개의 추상 메서드(times, divide)를 해당 클래스에서 구현하게 된다.
	
	
	public void showInfo() {
		System.out.println("모두 구현하였습니다.");
	}
	
}
