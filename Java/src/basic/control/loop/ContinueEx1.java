package basic.control.loop;

public class ContinueEx1 {

	public static void main(String[] args) {
		
		
		/*
		 * 
		 * continue 문
		 * 
		 *   - 반복의 수행 중 조건문과 조건이 맞는 경우 이후 블록 내부의 다른 수행문을 수행하지 않음
		 * 
		 */
		
		/*
		 * 1~100 중 3의 배수만 출력하는 로직 구현
		 * 
		 */
		
		for (int num = 1; num <= 100; num++) {
			
			if (num % 3 == 0) {
				System.out.println(num);
			}
			
		}
		
		System.out.println();
		
		for (int num = 1; num <= 100; num++) {
			
			if (num % 3 != 0) continue; // continue 사용
			
			System.out.println(num);
			
		}
		
		
		
	}
	
}
