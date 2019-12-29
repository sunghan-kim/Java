package oop.ch02.v03.informationHiding;

public class MyDate {

	// �⺻ ���� ������ : ���� ��Ű�� ���� Ŭ���������� ��� ���� (public ���� �����ڸ� ����ϸ� �ٸ� ��Ű�������� ��� �����ϴ�.)
	int day;
	int month;
	int year;
	
	public void showDate() {
		
		System.out.println(year + "�� " + month + "�� " + day + "�� �Դϴ�.");
		
	}
	
	// private : �ٸ� Ŭ�������� ��� �Ұ� (�޼��带 ���ؼ��� ��� ����)
	private int day2;
	private int month2;
	private int year2;
	
	// private ���� �����ڷ� ������ ������ �����ϱ� ���� public �޼��� ����
	public void setDay2(int day2) {
		this.day2 = day2; // �Ѿ���� �Ű� ������ �ɹ� ������ �̸��� ���� �� �ɹ����� �տ� this Ű���带 ����Ͽ� �����Ѵ�.
	}
	
	public int getDay2(int day) {
		return day2;
	}

	// Source > Generate Getters and Setters ... �� �̿��� private �ɹ� ������ ���� getter, setter �޼��带 �ڵ����� ������ �� �ִ�.
	public int getMonth2() {
		return month2;
	}

	public int getYear2() {
		return year2;
	}

	public void setYear2(int year2) {
		this.year2 = year2;
	}
	
	/*
	 * 
	 * private ���� �����ڸ� ���� ���� ��ȣ ���
	 * 
	 *   (��� 1) Ư�� �ɹ������鿡 ���ؼ��� setter �޼��带 �������� ���� ���� �ִ�. (read only, ex) ID, ...)
	 *   
	 *   (��� 2) setter �޼��� ���ο��� ���ǹ��� ���� ���� ����� ������ �� �ִ�.
	 * 
	 */
	
	private boolean isValid;
	
	public void setMonth2(int month2) {
		
		if (month2 < 1 || month > 12) {
			  isValid = false;
		} else {
			this.month2 = month2;
		}
		
	}
	
	public void showDate2() {
		
		if (isValid) {
			System.out.println(year2 + "�� " + month2 + "�� " + day2 + "�� �Դϴ�.");
		} else {
			System.out.println("��ȿ���� ���� ��¥ �Դϴ�.");
		}
		
	}
	
	
	
	
}
