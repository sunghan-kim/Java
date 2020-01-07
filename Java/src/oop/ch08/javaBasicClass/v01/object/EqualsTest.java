package oop.ch08.javaBasicClass.v01.object;

class Student {
	
	int studentNum;
	String studentName;
	
	public Student(int studentNum, String studentName) {
		this.studentNum = studentNum;
		this.studentName = studentName;
	}

	
	// equals() �޼��� ������
	@Override
	public boolean equals(Object obj) {
		if ( obj instanceof Student ) {
			Student std = (Student) obj;
			if (this.studentNum == std.studentNum) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}
	
	
	
}

public class EqualsTest {

	/*
	 * 
	 *   equals() �޼���
	 *   
	 *     - �� ��ü(�ν��Ͻ�)�� �������� �������� �������� �� ����
	 *     
	 *     - ������ ������ : ���� �ּҸ� ������ ��ü
	 *     - ���� ������ : ���� �й��� �л�, ���� �ֹ� ��ȣ�� �ֹ�
	 *     
	 *     - ���������� �ٸ� �޸𸮿� ��ġ�� ��ü�� �������� �������� �����ϱ� ���� ����ϴ� �޼���
	 * 
	 */
	
	public static void main(String[] args) {
		
		/*
		 * 
		 *   equals() ���� 1
		 * 
		 */
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1 == str2); // "==" : �޸� �ּҰ� ������ �� Ȯ�� (false ����)
		System.out.println(str1.equals(str2)); // String Ŭ�������� �����ǵ� equals() �޼���� ���ڿ��� ������ true�� ��ȯ
		
		System.out.println("========================");
		
		/*
		 * 
		 *   equals() ���� 2
		 * 
		 */
		
		Student lee = new Student(100, "�̼���");
		Student lee2 = lee;
		Student shin = new Student(100, "�̼���");
		
		System.out.println(lee == lee2); // true
		System.out.println(lee == shin); // false
		
		// lee �� shin�� ���������� �ٸ� ��ġ�� ������, �������δ� ���� �л����� �����ؾ� �Ѵ�.
		// -> equals() �޼��� ������ �ʿ� (�й��� ������ ���� �л��̴�.)
		
		System.out.println(lee.equals(shin)); // �������ϱ� ���� equals() �� ������ �ּ� ��ġ Ȯ�� (false ����)
		System.out.println(lee.equals(shin)); // �������� �� equals() �޼���� �й�(studentNum) ��ġ���� Ȯ�� (true ����)
		
	}
	
}
