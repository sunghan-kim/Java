package control.loop;

import java.util.Scanner;

public class WhileVSDoWhileEx1 {

	public static void main(String[] args) {
		
		/*
		 * 
		 * while�� vs do-while ��
		 * 
		 *   - �Է� ���� ������ ��� �����ش�.
		 *   - �Էµ� ������ 0�̸� �ݺ����� ���� ���ɴϴ�.
		 * 
		 */
		
		// do-while �� ����Ͽ� ����
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
