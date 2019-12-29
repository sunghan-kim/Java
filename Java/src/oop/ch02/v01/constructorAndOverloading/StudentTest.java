package oop.ch02.v01.constructorAndOverloading;

public class StudentTest {

	
	public static void main(String[] args) {
		
		//Student std = new Student(); // Student 클래스에서 기본 생성자가 아닌 생성자를 직접 만들어서 기본 생성자가 만들어지지 않는다.
		Student std = new Student();   // -> 기본 생성자를 직접 작성하여 오류 해결 가능
		
		
		std.studentName = "이순신";
		std.address = "서울";
		
		std.showStudentInfo();
		
		
		
	}
	
}
