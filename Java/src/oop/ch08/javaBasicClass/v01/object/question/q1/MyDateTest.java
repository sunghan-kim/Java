package oop.ch08.javaBasicClass.v01.object.question.q1;

class MyDate {
	
	int day;
	int month;
	int year;
	
	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	@Override
	public boolean equals(Object obj) {
		
		if ( obj instanceof MyDate ) {
			
			MyDate date = (MyDate) obj;
			
			if ( day == date.day && month == date.month && year == date.year ) {
				return true;
			} else {
				return false;
			}
			
		}
		
		return false;
		
	}

	@Override
	public int hashCode() {
		return Integer.parseInt(Integer.toString(year) + Integer.toString(month) + Integer.toString(day));
	}
	
}

public class MyDateTest {

	public static void main(String[] args) {
		
		MyDate date1 = new MyDate(07, 01, 2020);
		MyDate date2 = new MyDate(07, 01, 2020);
		
		System.out.println(date1.equals(date2));
		
		System.out.println("=====================");
		
		System.out.println(date1.hashCode());
		System.out.println(date2.hashCode());
		
	}
	
}
