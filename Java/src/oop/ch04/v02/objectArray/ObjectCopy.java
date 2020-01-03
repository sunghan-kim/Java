package oop.ch04.v02.objectArray;

public class ObjectCopy {

	public static void main(String[] args) {
		
		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];
		
		library[0] = new Book("타백산맥1", "조정래");
		library[1] = new Book("타백산맥2", "조정래");
		library[2] = new Book("타백산맥3", "조정래");
		library[3] = new Book("타백산맥4", "조정래");
		library[4] = new Book("타백산맥5", "조정래");
		
		// 참조 자료형 배열 복사
		System.arraycopy(library, 0, copyLibrary, 0, 5);
		
		for (Book book : copyLibrary) { // 향상된 for문
			book.showBookInfo(); // 참조 자료형 배열이 제대로 복사된 것 확인
		}
		
		System.out.println("===========================");
		
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
		 * -> 원본 배열 데이터를 수정했는 데 복사 배열의 데이터도 변경된 것 확인 (얕은 복사)
		 * 
		 * "얕은 복사"의 경우 실제로 인스턴스가 생성되는 것이 아니라 주소만 복사된 것이다.
		 * 따라서 원본과 복사 배열이 똑같은 곳을 바라보게 된다.
		 * 
		 * "깊은 복사"의 경우 arraycopy() 메서드를 사용하는 대신 객체를 일일이 생성하여 값을 넣어줘야 한다.
		 * 
		 * 
		 */
		
	}
	
}
