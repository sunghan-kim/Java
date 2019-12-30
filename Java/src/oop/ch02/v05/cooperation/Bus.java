package oop.ch02.v05.cooperation;

public class Bus {

	int busNumber;
	int passengerCount;
	int money; // �ʱ�ȭ�� ���� ���� �ʾ����Ƿ� �ʱⰪ�� 0
	
	public Bus(int busNumber) {
		
		this.busNumber = busNumber;
		
	}
	
	// �°��� �¿�� �޼���
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showBusInfo() {
		System.out.println(busNumber + "�� ������ �°��� " + passengerCount + "�� �̰�, ������ " + money + "�� �Դϴ�.");
	}
	
}
