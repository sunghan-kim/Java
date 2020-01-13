package oop.ch09.collectionFramework.v08.treeSet;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		
		TreeSet<String> treeSet = new TreeSet<String>();
		
		treeSet.add("홍길동");
		treeSet.add("강감찬");
		treeSet.add("이순신");
		
		for (String str : treeSet) {
			System.out.println(str); // String 클래스에서 Comparable 인터페이스가 구현되어 있기 때문에 treeSet 객체의 데이터가 정렬(기본-오름차순)되어 있다.
		}
		
		
		
	}
	
}
