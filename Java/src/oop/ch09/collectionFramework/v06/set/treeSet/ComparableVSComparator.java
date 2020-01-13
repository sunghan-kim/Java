package oop.ch09.collectionFramework.v06.set.treeSet;

public class ComparableVSComparator {

	/*
	 * 
	 *   Comparable 인터페이스와 Comparator 인터페이스
	 *   
	 *     - 정렬 대상이 되는 클래스가 구현해야 하는 인터페이스
	 *     
	 *     - Comparable은 compareTo() 메서드를 구현
	 *     
	 *       - 매개 변수와 객체 자신(this)를 비교
	 *       
	 *     - Comparator는 compare() 메서드를 구현
	 *     
	 *       - 두 개의 매개 변수를 비교
	 *       
	 *       - TreeSet 생성자에 Comparator가 구현된 객체를 매개변수로 전달
	 *       
	 *         TreeSet<Member> treeSet = new TreeSet<Member>(new Member());
	 *         
	 *     - 일반적으로 Comparable을 더 많이 사용
	 *     
	 *     - 이미 Comparable이 구현된 경우, Comparator를 이용하여 다른 정렬 방식을 정의할 수 있음
	 * 
	 */
	
}
