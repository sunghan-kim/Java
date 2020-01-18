package oop.ch12.IO.v08.decoratorPattern.coffee;

public class CoffeeTest {

	public static void main(String[] args) {
		
		// 케냐 아메리카노
		Coffee americano = new KenyaAmericano();
		
		americano.brewing();
		
		System.out.println("\n====================================================== ");
		
		// 케냐 라떼
		Coffee kenyaLatte = new Latte(new KenyaAmericano());
		
		kenyaLatte.brewing();
		
		System.out.println("\n====================================================== "); 
		
		// 케냐 모카
		Coffee kenyaMocha = new Mocha(new Latte(new KenyaAmericano()));
		
		kenyaMocha.brewing();
		
		System.out.println("\n====================================================== "); 
		
		// 에티오피아 라떼
		Coffee etiopiaLatte = new Latte(new EtiopiaAmericano());
		
		etiopiaLatte.brewing();
		
	}
	
}
