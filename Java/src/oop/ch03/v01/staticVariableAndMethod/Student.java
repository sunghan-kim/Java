package oop.ch03.v01.staticVariableAndMethod;

public class Student {

	/*
	 * 
	 * 학생이 생성될 때마다 학생ID(studentID)를 부여하고 싶다. (자동으로)
	 * -> 기준 값이 필요 (기준값에서 점점 증가하는 형태)
	 * -> 기준 값은 모든 인스턴스가 바라봐야 한다.
	 * 
	 * 
	 */
	
	//public static int serialNum = 1000;
	private static int serialNum = 1000; // static 변수의 경우 외부 클래스에서 변경되면 안되므로 public 대신 private 접근 제어자를 사용한다.
	
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
		address = "주소 없음";
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
		
		serialNum++; // 일반 메서드 안에서는 static 변수를 사용할 수 있다. (static 변수는 프로그램이 메모리에 로드될 때 생성되기 때문에)
		return studentID;
	}
	
	public static int getSerialNum() { // static 변수에 대한 static 메서드 생성
		
		int i = 0; // 지역 변수
		//studentName = "Lee"; // static 메서드 안에서 인스턴스 변수를 사용할 수 없다. (static 변수는 인스턴스 생성과 관계없이 호출되야 하므로)
		
		return serialNum;
	}
	
}
