package oop.ch07.v04.multiInterface;

public interface Buy {

	void buy();
	
	// ����Ʈ �޼���
	default void order() {
		System.out.println("���� �ֹ�");
	}
	
}
