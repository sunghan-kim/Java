package oop.ch02.v03.informationHiding;

public class MyDateTest {

	public static void main(String[] args) {
		
		MyDate date = new MyDate();
		
		date.day = 100;
		date.month = 70;
		date.year = 2019;
		
		date.showDate(); // MyDate Ŭ������ �ɹ� �������� �⺻ ���� �����ڷ� �����Ǿ� �ֱ� ������ ���Ŀ� �ȸ´� ������ ����������.
		
		date.setYear2(2019);
		date.setMonth2(7);
		date.setDay2(10);
		
		date.showDate2();
		
	}
	
}
