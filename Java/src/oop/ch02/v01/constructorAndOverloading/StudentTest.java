package oop.ch02.v01.constructorAndOverloading;

public class StudentTest {

	
	public static void main(String[] args) {
		
		//Student std = new Student(); // Student Ŭ�������� �⺻ �����ڰ� �ƴ� �����ڸ� ���� ���� �⺻ �����ڰ� ��������� �ʴ´�.
		Student std = new Student();   // -> �⺻ �����ڸ� ���� �ۼ��Ͽ� ���� �ذ� ����
		
		
		std.studentName = "�̼���";
		std.address = "����";
		
		std.showStudentInfo();
		
		
		
	}
	
}
