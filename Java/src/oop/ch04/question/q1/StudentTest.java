package oop.ch04.question.q1;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student("Lee");
		studentLee.addBook("태백산맥1");
		studentLee.addBook("태백산맥2");
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student("Kim");
		studentKim.addBook("토지1");
		studentKim.addBook("토지2");
		studentKim.addBook("토지3");
		
		studentKim.showStudentInfo();
		
		Student studentCho = new Student("Cho");
		studentCho.addBook("해리포터1");
		studentCho.addBook("해리포터2");
		studentCho.addBook("해리포터3");
		studentCho.addBook("해리포터4");
		studentCho.addBook("해리포터5");
		studentCho.addBook("해리포터6");
		
		studentCho.showStudentInfo();
		
	}
	
}
