package basic.control;

import java.util.Scanner;

public class ControlQuestion1 {

	/*
	 * 
	 * 제어문 문제 1
	 * 
	 *   - 연산자와 두 수를 변수로 선언한 후 사칙연산이 수행되는 프로그램을 만들기
	 *   - if-else if-else, switch-case 두 방식 모두 구현
	 * 
	 */
	
	public static int prog1(String operator, int num1, int num2) {
		
		// if-else 이용 구현
		int result = 0;
		
		if (operator.equals("sum")) {
			result = num1 + num2;
		} else if (operator.equals("sub")) {
			result = num1 - num2;
		} else if (operator.equals("mul")) {
			result = num1 * num2;
		} else if (operator.equals("div")) {
			if (num2 == 0) {
				System.out.println("999: 0으로 나눌 수 없습니다.");
				result = 999;
			} else {
				result = num1 / num2;
			}
		}
		
		return result;
		
	}
	
	public static int prog2(String operator, int num1, int num2) {
		
		// switch-casae 이용 구현
		
		int result = 0;
		
		switch(operator) {
			case "sum":
				result = num1 + num2;
				break;
			case "sub":
				result = num1 - num2;
				break;
			case "mul":
				result = num1 * num2;
				break;
			case "div":
				if (num2 == 0) {
					System.out.println("999: 0으로 나눌 수 없습니다.");
				} else {
					result = num1 / num2;
				}
			default:
				result = 999;
		}
		
		
		return result;
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("연산자 입력(sum, sub, mul, div) : ");
		String operator = sc.next();
		
		System.out.print("첫 번째 숫자 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 숫자 입력 : ");
		int num2 = sc.nextInt();
		
		System.out.print("프로그램 선택(1-if-else, 2-switch-case) : ");
		int prog = sc.nextInt();
		
		int result = 0;
		
		if (prog == 1) {
			result = prog1(operator, num1, num2);
		} else if (prog == 2) {
			result = prog2(operator, num1, num2);
		}
		
		System.out.println("연산 결과는 " + result + "입니다.");
		
		sc.close();
		
	}
	
}
