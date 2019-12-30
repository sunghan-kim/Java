package oop.ch02.question.q2;

public class Person {

	private String name;
	private String coffeShopName;
	private String menu;
	private int money;
	
	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void buyStarCoffee(StarCoffee star, String menu, int money) {
		
		this.coffeShopName = star.getCoffeeShopName();
		this.menu = menu;
		star.buyCoffee(money);
		this.money -= money;
	}
	
	public void buyBeanCoffee(BeanCoffee bean, String menu, int money) {
		
		this.coffeShopName = bean.getCoffeeShopName();
		this.menu = menu;
		bean.buyCoffee(money);
		this.money -= money;
	}
	
	public void showInfo() {
		
		System.out.println(name + "���� " + coffeShopName + "���� " + menu + "�� �������Ƿ�"
				+ " ���� �ܾ��� " + money + "�� �Դϴ�.");
		
	}
	
}
