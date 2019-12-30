package oop.ch03.v02.singletonPattern;

import java.util.Calendar;

public class CompanyTest {

	public static void main(String[] args) {
		
		Company company1 = Company.getInstance();
		
		Company company2 = Company.getInstance();
		
		System.out.println(company1); // oop.ch03.v02.singletonPattern.Company@4e25154f
		System.out.println(company2); // oop.ch03.v02.singletonPattern.Company@4e25154f -> 동일한 주소를 가지고 있다.
		
		
		/*
		 * 
		 * java.util.Calendar 클래스
		 * 
		 */
		
		// Calendar calendar = new Calendar(); // Calendar 클래스는 new를 사용해 인스턴스를 생성할 수 없다. (날짜는 유일해야 하기 때문에) 
		Calendar calendar = Calendar.getInstance(); // 매개 변수에 따라 여러 종류의 인스턴스를 가져올 수 있다.
		
	}
	
}
