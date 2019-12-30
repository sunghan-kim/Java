package oop.ch02.v04.thisKeyword;

public class Person {

	String name;
	int age;
	
	// this Ű���带 Ȱ���Ͽ� �����ڿ��� �ٸ� �����ڸ� ȣ��
	public Person() {
		
		/*
		 * 
		 * �����ڰ� �ϴ� ��
		 * 
		 *   - �ν��Ͻ��� ���� �ʱ�ȭ����
		 *   - �ν��Ͻ� ������ �Ϸ���� ���� ���¿��� �ٸ� ���� �ϸ� ������ �߻��� �� �ִ�.
		 *   - ���� �����ڿ��� �ٸ� �����ڸ� ȣ���ϱ� ����, ȣ�� ��� �����ڿ��� �ʱ�ȭ�ϴ� �ɹ� ������ ���� �̸� �Ҵ��Ϸ��� �ϸ�
		 *     ������ �߻��Ѵ�.
		 * 
		 */
		//age = 10;
		
		this("�̸� ����", 1); // this Ű���带 ����Ͽ� �Ʒ��� day, month, year�� �Ű������� ���� ������ ��� 
		// ���� Ŭ������ �����ڸ� ����ϱ� ���� super Ű���带 Ȱ���� �� �ִ�. (this Ű����� ������ ����ϴ�.)
		

	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void showInfo() {
		System.out.println(name + ", " + age);
	}
	
	public Person getSelf() {
		return this; // �ڱ� �ڽ��� ��ü�� ��ȯ �� �� this Ű���� ���
	}
	
}
