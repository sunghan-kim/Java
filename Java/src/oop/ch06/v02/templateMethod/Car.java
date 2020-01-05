package oop.ch06.v02.templateMethod;

public abstract class Car {

	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("�õ��� �մϴ�.");
	}
	
	public void turnOff() {
		System.out.println("�õ��� ���ϴ�.");
	}
	
	// public abstract void washCar(); // ���� Ŭ������ �߻� �޼��带 �߰��ϸ� �ش� �߻� �޼��尡 ���ǵ��� ���� ���� Ŭ���� ��ο��� ������ �߻��Ѵ�. (������ �ʿ�)
	
	public void washCar() { // ������({})�� �־� �߻� �޼���� �ƴ�. ���� Ŭ���������� �ƹ��� ����� �����Ǿ� ���� ���� (���� Ŭ�������� ������ ���� ���� ����� �ϴ� �޼���)
		
	}
	
	final void run() { // ���ø� �޼��� : final Ű���带 ����Ͽ� �������� �� ���� ����
		startCar();
		drive();
		stop();
		turnOff();
		washCar();
	}
	
}
