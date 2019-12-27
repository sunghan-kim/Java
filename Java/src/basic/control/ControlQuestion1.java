package basic.control;

import java.util.Scanner;

public class ControlQuestion1 {

	/*
	 * 
	 * ��� ���� 1
	 * 
	 *   - �����ڿ� �� ���� ������ ������ �� ��Ģ������ ����Ǵ� ���α׷��� �����
	 *   - if-else if-else, switch-case �� ��� ��� ����
	 * 
	 */
	
	public static int prog1(String operator, int num1, int num2) {
		
		// if-else �̿� ����
		int result = 0;
		
		if (operator.equals("sum")) {
			result = num1 + num2;
		} else if (operator.equals("sub")) {
			result = num1 - num2;
		} else if (operator.equals("mul")) {
			result = num1 * num2;
		} else if (operator.equals("div")) {
			if (num2 == 0) {
				System.out.println("999: 0���� ���� �� �����ϴ�.");
				result = 999;
			} else {
				result = num1 / num2;
			}
		}
		
		return result;
		
	}
	
	public static int prog2(String operator, int num1, int num2) {
		
		// switch-casae �̿� ����
		
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
					System.out.println("999: 0���� ���� �� �����ϴ�.");
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
		
		System.out.print("������ �Է�(sum, sub, mul, div) : ");
		String operator = sc.next();
		
		System.out.print("ù ��° ���� �Է� : ");
		int num1 = sc.nextInt();
		
		System.out.print("�� ��° ���� �Է� : ");
		int num2 = sc.nextInt();
		
		System.out.print("���α׷� ����(1-if-else, 2-switch-case) : ");
		int prog = sc.nextInt();
		
		int result = 0;
		
		if (prog == 1) {
			result = prog1(operator, num1, num2);
		} else if (prog == 2) {
			result = prog2(operator, num1, num2);
		}
		
		System.out.println("���� ����� " + result + "�Դϴ�.");
		
		sc.close();
		
	}
	
}
