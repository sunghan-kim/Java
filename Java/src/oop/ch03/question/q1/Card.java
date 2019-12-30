package oop.ch03.question.q1;

public class Card {

	private static int serialNumer = 10000;
	private int cardNumber;
	
	public Card() {
		serialNumer++;
		cardNumber = serialNumer;
	}
	
	public int getCardNumber() {
		return cardNumber;
	}
	
}
