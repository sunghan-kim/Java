package oop.ch06.v01.abstractClass;

public class ComputerTest {

	public static void main(String[] args) {
		
		//Computer computer = new Computer(); // 추상 클래스는 new를 사용해 인스턴스화할 수 없다.
		Computer computer = new DeskTop(); // 묵시적 형변환(업캐스팅)을 이용해 Computer 타입의 DeskTop 인스턴스를 생성할 수 있다.
		computer.display();
		computer.turnOff(); // 기본적으로는 상위 클래스에 있는 메서드 호출 
							// 하위 클래스에서 해당 메서드를 오버라이딩(overriding)했다면 하위 클래스의 메서드가 호출된다.
		
		Computer myNoteBook = new MyNoteBook();
		myNoteBook.typing();
		
	}

}
