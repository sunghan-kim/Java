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
		 * date�� setYear �޼��忡�� this�� ����Ű�� MyDate Ŭ������ �ɹ� ���� year�� ����
		 * date2�� setYear �޼��忡�� this�� ����Ű�� MyDate Ŭ������ �ɹ� ���� year�� ���� �ٸ���.
		 * 
		 * -> this�� ����Ű�� ���� �ڱ� �ڽ��� �޸��̴�.
		 * 
		 */
		
	}
	
}
