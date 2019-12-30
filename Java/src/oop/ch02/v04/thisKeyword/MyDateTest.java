package oop.ch02.v04.thisKeyword;

public class MyDateTest {

	public static void main(String[] args) {
		
		MyDate date = new MyDate();
		
		date.setYear(2019);
		date.setMonth(07);
		date.setDay(10);
		
		MyDate date2 = new MyDate();
		
		date2.setYear(2002);
		date2.setMonth(10);
		date2.setDay(9);
		
		/*
		 * 
		 * date의 setYear 메서드에서 this가 가리키는 MyDate 클래스의 맴버 변수 year의 값과
		 * date2의 setYear 메서드에서 this가 가리키는 MyDate 클래스의 맴버 변수 year의 값은 다르다.
		 * 
		 * -> this가 가리키는 것은 자기 자신의 메모리이다.
		 * 
		 */
		
	}
	
}
