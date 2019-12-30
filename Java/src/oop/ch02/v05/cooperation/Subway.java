package oop.ch02.v05.cooperation;

public class Subway {

	int lineNumber;
	int passengerCount;
	int money; // 초기화를 따로 하지 않았으므로 초기값은 0
	
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showSubwayInfo() {
		System.out.println(lineNumber + "번 지하철의 승객은 " + passengerCount + "명 이고, 수입은 " + money + "원 입니다.");
	}
	
}
