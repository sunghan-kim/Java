package oop.ch04.v02.objectArray;

public class BookArrayTest {

	public static void main(String[] args) {
		
		Book[] library = new Book[5]; // 책(Book)이 5권 생기는 것이 아니라 크기가 5인 배열이 생기는 것이다.
		
		for (int i=0; i < library.length; i++) {
			System.out.println(library[i]); // null 5개가 출력된다.
		}
		
		/*
		 * 위의 null들은 객체의 주소값이 들어 갈 자리이다.
		 */
		
		// 각각의 책 객체를 넣어줘야 한다.
		library[0] = new Book("타백산맥1", "조정래");
		library[1] = new Book("타백산맥2", "조정래");
		library[2] = new Book("타백산맥3", "조정래");
		library[3] = new Book("타백산맥4", "조정래");
		library[4] = new Book("타백산맥5", "조정래");
		
		for (int i=0; i < library.length; i++) {
			System.out.println(library[i]); // 주소값 5개가 출력된다.
		}
		
		// 정보 출력
		for (int i=0; i < library.length; i++) {
			library[i].showBookInfo();
		}
		
	}
	
}
