package oop.ch02.v01.constructorAndOverloading;

public class Student {

	public int studentID;
	public String studentName;
	public String address;
	
	/*
	 * private
	 * 
	 *   - ���ο����� ����ϴ� ������� ǥ�� (�ܺ� Ŭ�������� �ش� ������ �����ؼ� ����� �� ����.)
	 *   - ������ �����ڸ� ���ؼ� �ʱ�ȭ�� �� �� �ִ�.
	 */
	private int juminNo;
	
	/*
	 * �⺻ ������ : �����Ϸ��� �ڵ� ����
	 */
	//public Student() {}
	
	/*
	 * ������ : ���� �ۼ�
	 */
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
		// �����ڸ� �̿��� ���� �ʱ�ȭ���� ���� �ɹ� ����(address)�� NULL ������ �ʱ�ȭ�ȴ�.
	}
	
	/*
	 * �⺻ ������ ���� ����
	 */
	public Student() {}
	
	/*
	 * �����ڴ� ���� ���� ���� �� �ִ�.
	 */
	public Student(String name) {
		studentName = name;
	}
	
	
	// 
	public void showStudentInfo() {
		
		System.out.println(studentName + ", " + address);
		
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	
}
