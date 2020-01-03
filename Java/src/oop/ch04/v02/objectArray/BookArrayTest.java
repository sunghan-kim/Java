package oop.ch04.v02.objectArray;

public class BookArrayTest {

	public static void main(String[] args) {
		
		Book[] library = new Book[5]; // å(Book)�� 5�� ����� ���� �ƴ϶� ũ�Ⱑ 5�� �迭�� ����� ���̴�.
		
		for (int i=0; i < library.length; i++) {
			System.out.println(library[i]); // null 5���� ��µȴ�.
		}
		
		/*
		 * ���� null���� ��ü�� �ּҰ��� ��� �� �ڸ��̴�.
		 */
		
		// ������ å ��ü�� �־���� �Ѵ�.
		library[0] = new Book("Ÿ����1", "������");
		library[1] = new Book("Ÿ����2", "������");
		library[2] = new Book("Ÿ����3", "������");
		library[3] = new Book("Ÿ����4", "������");
		library[4] = new Book("Ÿ����5", "������");
		
		for (int i=0; i < library.length; i++) {
			System.out.println(library[i]); // �ּҰ� 5���� ��µȴ�.
		}
		
		// ���� ���
		for (int i=0; i < library.length; i++) {
			library[i].showBookInfo();
		}
		
	}
	
}
