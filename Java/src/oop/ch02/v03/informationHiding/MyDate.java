package oop.ch02.v03.informationHiding;

public class MyDate {

	// 기본 접근 제어자 : 같은 패키지 내의 클래스에서만 사용 가능 (public 접근 제어자를 사용하면 다른 패키지에서도 사용 가능하다.)
	int day;
	int month;
	int year;
	
	public void showDate() {
		
		System.out.println(year + "년 " + month + "월 " + day + "일 입니다.");
		
	}
	
	// private : 다른 클래스에서 사용 불가 (메서드를 통해서만 사용 가능)
	private int day2;
	private int month2;
	private int year2;
	
	// private 접근 제어자로 지정된 변수에 접근하기 위한 public 메서드 생성
	public void setDay2(int day2) {
		this.day2 = day2; // 넘어오는 매개 변수와 맴버 변수의 이름이 같을 때 맴버변수 앞에 this 키워드를 사용하여 구분한다.
	}
	
	public int getDay2(int day) {
		return day2;
	}

	// Source > Generate Getters and Setters ... 를 이용해 private 맴버 변수에 대한 getter, setter 메서드를 자동으로 생성할 수 있다.
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
	 * private 접근 제어자를 통한 정보 보호 방법
	 * 
	 *   (방법 1) 특정 맴버변수들에 대해서는 setter 메서드를 제공하지 않을 수도 있다. (read only, ex) ID, ...)
	 *   
	 *   (방법 2) setter 메서드 내부에서 조건문을 통해 변수 사용을 통제할 수 있다.
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
			System.out.println(year2 + "년 " + month2 + "월 " + day2 + "일 입니다.");
		} else {
			System.out.println("유효하지 않은 날짜 입니다.");
		}
		
	}
	
	
	
	
}
