package control.loop;

import java.util.Scanner;

public class WhileVSDoWhileEx1 {

	public static void main(String[] args) {
		
		/*
		 * 
		 * while문 vs do-while 문
		 * 
		 *   - 입력 받은 정수를 모두 더해준다.
		 *   - 입력된 정수가 0이면 반복문을 빠져 나옵니다.
		 * 
		 */
		
		// do-while 문 사용하여 구현
		Scanner sc = new Scanner(System.in);
		
		int input;
		int sum = 0;
		
		do {
			
			input = sc.nextInt();
			sum += input;
			
		} while (input != 0);
		
		System.out.println("sum : " + sum);
		
		sc.close();
		
	}
	
}
