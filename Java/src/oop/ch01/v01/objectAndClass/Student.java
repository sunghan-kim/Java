package oop.ch01.v01.objectAndClass;

public class Student { // java 파일명과 public 키워드를 갖는 클래스명은 동일

	// 맴버 변수 (속성)
	public int studentID; // public : 접근 제어 키워드
	public String studentName;
	public String address;
	
	// 메서드 : 기능 구현
	public void showStudentInfo() {
		
		System.out.println(studentName + ", " + address);
		
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	
}
