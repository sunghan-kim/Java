package oop.ch08.javaBasicClass.v01.object;

class Book {
	
	String title;
	String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	// toString() �޼��� ������
	@Override
	public String toString() {
		return author + ", " + title;
	}

	
	
}

public class ToStringTest {

	/*
	 * 
	 *   toString() �޼���
	 *   
	 *     - toString() �޼����� ����
	 *     
	 *       getClass().getName() + '@' + Integer.toHexString(hashCode())
	 *       
	 *     - ��ü�� ������ String���� �ٲپ� ����� �� ������
	 *     
	 *     - �ڹ� Ŭ���� �߿��� �̹� ���ǵ� Ŭ������ ����
	 *     
	 *       - ex) String, Integer, Calendar ��
	 *       
	 *     - ���� Ŭ�������� �������Ͽ� ���
	 * 
	 */
	
	public static void main(String[] args) {
		
		Book book = new Book("����", "�ڰ渮");
		System.out.println(book); // �޸� �ּ� ǥ��
		
		String str = new String("����");
		System.out.println(str); // ���ڿ��� ��� (String Ŭ���� �ȿ� toString() �޼��尡 ���ǵǾ� �ֱ� ����)
		System.out.println(str.toString());
		
		/*
		 * 
		 * toString() �޼����� ����
		 * 
		 *   - ��ü�� ������ String ���·� ǥ���ؾ� �� �� ����ϴ� �޼���
		 *   - ��ü�� String ���� ������ �迭�� ��ȯ
		 * 
		 */
		
		System.out.println(book); // toString() �޼��� �������ϸ� �������� ������ ��ȯ�ȴ�.
		
	}
	
}
