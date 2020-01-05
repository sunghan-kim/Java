package oop.ch06.v02.templateMethod;

public abstract class Car {

	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	// public abstract void washCar(); // 상위 클래스에 추상 메서드를 추가하면 해당 추상 메서드가 정의되지 않은 하위 클래스 모두에게 에러가 발생한다. (버전업 필요)
	
	public void washCar() { // 구현부({})가 있어 추상 메서드는 아님. 상위 클래스에서는 아무런 기능이 구현되어 있지 않음 (하위 클래스에서 구현을 했을 때만 기능을 하는 메서드)
		
	}
	
	final void run() { // 템플릿 메서드 : final 키워드를 사용하여 재정의할 수 없게 지정
		startCar();
		drive();
		stop();
		turnOff();
		washCar();
	}
	
}
