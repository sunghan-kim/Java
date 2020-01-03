package oop.ch04.v04.arrayList;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList(); // ���ʸ��� �������� ������ ��� ��ü�� ����� �� �ִ�. �׷��� ��Ҹ� ������ �� "����ȯ"�� �ؾ� �Ѵ�.
		
		ArrayList<String> list2 = new ArrayList<String>(); // ���ʸ��� String���� �����ϸ� String ��ü�� ����� �� �ִ�. ��Ҹ� ������ �� ����ȯ�� �ʿ� ����.
		
		list2.add("aaa"); // add : ArrayList�� ������ ����
		list2.add("bbb");
		list2.add("ccc");
		
		for (int i=0; i < list2.size(); i++) { // �迭�� length ��� size()�� ���
			
			String str = list2.get(i); // get() : ArrayList�� ������ ��������
			System.out.println(str);
			
		}
		
		System.out.println("===============");
		
		for (String str : list2) {
			System.out.println(str);
		}
		
		/*
		 * 
		 * �迭�� length VS ArrayList�� size
		 * 
		 *   - �迭�� length�� �迭�� ��� ���Ұ� �Ҵ���� �ʾҴ���, �迭 ��ü ���� �� ������ �迭�� ũ�Ⱑ ��ȯ�ȴ�.
		 *   - ArrayList�� size�� ��� ���� �߰��� ������ ��ȯ�Ѵ�.
		 * 
		 */
		
		System.out.println("===============");
		System.out.println("===============");
		
		// ���ʸ��� �������� ���� ArrayList(list) ���
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		
		for (int i=0; i < list.size(); i++) {
			String str = (String) list.get(i); // ����ȯ �ʿ�
			System.out.println(str);
		}
		
		System.out.println("===============");
		
		for (Object str : list) { // Object Ŭ������ ��� Ŭ������ �ֻ��� Ŭ����
			System.out.println(str);
		}
		
	}
	
}
