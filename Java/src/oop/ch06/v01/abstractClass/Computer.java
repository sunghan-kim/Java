package oop.ch06.v01.abstractClass;

public abstract class Computer { // 2. �߻� �޼��尡 �����ϱ� ������ abstract Ű���带 �̿��� �߻� Ŭ���� ����

	public abstract void display(); // 1. abstract Ű���带 �̿��� �߻� �޼��� ���� ("{}" �� �ۼ��ϸ� �����θ� �����ϴ� ���̱� ������ �ۼ����� �ʴ´�.)
	public abstract void typing(); 
	
	public void turnOn() {
		System.out.println("������ �մϴ�.");
	}  
	
	public void turnOff() {
		System.out.println("������ ���ϴ�.");
	}
	
	
	
}
