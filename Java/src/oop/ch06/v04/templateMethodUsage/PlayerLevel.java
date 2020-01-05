package oop.ch06.v04.templateMethodUsage;

public abstract class PlayerLevel {

	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void showLevelMessage();
	
	//public abstract void fly(); // ���ο� �߻� �޼��带 �����ϸ� �ش� Ŭ������ ��ӹ޴� ��� ���� Ŭ�����鿡���� �� �޼��带 �����ؾ� �Ѵ�.
	
	final public void go(int count) {
		
		run();
		
		for (int i=0; i < count; i++) {
			jump();
		}
		
		turn();
		
	}
	
}
