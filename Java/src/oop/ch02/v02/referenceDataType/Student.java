package oop.ch02.v02.referenceDataType;

public class Student {

	int studentID;
	String studentName;
	
	// �л� Ŭ������ ���� ������ ���� ���ԵǴ� ���� ���� �ʴ�.
	/*
	 * int koreaScore; int mathScore; int engScore;
	 * 
	 * String koreaName; String mathName; String engName;
	 */
	
	Subject korea; // Subject�� ��ü ���� �۾��� �ʿ��ϴ�.
	Subject math;
	
	// �����ڿ��� �ɹ� ���� �ʱ�ȭ �ǽ�
	public Student(int id, String name) {
		
		studentID = id;
		studentName = name;
		
		korea = new Subject();
		math = new Subject();
		
	}
	
	// Subject ���� �ɹ� ���� ���� �־��ִ� �޼��� ����
	public void setKoreaSubject(String name, int score) {
		
		korea.subjectName = name;
		korea.score = score;
		
	}
	
	public void setMathSubject(String name, int score) {
		
		math.subjectName = name;
		math.score = score;
		
	}
	
	
	// ���� ������ ����ϴ� �ż��� ����
	public void showStudentScore() {
		
		int total = korea.score + math.score;
		
		System.out.println(studentName + " �л��� ������ " + total + "�� �Դϴ�.");
		
	}
	
	
}
