package oop.ch04.v01.array;

public class ArrayQuestion {

	/*
	 * 
	 * 배열 문제
	 * 
	 *   - 문자 배열을 생성하고 출력
	 *   - 대문자를 A-Z까지 배열에 저장하고 이를 다시 출력하는 프로그램 작성
	 * 
	 */
	
	public static void main(String[] args) {
		
		char[] alphabets = new char[26];
		
		char ch = 'A';
		
		for (int i=0; i < alphabets.length; i++) {
			
			// 문자도 정수로 표현 가능 (A에 1을 더해 B를 만들 수 있다.)
			alphabets[i] = ch++; // ch를 할당한 다음 1을 더한다.
			
		}
		
		for (int i=0; i < alphabets.length; i++) {
			System.out.println(alphabets[i] + ", " + (int)alphabets[i]);
		}
		
	}
	
}
