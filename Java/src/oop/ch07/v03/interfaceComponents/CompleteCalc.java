package oop.ch07.v03.interfaceComponents;

public class CompleteCalc extends Calculator {

 	@Override
	public int times(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		if ( num2 == 0 ) {
			return ERROR;
		}
		return num1 / num2;
	}

	public void showInfo() {
		System.out.println("모두 구현하였습니다.");
	}

	
	// 디폴트 메서드를 override 할 수 있다.
	@Override
	public void description() {
		System.out.println("재정의한 description");
	}
	
	
}
