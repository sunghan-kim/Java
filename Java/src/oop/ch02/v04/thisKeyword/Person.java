package oop.ch02.v04.thisKeyword;

public class Person {

	String name;
	int age;
	
	// this 키워드를 활용하여 생성자에서 다른 생성자를 호출
	public Person() {
		
		/*
		 * 
		 * 생성자가 하는 일
		 * 
		 *   - 인스턴스의 값을 초기화해줌
		 *   - 인스턴스 생성이 완료되지 않은 상태에서 다른 일을 하면 문제가 발생할 수 있다.
		 *   - 만약 생성자에서 다른 생성자를 호출하기 전에, 호출 대상 생성자에서 초기화하는 맴버 변수에 값을 미리 할당하려고 하면
		 *     에러가 발생한다.
		 * 
		 */
		//age = 10;
		
		this("이름 없음", 1); // this 키워드를 사용하여 아래의 day, month, year를 매개변수로 갖는 생성자 사용 
		// 상위 클래스의 생성자를 사용하기 위해 super 키워드를 활용할 수 있다. (this 키워드와 역할이 비슷하다.)
		

	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void showInfo() {
		System.out.println(name + ", " + age);
	}
	
	public Person getSelf() {
		return this; // 자기 자신의 객체를 반환 할 때 this 키워드 사용
	}
	
}
