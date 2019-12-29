package oop.ch01.v03.instance;

import oop.ch01.v01.objectAndClass.Student;

public class InstanceEx1 {

	/*
	 * 
	 * �ν��Ͻ�
	 * 
	 *   - Ŭ�����κ��� ������ ��ü
	 *   - �� �޸𸮿� �ɹ� ������ ũ�⿡ ���� �޸𸮰� ����
	 *   
	 *   - Ŭ������ ������� new Ű���带 �̿��Ͽ� ���� ���� �ν��Ͻ��� ����
	 * 
	 */
	
	public static void main(String[] args) {
	
		Student studentLee = new Student(); // �ν��Ͻ� ����
		studentLee.studentName = "�̼���";
		studentLee.address = "����";
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student(); // �ν��Ͻ� ����
		studentKim.studentName = "������";
		studentKim.address = "����";
		
		studentKim.showStudentInfo();
		
		/*
		 * new Ű���� ��� �� Ŭ������ ��ü�� ����(Stack) �޸𸮿� �Ҵ�ȴ�.
		 * �ش� ��ü�� �����ʹ� ��(Heap) �޸𸮿� ������ �Ҵ�ȴ�.
		 * 
		 * ���������� �Լ� ����� ������ ���� �޸� �󿡼� ���ŵȴ�.
		 * �� �޸��� ��� Java�� gc(garbage collector) �����尡 �˾Ƽ� �������ش�.
		 * 
		 */
		
		System.out.println(studentLee); // oop.ch01.v01.objectAndClass.Student@4e25154f
		System.out.println(studentKim); // oop.ch01.v01.objectAndClass.Student@70dea4e
		
		/*
		 * oop.ch01.v01.objectAndClass.Student : Ŭ������ Full Name 
		 * @4e25154f, @70dea4e : �� �޸� �ּҰ� (JVM�� �Ҵ��� �ؽ��ڵ� ��(������ ��)), 16����(4��Ʈ�� ǥ��)�� ǥ��
		 * 
		 */
		
		
	}
	
}
