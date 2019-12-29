package oop.ch02.v03.informationHiding;

public class MyDateTest {

	public static void main(String[] args) {
		
		MyDate date = new MyDate();
		
		date.day = 100;
		date.month = 70;
		date.year = 2019;
		
		date.showDate(); // MyDate 클래스의 맴버 변수들이 기본 접근 제어자로 지정되어 있기 때문에 형식에 안맞는 설정이 가능해진다.
		
		date.setYear2(2019);
		date.setMonth2(7);
		date.setDay2(10);
		
		date.showDate2();
		
	}
	
}
