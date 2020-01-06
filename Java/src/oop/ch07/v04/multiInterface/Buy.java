package oop.ch07.v04.multiInterface;

public interface Buy {

	void buy();
	
	// 디폴트 메서드
	default void order() {
		System.out.println("구매 주문");
	}
	
}
