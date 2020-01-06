package oop.ch07.v04.multiInterface;

public interface Sell {

	void sell();
	
	// 디폴트 메서드
	default void order() {
		System.out.println("판매 주문");
	}
	
}
