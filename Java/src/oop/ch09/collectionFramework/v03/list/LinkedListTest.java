package oop.ch09.collectionFramework.v03.list;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		
		LinkedList<String> myList = new LinkedList<String>();
		
		myList.add("A");
		myList.add("B");
		myList.add("C");
		
		System.out.println(myList.toString());
		
		myList.add(1, "D");
		
		System.out.println(myList.toString());
		
		myList.removeFirst();
		
		System.out.println(myList.toString());
		
		myList.removeLast();
		
		System.out.println(myList.toString());
		
		for (int i=0; i < myList.size(); i++) {
			String s = myList.get(i); // Set 인터페이스의 경우에는 인덱스로 데이터를 가져올 수 없다. (순서에 기반하지 않음)
			System.out.println(s);
		}
		
	}
	
}
