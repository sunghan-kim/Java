package oop.ch02.question.q2;

public class BuyCoffeeTest {

	public static void main(String[] args) {
		
		Person personK = new Person("������", 10000);
		Person personL = new Person("���ǰ�", 20000);
		
		StarCoffee starCoffee = new StarCoffee("���ٹ�");
		BeanCoffee beanCoffee = new BeanCoffee("��ٹ�");
		
		personK.buyStarCoffee(starCoffee, "�Ƹ޸�ī��", 4000);
		
		personK.showInfo();
		starCoffee.showStarCoffeInfo();
		
		personL.buyBeanCoffee(beanCoffee, "��", 4500);
		
		personL.showInfo();
		beanCoffee.showStarCoffeInfo();
		
		
	}
	
}
