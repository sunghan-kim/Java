package oop.ch1.v01.objectAndClass;

public class StudentTest {

	/*
	 * 
	 * Student Ŭ������ ���
	 * 
	 *   - ��ü�� ����� ��κ� �ٸ� Ŭ�������� �� ��ü�� ����ϴ� ��찡 ��κ��̴�.
	 * 
	 */
	
	public static void main(String[] args) {
		
		Student std = new Student(); // Student Ŭ������ �޸𸮿� �����ȴ�.
		
		std.studentName = "�̼���";
		std.address = "����";
		
		std.showStudentInfo();
		
	}
	
}
