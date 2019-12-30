package oop.ch02.v05.cooperation;

public class Student {

	String studentName;
	int grade;
	int money;
	
	public Student(String studentName, int money) {
		
		this.studentName = studentName;
		this.money = money;
		
	}
	
	// ������ Ÿ�� �޼���
	public void takeBus(Bus bus) { // �Ű������� �ν��Ͻ��� �޾ƾ� �Ѵ�. (��ü�� �������� �ʰ� ������ NullPointException �߻�)
		bus.take(1000); // 1000�� ����
		this.money -= 1000;
	}
	
	// ����ö�� Ÿ�� �޼���
	public void takeSubway(Subway subway) { // �Ű������� �ν��Ͻ��� �޾ƾ� �Ѵ�. (��ü�� �������� �ʰ� ������ NullPointException �߻�) 
		subway.take(1200); // 1200�� ����
		this.money -= 1200;
	}
	
	// �ýø� Ÿ�� �޼���
	public void takeTaxi(Taxi taxi) {
		taxi.take(10000);
		this.money -= 10000;
	}
	
	public void showInfo() {
		// �ܾ� Ȯ��
		System.out.println(studentName + "���� ���� ���� " + money + "�� �Դϴ�.");
	}
	
}
