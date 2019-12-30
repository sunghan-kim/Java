package oop.ch02.question.q2;

public class StarCoffee {

	private String coffeShopName;
	private int money;
	
	public StarCoffee(String coffeShopName) {
		this.coffeShopName = coffeShopName;
	}
	
	public String getCoffeeShopName() {
		return this.coffeShopName;
	}
	
	public void buyCoffee(int money) {
		
		this.money += money;
		
	}
	
	public void showStarCoffeInfo() {
		
		System.out.println(coffeShopName + "�� ���� ������ " + money + "�� �Դϴ�.");
		
	}
	
}
