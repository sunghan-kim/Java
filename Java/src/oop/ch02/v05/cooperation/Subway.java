package oop.ch02.v05.cooperation;

public class Subway {

	int lineNumber;
	int passengerCount;
	int money; // �ʱ�ȭ�� ���� ���� �ʾ����Ƿ� �ʱⰪ�� 0
	
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showSubwayInfo() {
		System.out.println(lineNumber + "�� ����ö�� �°��� " + passengerCount + "�� �̰�, ������ " + money + "�� �Դϴ�.");
	}
	
}
