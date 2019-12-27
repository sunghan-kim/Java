package oop.ch1.v01.objectAndClass;

public class StudentTest {

	/*
	 * 
	 * Student 클래스의 사용
	 * 
	 *   - 객체를 만들면 대부분 다른 클래스에서 그 객체를 사용하는 경우가 대부분이다.
	 * 
	 */
	
	public static void main(String[] args) {
		
		Student std = new Student(); // Student 클래스가 메모리에 생성된다.
		
		std.studentName = "이순신";
		std.address = "서울";
		
		std.showStudentInfo();
		
	}
	
}
