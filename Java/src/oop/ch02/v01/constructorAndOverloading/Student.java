package oop.ch02.v01.constructorAndOverloading;

public class Student {

	public int studentID;
	public String studentName;
	public String address;
	
	/*
	 * private
	 * 
	 *   - 내부에서만 사용하는 변수라는 표시 (외부 클래스에서 해당 변수를 참조해서 사용할 수 없다.)
	 *   - 하지만 생성자를 통해서 초기화는 할 수 있다.
	 */
	private int juminNo;
	
	/*
	 * 기본 생성자 : 컴파일러가 자동 제공
	 */
	//public Student() {}
	
	/*
	 * 생성자 : 직접 작성
	 */
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
		// 생성자를 이용해 값을 초기화하지 않은 맴버 변수(address)는 NULL 값으로 초기화된다.
	}
	
	/*
	 * 기본 생성자 직접 생성
	 */
	public Student() {}
	
	/*
	 * 생성자는 여러 개를 만들 수 있다.
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
