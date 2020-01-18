package oop.ch12.IO.v08.decoratorPattern.coffee;

public class CoffeeTest {

	public static void main(String[] args) {
		
		// �ɳ� �Ƹ޸�ī��
		Coffee americano = new KenyaAmericano();
		
		americano.brewing();
		
		System.out.println("\n====================================================== ");
		
		// �ɳ� ��
		Coffee kenyaLatte = new Latte(new KenyaAmericano());
		
		kenyaLatte.brewing();
		
		System.out.println("\n====================================================== "); 
		
		// �ɳ� ��ī
		Coffee kenyaMocha = new Mocha(new Latte(new KenyaAmericano()));
		
		kenyaMocha.brewing();
		
		System.out.println("\n====================================================== "); 
		
		// ��Ƽ���Ǿ� ��
		Coffee etiopiaLatte = new Latte(new EtiopiaAmericano());
		
		etiopiaLatte.brewing();
		
	}
	
}
