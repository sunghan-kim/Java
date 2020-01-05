package oop.ch06.v01.abstractClass;

public abstract class Computer { // 2. 추상 메서드가 존재하기 때문에 abstract 키워드를 이용해 추상 클래스 지정

	public abstract void display(); // 1. abstract 키워드를 이용해 추상 메서드 지정 ("{}" 를 작성하면 구현부를 구현하는 것이기 때문에 작성하지 않는다.)
	public abstract void typing(); 
	
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}  
	
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
	
	
	
}
