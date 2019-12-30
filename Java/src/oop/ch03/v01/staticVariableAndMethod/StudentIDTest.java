package oop.ch03.v01.staticVariableAndMethod;

public class StudentIDTest {

	public static void main(String[] args) {
		
		//System.out.println(Student.serialNum);
		System.out.println(Student.getSerialNum()); // static �޼��� �̿� static ���� ������ ����
		
		Student studentLee = new Student("Lee");
		//System.out.println(studentLee.serialNum); // 1001
		//System.out.println(Student.serialNum); // ���� ������ �ƴ� static �����̹Ƿ� ���� ������ �����ϴ� ���� �ƴ� Ŭ���������� �����ؾ� �Ѵ�.
		System.out.println(Student.getSerialNum()); // static �޼���� ���� ������ �ƴ� Ŭ�������� ���� ȣ���ϹǷ� Ŭ���� ������� �Ҹ���.
		
		Student studentKim = new Student("Kim");
		//System.out.println(studentKim.serialNum); // 1002
		//System.out.println(Student.serialNum);
		System.out.println(Student.getSerialNum());
		
		//System.out.println(studentLee.serialNum); // 1002
		//System.out.println(Student.serialNum);
		System.out.println(Student.getSerialNum());
		
		System.out.println(studentLee.getStudentID());
		System.out.println(studentKim.getStudentID());
		
		
	}
	
}
