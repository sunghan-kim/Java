package oop.ch02.v04.thisKeyword;

public class PersonTest {

	public static void main(String[] args) {
		
		Person personNoname = new Person();
		
		personNoname.showInfo();
		
		Person personLee = new Person("�̼���", 40);
		
		personLee.showInfo();	
		
		
		
		Person p = personLee.getSelf();
		
		System.out.println(personLee); // oop.ch02.v04.thisKeyword.Person@4e25154f
		System.out.println(p);		   // oop.ch02.v04.thisKeyword.Person@4e25154f
									   // -> �� ��ü�� �ּҰ� �����ϴ�!
		
	}
	
}
