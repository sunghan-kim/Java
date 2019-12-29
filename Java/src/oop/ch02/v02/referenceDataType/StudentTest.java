package oop.ch02.v02.referenceDataType;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student(100, "Lee");
		studentLee.setKoreaSubject("����", 100);
		studentLee.setMathSubject("����", 95);
		
		Student studentKim = new Student(101, "Kim");
		studentKim.setKoreaSubject("����", 80);
		studentKim.setMathSubject("����", 99);
		
		studentLee.showStudentScore();
		studentKim.showStudentScore();
		
	}
	
}
