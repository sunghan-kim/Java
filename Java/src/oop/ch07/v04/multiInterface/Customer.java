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

	// order() �߻� �޼����� ���, �����ϴ� Buy, Sell �������̽��� ������ �̸����� ���ǵǾ� �ִ�.
	//  - override �Ͽ� �����ص� �ǰ�, �������ص� �ȴ�.
	@Override
	public void order() {
		System.out.println("customer order");
	}

	public void sayHello() {
		System.out.println("hello");
	}
	
}
