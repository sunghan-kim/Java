package oop.ch10.v03.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {

	public static void main(String[] args) {
		
		List<String> sList = new ArrayList<String>();
		
		sList.add("Tomas");
		sList.add("Edward");
		sList.add("Jack");
		
		// Collection 의 스트림은 stream() 메서드를 사용
		Stream<String> stream = sList.stream();
		
		stream.forEach(s -> System.out.print(s + " "));
		
		System.out.println();
		System.out.println("==================");
		
		//stream.forEach(s -> System.out.println(s)); 최종 연산을 사용한 stream은 재사용할 수 없음
		
		// 정렬 기능 : sorted() 중간 연산 사용 (String에 Comparable이 구현되어 있기 때문에 sorted() 사용 가능)
		sList.stream().sorted().forEach(s -> System.out.print(s + " "));
		
		System.out.println();
		System.out.println("==================");
		
		// 이름의 길이 확인
		sList.stream().map(s -> s.length()).forEach(n -> System.out.println(n));
		
	}
	
}
