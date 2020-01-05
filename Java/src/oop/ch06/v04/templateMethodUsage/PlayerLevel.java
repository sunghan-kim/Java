package oop.ch06.v04.templateMethodUsage;

public abstract class PlayerLevel {

	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void showLevelMessage();
	
	//public abstract void fly(); // 새로운 추상 메서드를 생성하면 해당 클래스를 상속받는 모든 하위 클래스들에서는 이 메서드를 구현해야 한다.
	
	final public void go(int count) {
		
		run();
		
		for (int i=0; i < count; i++) {
			jump();
		}
		
		turn();
		
	}
	
}
