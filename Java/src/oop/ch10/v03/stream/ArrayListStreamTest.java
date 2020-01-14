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
		
		// Collection �� ��Ʈ���� stream() �޼��带 ���
		Stream<String> stream = sList.stream();
		
		stream.forEach(s -> System.out.print(s + " "));
		
		System.out.println();
		System.out.println("==================");
		
		//stream.forEach(s -> System.out.println(s)); ���� ������ ����� stream�� ������ �� ����
		
		// ���� ��� : sorted() �߰� ���� ��� (String�� Comparable�� �����Ǿ� �ֱ� ������ sorted() ��� ����)
		sList.stream().sorted().forEach(s -> System.out.print(s + " "));
		
		System.out.println();
		System.out.println("==================");
		
		// �̸��� ���� Ȯ��
		sList.stream().map(s -> s.length()).forEach(n -> System.out.println(n));
		
	}
	
}
