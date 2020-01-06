package oop.ch07.question.q1;

import java.io.IOException;

public class SortTest {

	public static void main(String[] args) throws IOException {
		
		System.out.println("정렬방식을 선택하세요.");
		System.out.println("B : BubbleSort");
		System.out.println("H : HeapSort");
		System.out.println("Q : QuickSort");
		char ch = (char) System.in.read();
		
		Sort sort;
		int[] arr = {1,2,3,4,5};
		
		if ( ch == 'B' || ch == 'b' ) {
			sort = new BubbleSort();
			sort.ascending(arr);
			sort.descending(arr);
			sort.description();
		} else if ( ch == 'H' || ch == 'h' ) {
			sort = new HeapSort();
			sort.ascending(arr);
			sort.descending(arr);
			sort.description();
		} else if ( ch == 'Q' || ch == 'q' ) {
			sort = new QuickSort();
			sort.ascending(arr);
			sort.descending(arr);
			sort.description();
		}
		
		
		
		
		
	}
	
}
