package oop.ch05.v04.polymorphism;

import java.util.ArrayList;

class Animal{
	
	public void move() {
		System.out.println("������ �����Դϴ�.");
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
	
}

class Eagle extends Animal {
	
	public void move() {
		System.out.println("������ �ϴ��� ���� ���ϴ�.");
	}
	
}

public class AnimalTest {

	public static void main(String[] args) {
		
		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();
		
		AnimalTest test = new AnimalTest();
		
		test.moveAnimal(hAnimal); // �ϳ��� �ڵ尡 ���� �ڷ����� �Ǽ� �ٸ� ������ �̷������. --> ������(Polymorphism)
		test.moveAnimal(tAnimal);
		test.moveAnimal(eAnimal);
		
		//hAnimal.readBooks() <- hAnimal�� Animal Ŭ������ ��ĳ���� �Ǿ� �����Ǿ��� ������ Human Ŭ������ readBooks() �޼���� ����� �� ����.
		// Animal Ÿ������ ���ǵ� hAnimal�� Human Ŭ���� Ÿ������ �����ϴ� ���� "�ٿ�ĳ����"�̶�� �Ѵ�.
		
		System.out.println("============================");
		
		/*
		 * 
		 * ArrayList Ȱ��
		 * 
		 */
		 ArrayList<Animal> animalList = new ArrayList<Animal>();
		 
		 animalList.add(hAnimal);
		 animalList.add(tAnimal);
		 animalList.add(eAnimal);
		
		 for (Animal animal : animalList) {
			 animal.move(); // ������(polymorphisim) : �ڵ�� �ϳ������� ������ ������ ��� �ٸ��� ���´�.
		 }
		
	}
	
	public void moveAnimal(Human animal) { // ���� Ŭ������ move() �޼��带 ȣ���ϴ� �޼��带 ����� �Ǹ� ��� ���� Ŭ����(3��)�� ���� �޼��带 �������� �Ѵ�.
		animal.move();
	}
	
	public void moveAnimal(Animal animal) { // ������, �������� �̿��� ���� Ŭ������ Ÿ���� �Ű������� �޴� �޼��带 �����ϰ� �Ǹ� �ϳ��� �޼��常 ���� �ȴ�.
		animal.move();
	}
	
	
	
}
