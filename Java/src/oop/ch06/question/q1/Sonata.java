package oop.ch06.question.q1;

public class Sonata extends Car {

	@Override
	void start() {
		System.out.println("Sonata �õ��� �մϴ�.");
	}

	@Override
	void drive() {
		System.out.println("Sonata �޸��ϴ�.");
	}

	@Override
	void stop() {
		System.out.println("Sonata ����ϴ�.");
	}

	@Override
	void turnoff() {
		System.out.println("Sonata �õ��� ���ϴ�.");
	}

}
