package oop.ch05.v04.polymorphism;

import java.util.ArrayList;

class Animal{
	
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
	
}

class Human extends Animal {
	
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	
	public void readBooks() {
		System.out.println("사람이 책을 읽습니다.");
	}
	
}

class Tiger extends Animal {
	
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
	
}

class Eagle extends Animal {
	
	public void move() {
		System.out.println("독수리 하늘을 날아 갑니다.");
	}
	
}

public class AnimalTest {

	public static void main(String[] args) {
		
		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();
		
		AnimalTest test = new AnimalTest();
		
		test.moveAnimal(hAnimal); // 하나의 코드가 여러 자료형이 되서 다른 실행이 이루어진다. --> 다형성(Polymorphism)
		test.moveAnimal(tAnimal);
		test.moveAnimal(eAnimal);
		
		//hAnimal.readBooks() <- hAnimal이 Animal 클래스로 업캐스팅 되어 생성되었기 떄문에 Human 클래스의 readBooks() 메서드는 사용할 수 없다.
		// Animal 타입으로 정의된 hAnimal을 Human 클래스 타입으로 변경하는 것을 "다운캐스팅"이라고 한다.
		
		System.out.println("============================");
		
		/*
		 * 
		 * ArrayList 활용
		 * 
		 */
		 ArrayList<Animal> animalList = new ArrayList<Animal>();
		 
		 animalList.add(hAnimal);
		 animalList.add(tAnimal);
		 animalList.add(eAnimal);
		
		 for (Animal animal : animalList) {
			 animal.move(); // 다형성(polymorphisim) : 코드는 하나이지만 구현된 내용이 모두 다르게 나온다.
		 }
		
	}
	
	public void moveAnimal(Human animal) { // 하위 클래스의 move() 메서드를 호출하는 메서드를 만들게 되면 모든 하위 클래스(3개)에 대한 메서드를 만들어줘야 한다.
		animal.move();
	}
	
	public void moveAnimal(Animal animal) { // 하지만, 다형성을 이용해 상위 클래스의 타입을 매개변수로 받는 메서드를 생성하게 되면 하나의 메서드만 만들어도 된다.
		animal.move();
	}
	
	
	
}
