package oop.ch12.IO.v08.decoratorPattern.coffee;

public abstract class Decorator extends Coffee { // 모든 데코레이터의 상위 클래스

	Coffee coffee;
	
	public Decorator(Coffee coffee) {
		this.coffee = coffee;
	}

	@Override
	public void brewing() {
		
		coffee.brewing();
		
	}
	
}
