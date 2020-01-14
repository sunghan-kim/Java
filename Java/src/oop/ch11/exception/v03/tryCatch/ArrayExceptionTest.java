package oop.ch11.exception.v03.tryCatch;

public class ArrayExceptionTest {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		try {
			
			for (int i=0; i <= 5; i++) {
				System.out.println(arr[i]); // java.lang.ArrayIndexOutOfBoundsException 발생
			}
			
		} catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println(e);
			System.out.println("예외처리");
			
		}
		
		System.out.println("프로그램 종료");
		
		
	}
	
}
