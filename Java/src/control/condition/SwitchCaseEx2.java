package control.condition;

import java.util.Scanner;

public class SwitchCaseEx2 {

	public static void main(String[] args) {
		
		/*
		 * 
		 * switch-case �� ����
		 * 
		 *   �� ���� ���� �Ѵ� ��¥ ���� day ���� ������ ��� (2���� 28�Ϸ� �Ѵ�.)
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� �Է� : ");
		
		int month = sc.nextInt();
		
		int dayCnt = 0;
		
		switch(month) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12: // ���� ������ ������ ���� ���� ���� �̿� ���� �� �� �ִ�.
				dayCnt = 31;
				break;
			case 2:
				dayCnt = 28;
				break;
			case 4: case 6: case 9: case 11:
				dayCnt = 30;
				break;			
			default:
				System.out.println("Error");
				
		}
		
		System.out.println(month + "���� " + dayCnt + "�� �Դϴ�.");
		
		sc.close();
		
		
	}
	
}
