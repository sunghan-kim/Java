package oop.ch07.v04.multiInterface;

public class Customer implements Buy, Sell {

	@Override
	public void sell() {
		System.out.println("customer sell");
	}

	@Override
	public void buy() {
		System.out.println("customer buy");
	}

	// order() 추상 메서드의 경우, 구현하는 Buy, Sell 인터페이스에 동일한 이름으로 정의되어 있다.
	//  - override 하여 정의해도 되고, 재정의해도 된다.
	@Override
	public void order() {
		System.out.println("customer order");
	}

	public void sayHello() {
		System.out.println("hello");
	}
	
}
