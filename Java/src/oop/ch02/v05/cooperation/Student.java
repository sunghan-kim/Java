package oop.ch02.v05.cooperation;

public class Student {

	String studentName;
	int grade;
	int money;
	
	public Student(String studentName, int money) {
		
		this.studentName = studentName;
		this.money = money;
		
	}
	
	// 버스를 타는 메서드
	public void takeBus(Bus bus) { // 매개변수로 인스턴스를 받아야 한다. (객체를 생성하지 않고 받으면 NullPointException 발생)
		bus.take(1000); // 1000원 지불
		this.money -= 1000;
	}
	
	// 지하철을 타는 메서드
	public void takeSubway(Subway subway) { // 매개변수로 인스턴스를 받아야 한다. (객체를 생성하지 않고 받으면 NullPointException 발생) 
		subway.take(1200); // 1200원 지불
		this.money -= 1200;
	}
	
	// 택시를 타는 메서드
	public void takeTaxi(Taxi taxi) {
		taxi.take(10000);
		this.money -= 10000;
	}
	
	public void showInfo() {
		// 잔액 확인
		System.out.println(studentName + "님의 남은 돈은 " + money + "원 입니다.");
	}
	
}
