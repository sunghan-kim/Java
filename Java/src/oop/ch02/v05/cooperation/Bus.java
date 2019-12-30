package oop.ch02.v05.cooperation;

public class Bus {

	int busNumber;
	int passengerCount;
	int money; // 초기화를 따로 하지 않았으므로 초기값은 0
	
	public Bus(int busNumber) {
		
		this.busNumber = busNumber;
		
	}
	
	// 승객을 태우는 메서드
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showBusInfo() {
		System.out.println(busNumber + "번 버스의 승객은 " + passengerCount + "명 이고, 수입은 " + money + "원 입니다.");
	}
	
}
