package oop.ch04.v04.arrayList;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList(); // 제너릭을 지정하지 않으면 모든 객체를 사용할 수 있다. 그러나 요소를 꺼내올 때 "형변환"을 해야 한다.
		
		ArrayList<String> list2 = new ArrayList<String>(); // 제너릭을 String으로 지정하면 String 객체를 사용할 수 있다. 요소를 꺼내올 때 형변환이 필요 없다.
		
		list2.add("aaa"); // add : ArrayList에 데이터 삽입
		list2.add("bbb");
		list2.add("ccc");
		
		for (int i=0; i < list2.size(); i++) { // 배열의 length 대신 size()를 사용
			
			String str = list2.get(i); // get() : ArrayList의 데이터 가져오기
			System.out.println(str);
			
		}
		
		System.out.println("===============");
		
		for (String str : list2) {
			System.out.println(str);
		}
		
		/*
		 * 
		 * 배열의 length VS ArrayList의 size
		 * 
		 *   - 배열의 length는 배열의 모든 원소가 할당되지 않았더라도, 배열 객체 생성 시 지정한 배열의 크기가 반환된다.
		 *   - ArrayList의 size의 경우 값이 추가된 갯수를 반환한다.
		 * 
		 */
		
		System.out.println("===============");
		System.out.println("===============");
		
		// 제너릭을 지정하지 않은 ArrayList(list) 사용
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		
		for (int i=0; i < list.size(); i++) {
			String str = (String) list.get(i); // 형변환 필요
			System.out.println(str);
		}
		
		System.out.println("===============");
		
		for (Object str : list) { // Object 클래스는 모든 클래스의 최상위 클래스
			System.out.println(str);
		}
		
	}
	
}
