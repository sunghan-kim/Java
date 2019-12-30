package oop.ch03.question.q1;

public class CardCompany {

	private static CardCompany instance = new CardCompany();
	
	private CardCompany() {}
	
	public static CardCompany getInstance() {
		return instance;
	}
	
	public Card createCard() { // 생성자 대신 사용하는 메서드
		Card card = new Card();
		return card;
	}
	
}
