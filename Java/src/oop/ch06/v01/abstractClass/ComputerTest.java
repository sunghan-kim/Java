package oop.ch06.v01.abstractClass;

public class ComputerTest {

	public static void main(String[] args) {
		
		//Computer computer = new Computer(); // �߻� Ŭ������ new�� ����� �ν��Ͻ�ȭ�� �� ����.
		Computer computer = new DeskTop(); // ������ ����ȯ(��ĳ����)�� �̿��� Computer Ÿ���� DeskTop �ν��Ͻ��� ������ �� �ִ�.
		computer.display();
		computer.turnOff(); // �⺻�����δ� ���� Ŭ������ �ִ� �޼��� ȣ�� 
							// ���� Ŭ�������� �ش� �޼��带 �������̵�(overriding)�ߴٸ� ���� Ŭ������ �޼��尡 ȣ��ȴ�.
		
		Computer myNoteBook = new MyNoteBook();
		myNoteBook.typing();
		
	}

}
