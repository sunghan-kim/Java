package oop.ch08.javaBasicClass.v01.object;

class Student2 {
	
	int studentNum;
	String studentName;
	
	public Student2(int studentNum, String studentName) {
		this.studentNum = studentNum;
		this.studentName = studentName;
	}
	
	// hashCode() �޼��� ������
	@Override
	public int hashCode() {
		return studentNum; // equals�� �ɹ����� ��ġ���� Ȯ��
	}
	
}

public class HashCodeTest {

	/*
	 * 
	 *   hashCode() �޼���
	 *   
	 *     - hashCode() �޼����� ��ȯ ��
	 *     
	 *       - �ν��Ͻ��� ����� ����ӽ��� �ּҸ� 10������ ��ȯ
	 *       
	 *     - �� ���� ���� �ٸ� �޸𸮿� ��ġ�� �ν��Ͻ��� �����ϴٴ� ����?
	 *     
	 *       - �������� ���� : equals()�� ��ȯ ���� true
	 *       
	 *       - ������ hashCode ���� ���� : hashCode()�� ��ȯ ���� ����
	 * 
	 */
	
	public static void main(String[] args) {
		
		Object obj = new Object();
		
		System.out.println(obj.hashCode()); // obj �ν��Ͻ��� �ؽ��ڵ� ���� 10������ ��ȯ
		
		System.out.println("==============================");
		
		Student2 lee = new Student2(100, "�̼���");
		Student2 shin = new Student2(100, "�̼���");
		
		System.out.println(lee.hashCode());
		System.out.println(shin.hashCode());
		
		System.out.println("==============================");
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println(i1.equals(i2)); // true
		System.out.println(i1.hashCode()); // 100 (Integer Ŭ�������� hashCode() �޼��带 �ɹ������� ���� ��ȯ�ϵ��� ��������)
		
		// i1�� i2�� �ؽ��ڵ� �� Ȯ�� (���� �ٸ�)
		System.out.println(System.identityHashCode(i1));
		System.out.println(System.identityHashCode(i2));
		
	}
	
}
