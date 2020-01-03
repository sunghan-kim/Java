package oop.ch04.v02.objectArray;

public class ObjectCopy {

	public static void main(String[] args) {
		
		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];
		
		library[0] = new Book("Ÿ����1", "������");
		library[1] = new Book("Ÿ����2", "������");
		library[2] = new Book("Ÿ����3", "������");
		library[3] = new Book("Ÿ����4", "������");
		library[4] = new Book("Ÿ����5", "������");
		
		// ���� �ڷ��� �迭 ����
		System.arraycopy(library, 0, copyLibrary, 0, 5);
		
		for (Book book : copyLibrary) { // ���� for��
			book.showBookInfo(); // ���� �ڷ��� �迭�� ����� ����� �� Ȯ��
		}
		
		System.out.println("===========================");
		
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
		 * -> ���� �迭 �����͸� �����ߴ� �� ���� �迭�� �����͵� ����� �� Ȯ�� (���� ����)
		 * 
		 * "���� ����"�� ��� ������ �ν��Ͻ��� �����Ǵ� ���� �ƴ϶� �ּҸ� ����� ���̴�.
		 * ���� ������ ���� �迭�� �Ȱ��� ���� �ٶ󺸰� �ȴ�.
		 * 
		 * "���� ����"�� ��� arraycopy() �޼��带 ����ϴ� ��� ��ü�� ������ �����Ͽ� ���� �־���� �Ѵ�.
		 * 
		 * 
		 */
		
	}
	
}
