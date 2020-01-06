package oop.ch07.v03.interfaceComponents;

public interface Calc {

	double PI = 3.14;
	int ERROR = -999999999;
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	// 디폴트 메서드
	default void description() {
		System.out.println("점수 계산기를 구현합니다.");
		
		// private method를 디폴트 메서드에서 사용
		//myMethod();
		
	}
	
	// 정적(static) 메서드 : 디폴트 메서드 또한 인스턴스로 생성해서 사용해야 하는데 반해, static 메서드의 경우 인스턴스 생성 없이 인터페이스 타입으로 바로 사용 가능
	static int total(int[] arr) {
		int total = 0;
		
		for (int i : arr) {
			total += i;
		}
		
		// private static 메서드를 static 메서드 내부에서 사용 가능
		//mystaticMethod();
		
		return total;
		
		
		
	}
	
	// private 메서드 (java 9 부터 기능 제공)
	/*
	private void myMethod() {
		System.out.println("private Method");
	}
	*/
	
	// private static 메서드는 static 메서드 안에서 사용할 수 있다.
	/*
	private static void mystaticMethod() {
		System.out.println("private static method");
	}
	*/
	
}
