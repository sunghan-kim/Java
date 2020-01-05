package oop.ch06.v01.abstractClass;

public class DeskTop extends Computer { // 1.추상 메서드를 가지고 있는 Computer 클래스를 상속 받음

	// 2. 추상 메서드를 구현하라는 경고 메세지가 나타난다. (Add unimplemented methods)
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("DeskTop display");
	}

	@Override
	public void typing() {
		// TODO Auto-generated method stub
		System.out.println("DeskTop typing");
		
	}

	// 3. 추상 메서드를 구현하는 대신 DeskTop 클래스를 abstract 키워드를 사용하여 추상 클래스로 지정해도 된다. (Make type 'DeskTop' abstract)
	//  - 또한, 모든 추상 메서드를 구현하고 싶지 않을 때에도, 구현하고 싶은 추상 메서드를 구현하고, 해당 클래스에 abstract 키워드를 사용하여 추상 클래스로 지정해야 한다.
	
	
	// 4. 상위 클래스에 구현된 메서드도 하위 클래스에서 오버라이딩(overriding)하여 구현할 수 있다.
	@Override
	public void turnOff() {
		System.out.println("deskTop turnoff");
	} 
	
	
}
