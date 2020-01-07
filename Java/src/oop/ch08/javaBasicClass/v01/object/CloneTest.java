package oop.ch08.javaBasicClass.v01.object;

class Book2 implements Cloneable {
	
	String title;
	String author;
	
	public Book2(String title, String author) {
		this.title = title;
		this.author = author;
	}

	@Override
	public String toString() {
		return author + ", " + title;
	}

	// clone() 메서드 재정의
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}

public class CloneTest {

	/*
	 * 
	 *   clone() 메서드
	 *   
	 *     - 객체의 복사본을 만듦
	 *     - 기본틀(prototype)으로부터 같은 속성 값을 가진 객체의 복사본을 생성할 수 있음
	 *     
	 *     - 객체지향 프로그래밍의 정보은닉에 위배되는 가능성이 있으므로 복제할 객체는 cloneable 인터페이스를 명시(구현)해야 함
	 * 
	 */
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Book2 book = new Book2("토지", "박경리");
		
		System.out.println(book);
		
		Book2 book2 = (Book2) book.clone();
		System.out.println(book2); // CloneNotSupportedException : clonable을 지정하지 않아서 에러 발생
		System.out.println(book2); // Cloneable 인터페이스를 구현하면 clone() 메서드 정상 작동
		
	}
	
}
