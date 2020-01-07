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

	// clone() �޼��� ������
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}

public class CloneTest {

	/*
	 * 
	 *   clone() �޼���
	 *   
	 *     - ��ü�� ���纻�� ����
	 *     - �⺻Ʋ(prototype)���κ��� ���� �Ӽ� ���� ���� ��ü�� ���纻�� ������ �� ����
	 *     
	 *     - ��ü���� ���α׷����� �������п� ����Ǵ� ���ɼ��� �����Ƿ� ������ ��ü�� cloneable �������̽��� ���(����)�ؾ� ��
	 * 
	 */
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Book2 book = new Book2("����", "�ڰ渮");
		
		System.out.println(book);
		
		Book2 book2 = (Book2) book.clone();
		System.out.println(book2); // CloneNotSupportedException : clonable�� �������� �ʾƼ� ���� �߻�
		System.out.println(book2); // Cloneable �������̽��� �����ϸ� clone() �޼��� ���� �۵�
		
	}
	
}
