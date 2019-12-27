package control.condition;

import java.util.Scanner;

public class SwitchCaseEx1 {

	public static void main(String[] args) {
		
		/*
		 * 
		 * switch-case ��
		 * 
		 *   - ������ ����, ���ڿ� ������ �� ���� ���� ���� ����� �޶����� ���
		 *     if-else if-else �� ���� �ǹ̷� ����
		 *     
		 *   - case �� ��� �� break�� �� ����� �Ѵ�.
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int rank = sc.nextInt();
		String medalColor = "";
		
		
		switch(rank) {
			case 1: 
				medalColor = "G";
				break; // break�� ������� ������ case 1 �� �����Կ��� �ұ��ϰ� case 2, case 3 �� ��� ����ȴ�.
			case 2: 
				medalColor = "S";
				break;
			case 3: 
				medalColor = "B";
				break;
			default:
				medalColor = "A";
		}
		
		System.out.println("���� : "  + rank);
		System.out.println("�Ŵ� ���� : "  + medalColor);
		
		sc.close();
		
		
		/*
		 * 
		 * java 7 ���ʹ� ���ڿ��� �������� ��� ������ ����.
		 * 
		 */
		
		 
		
	}
	
}
