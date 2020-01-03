package oop.ch04.v02.objectArray;

public class ArrayCopy {

	public static void main(String[] args) {
		
		int[] arr1 = {10, 20, 30, 40, 50}; // 20bytes(5 x 4bytes) 할당 (기본 자료형 배열)
		int[] arr2 = {1, 2, 3, 4, 5}; // 20bytes(5 x 4bytes) 할당 (기본 자료형 배열)
		
		// 배열 복사 : System.arraycopy() 메서드 이용
		System.arraycopy(arr1, 0, arr2, 1, 3); // System.arraycopy(어떤 배열 객체로부터, 몇 번째 인덱스부터, 어떤 배열 객체로, 몇 번째 인덱스부터, 몇 개를)
		
		for (int i=0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
	}
	
}
