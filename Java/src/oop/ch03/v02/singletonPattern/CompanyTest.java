package oop.ch03.v02.singletonPattern;

import java.util.Calendar;

public class CompanyTest {

	public static void main(String[] args) {
		
		Company company1 = Company.getInstance();
		
		Company company2 = Company.getInstance();
		
		System.out.println(company1); // oop.ch03.v02.singletonPattern.Company@4e25154f
		System.out.println(company2); // oop.ch03.v02.singletonPattern.Company@4e25154f -> ������ �ּҸ� ������ �ִ�.
		
		
		/*
		 * 
		 * java.util.Calendar Ŭ����
		 * 
		 */
		
		// Calendar calendar = new Calendar(); // Calendar Ŭ������ new�� ����� �ν��Ͻ��� ������ �� ����. (��¥�� �����ؾ� �ϱ� ������) 
		Calendar calendar = Calendar.getInstance(); // �Ű� ������ ���� ���� ������ �ν��Ͻ��� ������ �� �ִ�.
		
	}
	
}
