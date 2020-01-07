package oop.ch08.javaBasicClass.v01.object;

class Student {
	
	int studentNum;
	String studentName;
	
	public Student(int studentNum, String studentName) {
		this.studentNum = studentNum;
		this.studentName = studentName;
	}

	
	// equals() 메서드 재정의
	@Override
	public boolean equals(Object obj) {
		if ( obj instanceof Student ) {
			Student std = (Student) obj;
			if (this.studentNum == std.studentNum) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}
	
	
	
}

public class EqualsTest {

	/*
	 * 
	 *   equals() 메서드
	 *   
	 *     - 두 객체(인스턴스)의 동일함을 논리적으로 재정의할 수 있음
	 *     
	 *     - 물리적 동일함 : 같은 주소를 가지는 객체
	 *     - 논리적 동일함 : 같은 학번의 학생, 같은 주문 번호의 주문
	 *     
	 *     - 물리적으로 다른 메모리에 위치한 객체라도 논리적으로 동일함을 구현하기 위해 사용하는 메서드
	 * 
	 */
	
	public static void main(String[] args) {
		
		/*
		 * 
		 *   equals() 예제 1
		 * 
		 */
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1 == str2); // "==" : 메모리 주소가 동일한 지 확인 (false 리턴)
		System.out.println(str1.equals(str2)); // String 클래스에서 재정의된 equals() 메서드는 문자열이 같으면 true를 반환
		
		System.out.println("========================");
		
		/*
		 * 
		 *   equals() 예제 2
		 * 
		 */
		
		Student lee = new Student(100, "이순신");
		Student lee2 = lee;
		Student shin = new Student(100, "이순신");
		
		System.out.println(lee == lee2); // true
		System.out.println(lee == shin); // false
		
		// lee 와 shin은 물리적으로 다른 위치에 있지만, 논리적으로는 같은 학생임을 구현해야 한다.
		// -> equals() 메서드 재정의 필요 (학번이 같으면 같은 학생이다.)
		
		System.out.println(lee.equals(shin)); // 재정의하기 전에 equals() 는 물리적 주소 일치 확인 (false 리턴)
		System.out.println(lee.equals(shin)); // 재정의한 후 equals() 메서드는 학번(studentNum) 일치여부 확인 (true 리턴)
		
	}
	
}
