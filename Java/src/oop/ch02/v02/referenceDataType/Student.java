package oop.ch02.v02.referenceDataType;

public class Student {

	int studentID;
	String studentName;
	
	// 학생 클래스에 과목 정보가 많이 포함되는 것은 좋지 않다.
	/*
	 * int koreaScore; int mathScore; int engScore;
	 * 
	 * String koreaName; String mathName; String engName;
	 */
	
	Subject korea; // Subject는 객체 생성 작업이 필요하다.
	Subject math;
	
	// 생성자에서 맴버 변수 초기화 실시
	public Student(int id, String name) {
		
		studentID = id;
		studentName = name;
		
		korea = new Subject();
		math = new Subject();
		
	}
	
	// Subject 관련 맴버 변수 값을 넣어주는 메서드 생성
	public void setKoreaSubject(String name, int score) {
		
		korea.subjectName = name;
		korea.score = score;
		
	}
	
	public void setMathSubject(String name, int score) {
		
		math.subjectName = name;
		math.score = score;
		
	}
	
	
	// 과목 점수를 출력하는 매서드 생성
	public void showStudentScore() {
		
		int total = korea.score + math.score;
		
		System.out.println(studentName + " 학생의 총점은 " + total + "점 입니다.");
		
	}
	
	
}
