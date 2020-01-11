package oop.ch08.javaBasicClass.v09.set;

import java.util.HashSet;
import java.util.Iterator;

public class IteratorTest {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<String>();
		
		set.add("�̼���");
		set.add("������");
		set.add("������");
		set.add("�̼���"); // �̼��� �ߺ� �Է�
		
		System.out.println(set.toString()); // Set �������̽��� ������ HashSet�� List �������̽� ���� Ŭ������ �޸� ������ ����, �ߺ��� ������� �ʴ´�.
		
		// Iterator ���
		Iterator<String> ir = set.iterator();
		
		while(ir.hasNext()) {
			System.out.println(ir.next());
		}
		
	}
	
}
