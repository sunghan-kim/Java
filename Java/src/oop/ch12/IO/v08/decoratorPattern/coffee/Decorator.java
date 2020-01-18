package oop.ch12.IO.v08.decoratorPattern.coffee;

public abstract class Decorator extends Coffee { // ��� ���ڷ������� ���� Ŭ����

	Coffee coffee;
	
	public Decorator(Coffee coffee) {
		this.coffee = coffee;
	}

	@Override
	public void brewing() {
		
		coffee.brewing();
		
	}
	
}
