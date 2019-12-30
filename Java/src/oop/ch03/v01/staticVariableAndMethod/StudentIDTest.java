package oop.ch03.v01.staticVariableAndMethod;

public class StudentIDTest {

	public static void main(String[] args) {
		
		//System.out.println(Student.serialNum);
		System.out.println(Student.getSerialNum()); // static 메서드 이용 static 변수 데이터 접근
		
		Student studentLee = new Student("Lee");
		//System.out.println(studentLee.serialNum); // 1001
		//System.out.println(Student.serialNum); // 참조 변수가 아닌 static 변수이므로 참조 변수로 접근하는 것이 아닌 클래스명으로 접근해야 한다.
		System.out.println(Student.getSerialNum()); // static 메서드는 참조 변수가 아닌 클래스명을 통해 호출하므로 클래스 변수라고도 불린다.
		
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
