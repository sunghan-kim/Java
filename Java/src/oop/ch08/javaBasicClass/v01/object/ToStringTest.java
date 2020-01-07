package oop.ch08.javaBasicClass.v01.object;

class Book {
	
	String title;
	String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	// toString() 메서드 재정의
	@Override
	public String toString() {
		return author + ", " + title;
	}

	
	
}

public class ToStringTest {

	/*
	 * 
	 *   toString() 메서드
	 *   
	 *     - toString() 메서드의 원형
	 *     
	 *       getClass().getName() + '@' + Integer.toHexString(hashCode())
	 *       
	 *     - 객체의 정보를 String으로 바꾸어 사용할 때 유용함
	 *     
	 *     - 자바 클래스 중에는 이미 정의된 클래스가 많음
	 *     
	 *       - ex) String, Integer, Calendar 등
	 *       
	 *     - 많은 클래스에서 재정의하여 사용
	 * 
	 */
	
	public static void main(String[] args) {
		
		Book book = new Book("토지", "박경리");
		System.out.println(book); // 메모리 주소 표출
		
		String str = new String("토지");
		System.out.println(str); // 문자열이 출력 (String 클래스 안에 toString() 메서드가 정의되어 있기 때문)
		System.out.println(str.toString());
		
		/*
		 * 
		 * toString() 메서드의 역할
		 * 
		 *   - 객체의 정보를 String 형태로 표현해야 할 때 사용하는 메서드
		 *   - 객체의 String 관련 정보를 배열로 반환
		 * 
		 */
		
		System.out.println(book); // toString() 메서드 재정의하면 재정의한 내용이 반환된다.
		
	}
	
}
