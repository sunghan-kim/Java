package oop.ch09.collectionFramework.v08.treeSet;

import java.util.Comparator;
import java.util.TreeSet;

class MyCompare implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		return s1.compareTo(s2) * (-1); // �������� ����
	}
	
}

public class ComparatorTest {

	public static void main(String[] args) {
		
		TreeSet<String> treeSet = new TreeSet<String>();
		
		treeSet.add("ȫ�浿");
		treeSet.add("������");
		treeSet.add("�̼���");
		
		for (String str : treeSet) {
			System.out.println(str);
		}
		
		System.out.println("===========================");
		
		/*
		 * 
		 *   String Ŭ�������� Comparable �������̽��� ������ ������������ ���ĵǰ� �Ǿ� �ִ�.
		 *   
		 *    - Comparator �������̽��� ������ Ŭ����(myCompare)�� ����� ������������ ���Ľ�ų �� �ִ�.
		 *    
		 *    - ������ myCompare Ŭ������ TreeSet ��ü ���� �� ������ �ȿ��� ��ü�� �����Ѵ�.
		 * 
		 */
		
		TreeSet<String> treeSet2 = new TreeSet<String>(new MyCompare());
		
		treeSet2.add("ȫ�浿");
		treeSet2.add("������");
		treeSet2.add("�̼���");
		
		for (String str : treeSet2) {
			System.out.println(str);
		}
		
	}
	
}
