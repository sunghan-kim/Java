package oop.ch01.v01.objectAndClass;

public class Student { // java ���ϸ�� public Ű���带 ���� Ŭ�������� ����

	// �ɹ� ���� (�Ӽ�)
	public int studentID; // public : ���� ���� Ű����
	public String studentName;
	public String address;
	
	// �޼��� : ��� ����
	public void showStudentInfo() {
		
		System.out.println(studentName + ", " + address);
		
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	
}
