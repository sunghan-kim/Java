package oop.ch02.question.q2;

public class BuyCoffeeTest {

	public static void main(String[] args) {
		
		Person personK = new Person("±èÁ¹·Á", 10000);
		Person personL = new Person("ÀÌÇÇ°ï", 20000);
		
		StarCoffee starCoffee = new StarCoffee("º°´Ù¹æ");
		BeanCoffee beanCoffee = new BeanCoffee("Äá´Ù¹æ");
		
		personK.buyStarCoffee(starCoffee, "¾Æ¸Þ¸®Ä«³ë", 4000);
		
		personK.showInfo();
		starCoffee.showStarCoffeInfo();
		
		personL.buyBeanCoffee(beanCoffee, "¶ó¶¼", 4500);
		
		personL.showInfo();
		beanCoffee.showStarCoffeInfo();
		
		
	}
	
}
