package oop.ch04.v02.objectArray;

public class ObjectCopy2 {

	public static void main(String[] args) {
		
		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];
		
		library[0] = new Book("타백산맥1", "조정래");
		library[1] = new Book("타백산맥2", "조정래");
		library[2] = new Book("타백산맥3", "조정래");
		library[3] = new Book("타백산맥4", "조정래");
		library[4] = new Book("타백산맥5", "조정래");
		
		// 깊은 복사 구현
		copyLibrary[0] = new Book();
		copyLibrary[1] = new Book();
		copyLibrary[2] = new Book();
		copyLibrary[3] = new Book();
		copyLibrary[4] = new Book();
		
		for (Book book : copyLibrary) {
			book.showBookInfo();
		}
		
		System.out.println("===========================");
		
		for (int i=0; i < library.length; i++) {
			copyLibrary[i].setAuthor(library[i].getAuthor());
			copyLibrary[i].setTitle(library[i].getTitle());
		}
		
		// 복사된 후 원본의 데이터 변경
		library[0].setTitle("나목");
		library[0].setAuthor("박완서");
		
		for (Book book : library) {
			book.showBookInfo();
		}
		
		System.out.println("===========================");
		
		for (Book book : copyLibrary) {
			book.showBookInfo();
		}
		
		/*
		 * 
		 * 깊은 복사 구현 시 원본 데이터를 변경했을 때 복사 배열의 데이터는 변경되지 않은 것 확인 가능
		 * 
		 */
		
	}
	
}
