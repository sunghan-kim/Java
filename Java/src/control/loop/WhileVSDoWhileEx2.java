package control.loop;

import java.util.Scanner;

public class WhileVSDoWhileEx2 {

	public static void main(String[] args) {
		
		/*
		 * 
		 * while문 vs do-while 문
		 * 
		 *   - 입력 받은 정수를 모두 더해준다.
		 *   - 입력된 정수가 0이면 반복문을 빠져 나옵니다.
		 * 
		 */
		
		// while 문 사용하여 구현
		
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		int sum = 0;
		
		while(input != 0) {
			
			sum += input;
			
			input = sc.nextInt(); // input을 다시 받아야 한다.
			
		}
		
		System.out.println("sum : " + sum);
		
		sc.close();
		
	}
	
}
