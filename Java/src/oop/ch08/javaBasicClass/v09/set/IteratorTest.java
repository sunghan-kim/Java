package oop.ch08.javaBasicClass.v09.set;

import java.util.HashSet;
import java.util.Iterator;

public class IteratorTest {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<String>();
		
		set.add("이순신");
		set.add("김유신");
		set.add("강감찬");
		set.add("이순신"); // 이순신 중복 입력
		
		System.out.println(set.toString()); // Set 인터페이스를 구현한 HashSet은 List 인터페이스 구현 클래스와 달리 순서가 없고, 중복을 허용하지 않는다.
		
		// Iterator 사용
		Iterator<String> ir = set.iterator();
		
		while(ir.hasNext()) {
			System.out.println(ir.next());
		}
		
	}
	
}
