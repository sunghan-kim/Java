package oop.ch09.collectionFramework.v08.treeSet;

import java.util.Comparator;
import java.util.TreeSet;

class MyCompare implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		return s1.compareTo(s2) * (-1); // 내림차순 정렬
	}
	
}

public class ComparatorTest {

	public static void main(String[] args) {
		
		TreeSet<String> treeSet = new TreeSet<String>();
		
		treeSet.add("홍길동");
		treeSet.add("강감찬");
		treeSet.add("이순신");
		
		for (String str : treeSet) {
			System.out.println(str);
		}
		
		System.out.println("===========================");
		
		/*
		 * 
		 *   String 클래스에서 Comparable 인터페이스를 구현해 오름차순으로 정렬되게 되어 있다.
		 *   
		 *    - Comparator 인터페이스를 구현한 클래스(myCompare)를 만들어 내림차순으로 정렬시킬 수 있다.
		 *    
		 *    - 생성한 myCompare 클래스를 TreeSet 객체 생성 시 생성자 안에서 객체를 생성한다.
		 * 
		 */
		
		TreeSet<String> treeSet2 = new TreeSet<String>(new MyCompare());
		
		treeSet2.add("홍길동");
		treeSet2.add("강감찬");
		treeSet2.add("이순신");
		
		for (String str : treeSet2) {
			System.out.println(str);
		}
		
	}
	
}
