package oop.ch08.javaBasicClass.v05.generic;

public class Plastic extends Material {

	public String toString() {
		return "재로는 Plastic 입니다.";
	}

	@Override
	public void doPrinting() {
		System.out.println("Plastic으로 프린팅 합니다.");
	}
	
}
