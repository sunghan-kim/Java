package oop.ch06.question.q1;

public class Grandeur extends Car {

	@Override
	void start() {
		System.out.println("Grandeur �õ��� �մϴ�.");
	}

	@Override
	void drive() {
		System.out.println("Grandeur �޸��ϴ�.");
	}

	@Override
	void stop() {
		System.out.println("Grandeur ����ϴ�.");
	}

	@Override
	void turnoff() {
		System.out.println("Grandeur �õ��� ���ϴ�.");
	}

}
