package oop.ch08.javaBasicClass.v05.generic;

public class Powder extends Material {

	public String toString() {
		return "재료는 Powder 입니다.";
	}

	@Override
	public void doPrinting() {
		System.out.println("Powder으로 프린팅 합니다.");
	}
	
}
