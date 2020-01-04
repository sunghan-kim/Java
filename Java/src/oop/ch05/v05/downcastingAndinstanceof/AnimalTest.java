package oop.ch05.v05.downcastingAndinstanceof;

import java.util.ArrayList;

class Animal{
	
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
	
	public void eating() {
		
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
	
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
	
}

class Eagle extends Animal {
	
	public void move() {
		System.out.println("독수리 하늘을 날아 갑니다.");
	}
	
	public void flying() {
		System.out.println("독수리가 날개를 쭉 펴고 날아갑니다.");
	}
	
}

public class AnimalTest {

	public static void main(String[] args) {
		
		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();
		
		// Human 클래스의 readbooks() 메서드를 사용하기 위해서는 hAnimal 을 Human으로 다운 캐스팅해야 한다.
		Human human = (Human) hAnimal;
		
		human.readBooks();
		
		// 오류가 발생하는 경우
		// - hAnimal을 Eagle로 다운 캐스팅 하여도 컴파일 오류는 발생하지 않는다.
		// - 하지만 실행을 했을 때 오류가 발생한다. (java.lang.ClassCastException, Human이 Eagle 로 캐스팅될 수 없다.)
		//Eagle human2 = (Eagle) hAnimal;
		
		if ( hAnimal instanceof Eagle) { // instanceof 를 이용하여 hAnimal 의 인스턴스가 Eagle인 지를 먼저 체크하므로 오류 발생을 방지할 수 있다.
			Eagle human2 = (Eagle) hAnimal;
		}
		
		/*
		 * 
		 *  A instanceof B
		 *  
		 *    - A의 인스턴스가 B 인지 확인
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
		  * 오버라이딩(overriding)이 가능한 경우, 다운 캐스팅보다는 오버라이딩을 하는 것이 좋다.
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
