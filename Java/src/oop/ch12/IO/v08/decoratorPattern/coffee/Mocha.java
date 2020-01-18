package oop.ch12.IO.v08.decoratorPattern.coffee;

public class Mocha extends Decorator {

	public Mocha(Coffee coffee) {
		super(coffee);
	}

	public void brewing() {
		super.brewing();
		System.out.print("Adding Mocha Syrup ");
	}
	
}
