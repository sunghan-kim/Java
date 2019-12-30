package oop.ch03.v02.singletonPattern;

public class Company {

	private static Company instance = new Company(); // 2. 내부에서 인스턴스 생성
	
	private Company() {} // 1. private 생성자 (이렇게 하면 컴파일러가 자동으로 생성자를 만들 지 않는다.)
	
	// 3. 외부 클래스에서 Comany 인스턴스를 사용할 수 있는 get 메서드 생성
	//  - 이 메서드를 일반 메서드로 만들게 되면 외부 클래스에서는 인스턴스를 생성하지 못하므로 해당 메서드를 사용할 수 없다.
	//  - 그러므로 해당 메서드는 static 메서드로 생성해야 한다.
	public static Company getInstance() {
		if (instance == null) {
			instance = new Company();
		}
		return instance;
	}
	
}
