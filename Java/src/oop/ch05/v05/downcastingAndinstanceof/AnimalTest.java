package oop.ch05.v05.downcastingAndinstanceof;

import java.util.ArrayList;

class Animal{
	
	public void move() {
		System.out.println("������ �����Դϴ�.");
	}
	
	public void eating() {
		
	}
	
}

class Human extends Animal {
	
	public void move() {
		System.out.println("����� �� �߷� �Ƚ��ϴ�.");
	}
	
	public void readBooks() {
		System.out.println("����� å�� �н��ϴ�.");
	}
	
}

class Tiger extends Animal {
	
	public void move() {
		System.out.println("ȣ���̰� �� �߷� �ݴϴ�.");
	}
	
	public void hunting() {
		System.out.println("ȣ���̰� ����� �մϴ�.");
	}
	
}

class Eagle extends Animal {
	
	public void move() {
		System.out.println("������ �ϴ��� ���� ���ϴ�.");
	}
	
	public void flying() {
		System.out.println("�������� ������ �� ��� ���ư��ϴ�.");
	}
	
}

public class AnimalTest {

	public static void main(String[] args) {
		
		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();
		
		// Human Ŭ������ readbooks() �޼��带 ����ϱ� ���ؼ��� hAnimal �� Human���� �ٿ� ĳ�����ؾ� �Ѵ�.
		Human human = (Human) hAnimal;
		
		human.readBooks();
		
		// ������ �߻��ϴ� ���
		// - hAnimal�� Eagle�� �ٿ� ĳ���� �Ͽ��� ������ ������ �߻����� �ʴ´�.
		// - ������ ������ ���� �� ������ �߻��Ѵ�. (java.lang.ClassCastException, Human�� Eagle �� ĳ���õ� �� ����.)
		//Eagle human2 = (Eagle) hAnimal;
		
		if ( hAnimal instanceof Eagle) { // instanceof �� �̿��Ͽ� hAnimal �� �ν��Ͻ��� Eagle�� ���� ���� üũ�ϹǷ� ���� �߻��� ������ �� �ִ�.
			Eagle human2 = (Eagle) hAnimal;
		}
		
		/*
		 * 
		 *  A instanceof B
		 *  
		 *    - A�� �ν��Ͻ��� B ���� Ȯ��
		 * 
		 */
		
		/*
		AnimalTest test = new AnimalTest();
		
		test.moveAnimal(hAnimal); 
		test.moveAnimal(tAnimal);
		test.moveAnimal(eAnimal);
		*/
		
		System.out.println("============================");
		
		 ArrayList<Animal> animalList = new ArrayList<Animal>();
		 
		 animalList.add(hAnimal);
		 animalList.add(tAnimal);
		 animalList.add(eAnimal);
		
	
		 AnimalTest test = new AnimalTest();
		 
		 test.testDownCasting(animalList);
		 
		 /*
		 for (Animal animal : animalList) {
			 animal.move(); 
		 }
		 */
		 
		 /*
		  * 
		  * �������̵�(overriding)�� ������ ���, �ٿ� ĳ���ú��ٴ� �������̵��� �ϴ� ���� ����.
		  * 
		  */
		
	}
	
	public void testDownCasting(ArrayList<Animal> list) {
		
		for (int i=0; i < list.size(); i++) {
			
			Animal animal = list.get(i);
			
			if (animal instanceof Human) {
				Human human = (Human) animal;
				human.readBooks();
			} else if (animal instanceof Tiger) {
				Tiger tiger = (Tiger) animal;
				tiger.hunting();
			} else if (animal instanceof Eagle) {
				Eagle eagle = (Eagle) animal;
				eagle.flying();
			} else {
				System.out.println("error");
			}
			
		}
		
	}
	
	public void moveAnimal(Animal animal) {
		animal.move();
	}
	
	
	
}
