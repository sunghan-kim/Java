package oop.ch07.v04.multiInterface;

public interface Sell {

	void sell();
	
	// ����Ʈ �޼���
	default void order() {
		System.out.println("�Ǹ� �ֹ�");
	}
	
}
