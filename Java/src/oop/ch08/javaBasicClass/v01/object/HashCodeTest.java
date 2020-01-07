package oop.ch08.javaBasicClass.v01.object;

class Student2 {
	
	int studentNum;
	String studentName;
	
	public Student2(int studentNum, String studentName) {
		this.studentNum = studentNum;
		this.studentName = studentName;
	}
	
	// hashCode() 메서드 재정의
	@Override
	public int hashCode() {
		return studentNum; // equals의 맴버들의 일치여부 확인
	}
	
}

public class HashCodeTest {

	/*
	 * 
	 *   hashCode() 메서드
	 *   
	 *     - hashCode() 메서드의 반환 값
	 *     
	 *       - 인스턴스가 저장된 가상머신의 주소를 10진수로 반환
	 *       
	 *     - 두 개의 서로 다른 메모리에 위치한 인스턴스가 동일하다는 것은?
	 *     
	 *       - 논리적으로 동일 : equals()의 반환 값이 true
	 *       
	 *       - 동일한 hashCode 값을 가짐 : hashCode()의 반환 값이 동일
	 * 
	 */
	
	public static void main(String[] args) {
		
		Object obj = new Object();
		
		System.out.println(obj.hashCode()); // obj 인스턴스의 해시코드 값을 10진수로 반환
		
		System.out.println("==============================");
		
		Student2 lee = new Student2(100, "이순신");
		Student2 shin = new Student2(100, "이순신");
		
		System.out.println(lee.hashCode());
		System.out.println(shin.hashCode());
		
		System.out.println("==============================");
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println(i1.equals(i2)); // true
		System.out.println(i1.hashCode()); // 100 (Integer 클래스에서 hashCode() 메서드를 맴버변수의 값을 반환하도록 재정의함)
		
		// i1과 i2의 해시코드 값 확인 (서로 다름)
		System.out.println(System.identityHashCode(i1));
		System.out.println(System.identityHashCode(i2));
		
	}
	
}
