package oop.ch04.v02.objectArray;

public class ObjectCopy2 {

	public static void main(String[] args) {
		
		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];
		
		library[0] = new Book("Ÿ����1", "������");
		library[1] = new Book("Ÿ����2", "������");
		library[2] = new Book("Ÿ����3", "������");
		library[3] = new Book("Ÿ����4", "������");
		library[4] = new Book("Ÿ����5", "������");
		
		// ���� ���� ����
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
		
		// ����� �� ������ ������ ����
		library[0].setTitle("����");
		library[0].setAuthor("�ڿϼ�");
		
		for (Book book : library) {
			book.showBookInfo();
		}
		
		System.out.println("===========================");
		
		for (Book book : copyLibrary) {
			book.showBookInfo();
		}
		
		/*
		 * 
		 * ���� ���� ���� �� ���� �����͸� �������� �� ���� �迭�� �����ʹ� ������� ���� �� Ȯ�� ����
		 * 
		 */
		
	}
	
}
