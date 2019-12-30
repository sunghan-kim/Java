package oop.ch03.v01.staticVariableAndMethod;

public class Student {

	/*
	 * 
	 * �л��� ������ ������ �л�ID(studentID)�� �ο��ϰ� �ʹ�. (�ڵ�����)
	 * -> ���� ���� �ʿ� (���ذ����� ���� �����ϴ� ����)
	 * -> ���� ���� ��� �ν��Ͻ��� �ٶ���� �Ѵ�.
	 * 
	 * 
	 */
	
	//public static int serialNum = 1000;
	private static int serialNum = 1000; // static ������ ��� �ܺ� Ŭ�������� ����Ǹ� �ȵǹǷ� public ��� private ���� �����ڸ� ����Ѵ�.
	
	private int studentID;
	public String studentName;
	public String address; 
	
	public Student(String name) {
		studentName = name;
		serialNum++;
		studentID = serialNum;
	}
	
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
		address = "�ּ� ����";
		serialNum++;
		studentID = serialNum;
	}
	
	public void showStudentInfo() {
		System.out.println(studentName + ", " + address);
	}
	
	public String getStudentName() {
		return studentName; 
	}
	
	public int getStudentID() {
		
		serialNum++; // �Ϲ� �޼��� �ȿ����� static ������ ����� �� �ִ�. (static ������ ���α׷��� �޸𸮿� �ε�� �� �����Ǳ� ������)
		return studentID;
	}
	
	public static int getSerialNum() { // static ������ ���� static �޼��� ����
		
		int i = 0; // ���� ����
		//studentName = "Lee"; // static �޼��� �ȿ��� �ν��Ͻ� ������ ����� �� ����. (static ������ �ν��Ͻ� ������ ������� ȣ��Ǿ� �ϹǷ�)
		
		return serialNum;
	}
	
}
