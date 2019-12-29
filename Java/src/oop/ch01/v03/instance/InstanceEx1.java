package oop.ch01.v03.instance;

import oop.ch01.v01.objectAndClass.Student;

public class InstanceEx1 {

	/*
	 * 
	 * 인스턴스
	 * 
	 *   - 클래스로부터 생성된 객체
	 *   - 힙 메모리에 맴버 변수의 크기에 따라 메모리가 생성
	 *   
	 *   - 클래스를 기반으로 new 키워드를 이용하여 여러 개의 인스턴스를 생성
	 * 
	 */
	
	public static void main(String[] args) {
	
		Student studentLee = new Student(); // 인스턴스 생성
		studentLee.studentName = "이순신";
		studentLee.address = "서울";
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student(); // 인스턴스 생성
		studentKim.studentName = "김유신";
		studentKim.address = "경주";
		
		studentKim.showStudentInfo();
		
		/*
		 * new 키워드 사용 시 클래스의 객체가 스택(Stack) 메모리에 할당된다.
		 * 해당 객체의 데이터는 힙(Heap) 메모리에 공간이 할당된다.
		 * 
		 * 지역변수는 함수 사용이 끝나면 스택 메모리 상에서 제거된다.
		 * 힙 메모리의 경우 Java는 gc(garbage collector) 쓰래드가 알아서 정리해준다.
		 * 
		 */
		
		System.out.println(studentLee); // oop.ch01.v01.objectAndClass.Student@4e25154f
		System.out.println(studentKim); // oop.ch01.v01.objectAndClass.Student@70dea4e
		
		/*
		 * oop.ch01.v01.objectAndClass.Student : 클래스의 Full Name 
		 * @4e25154f, @70dea4e : 힙 메모리 주소값 (JVM이 할당한 해시코드 값(가상의 값)), 16진수(4비트로 표현)로 표현
		 * 
		 */
		
		
	}
	
}
