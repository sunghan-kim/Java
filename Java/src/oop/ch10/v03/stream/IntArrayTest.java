package oop.ch10.v03.stream;

import java.util.Arrays;

public class IntArrayTest {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		
		// 배열의 스트림은 Arrays.stream() 을 사용
		int sum = Arrays.stream(arr).sum();
		int count = (int) Arrays.stream(arr).count();
		
		System.out.println(sum);
		System.out.println(count);
		
		System.out.println("=====================");
		
		/*
		 * reduce() 사용
		 */
		
		System.out.println(Arrays.stream(arr).reduce(0, (a,b) -> a+b)); // 15
		
		
	}

}
